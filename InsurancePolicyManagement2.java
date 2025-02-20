import java.util.*;

class Policy implements Comparable<Policy> {
    String policyNumber;
    String holderName;
    Date expiryDate;
    String coverageType;
    int premiumAmount;

    Policy(String policyNumber, String holderName, Date expiryDate, String coverageType, int premiumAmount) {
        this.policyNumber = policyNumber;
        this.holderName = holderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    public int compareTo(Policy other) {
        return this.expiryDate.compareTo(other.expiryDate);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Policy) {
            return this.policyNumber.equals(((Policy) obj).policyNumber);
        }
        return false;
    }

    public int hashCode() {
        int hash = 0;
        for (char c : policyNumber.toCharArray()) {
            hash = hash * 31 + c;
        }
        return hash;
    }
}

class InsurancePolicyManagement {
    Set<Policy> hashSet = new HashSet<>();
    Set<Policy> linkedHashSet = new LinkedHashSet<>();
    TreeSet<Policy> treeSet = new TreeSet<>();

    void addPolicy(Policy policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }

    boolean containsPolicy(String policyNumber) {
        for (Policy policy : hashSet) {
            if (policy.policyNumber.equals(policyNumber)) {
                return true;
            }
        }
        return false;
    }

    void removePolicy(String policyNumber) {
        Iterator<Policy> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().policyNumber.equals(policyNumber)) {
                iterator.remove();
            }
        }

        Iterator<Policy> linkedIterator = linkedHashSet.iterator();
        while (linkedIterator.hasNext()) {
            if (linkedIterator.next().policyNumber.equals(policyNumber)) {
                linkedIterator.remove();
            }
        }

        Iterator<Policy> treeIterator = treeSet.iterator();
        while (treeIterator.hasNext()) {
            if (treeIterator.next().policyNumber.equals(policyNumber)) {
                treeIterator.remove();
            }
        }
    }

    List<Policy> getExpiringSoon(Date currentDate) {
        List<Policy> result = new ArrayList<>();
        for (Policy policy : treeSet) {
            if (policy.expiryDate.before(new Date(currentDate.getTime() + 30L * 24 * 60 * 60 * 1000))) {
                result.add(policy);
            }
        }
        return result;
    }

    List<Policy> getPoliciesByCoverage(String coverageType) {
        List<Policy> result = new ArrayList<>();
        for (Policy policy : hashSet) {
            if (policy.coverageType.equals(coverageType)) {
                result.add(policy);
            }
        }
        return result;
    }

    Set<Policy> getDuplicatePolicies() {
        Set<Policy> duplicates = new HashSet<>();
        Set<String> seenNumbers = new HashSet<>();
        for (Policy policy : hashSet) {
            if (!seenNumbers.add(policy.policyNumber)) {
                duplicates.add(policy);
            }
        }
        return duplicates;
    }

    void comparePerformance(Policy policy) {
        long start1 = System.nanoTime();
        hashSet.add(policy);
        long end1 = System.nanoTime();
        System.out.println("HashSet Add Time: " + (end1 - start1));

        long start2 = System.nanoTime();
        linkedHashSet.add(policy);
        long end2 = System.nanoTime();
        System.out.println("LinkedHashSet Add Time: " + (end2 - start2));

        long start3 = System.nanoTime();
        treeSet.add(policy);
        long end3 = System.nanoTime();
        System.out.println("TreeSet Add Time: " + (end3 - start3));

        long start4 = System.nanoTime();
        hashSet.remove(policy);
        long end4 = System.nanoTime();
        System.out.println("HashSet Remove Time: " + (end4 - start4));

        long start5 = System.nanoTime();
        linkedHashSet.remove(policy);
        long end5 = System.nanoTime();
        System.out.println("LinkedHashSet Remove Time: " + (end5 - start5));

        long start6 = System.nanoTime();
        treeSet.remove(policy);
        long end6 = System.nanoTime();
        System.out.println("TreeSet Remove Time: " + (end6 - start6));
    }

    public static void main(String[] args) {
        InsurancePolicyManagement system = new InsurancePolicyManagement();
        Date expiry1 = new Date(System.currentTimeMillis() + 20L * 24 * 60 * 60 * 1000);
        Date expiry2 = new Date(System.currentTimeMillis() + 40L * 24 * 60 * 60 * 1000);
        Date expiry3 = new Date(System.currentTimeMillis() + 10L * 24 * 60 * 60 * 1000);

        Policy policy1 = new Policy("P1001", "John Doe", expiry1, "Health", 5000);
        Policy policy2 = new Policy("P1002", "Jane Smith", expiry2, "Auto", 6000);
        Policy policy3 = new Policy("P1003", "Alice Brown", expiry3, "Home", 7000);
        Policy policy4 = new Policy("P1001", "John Doe", expiry1, "Health", 5000);

        system.addPolicy(policy1);
        system.addPolicy(policy2);
        system.addPolicy(policy3);
        system.addPolicy(policy4);

        System.out.println("Expiring Soon:");
        List<Policy> expiringSoon = system.getExpiringSoon(new Date());
        for (Policy p : expiringSoon) {
            System.out.println(p.policyNumber);
        }

        System.out.println("Policies by Coverage Type (Health):");
        List<Policy> healthPolicies = system.getPoliciesByCoverage("Health");
        for (Policy p : healthPolicies) {
            System.out.println(p.policyNumber);
        }

        System.out.println("Duplicate Policies:");
        Set<Policy> duplicates = system.getDuplicatePolicies();
        for (Policy p : duplicates) {
            System.out.println(p.policyNumber);
        }

        system.comparePerformance(policy1);
    }
}

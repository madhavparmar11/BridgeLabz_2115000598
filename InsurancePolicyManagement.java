import java.util.*;

class Policy {
    int number;
    String holder;
    int expiry;
    String type;
    int premium;

    Policy(int number, String holder, int expiry, String type, int premium) {
        this.number = number;
        this.holder = holder;
        this.expiry = expiry;
        this.type = type;
        this.premium = premium;
    }
}

public class InsurancePolicySystem {
    HashMap<Integer, Policy> hashMap = new HashMap<>();
    LinkedHashMap<Integer, Policy> linkedHashMap = new LinkedHashMap<>();
    TreeMap<Integer, Policy> treeMap = new TreeMap<>();

    void addPolicy(Policy policy) {
        hashMap.put(policy.number, policy);
        linkedHashMap.put(policy.number, policy);
        treeMap.put(policy.expiry, policy);
    }

    Policy getPolicy(int number) {
        return hashMap.get(number);
    }

    List<Policy> getExpiringPolicies(int days) {
        List<Policy> result = new ArrayList<>();
        for (Policy p : treeMap.values()) {
            if (p.expiry <= days) result.add(p);
        }
        return result;
    }

    List<Policy> getPoliciesByHolder(String holder) {
        List<Policy> result = new ArrayList<>();
        for (Policy p : hashMap.values()) {
            if (p.holder.equals(holder)) result.add(p);
        }
        return result;
    }

    void removeExpiredPolicies(int currentDate) {
        Iterator<Map.Entry<Integer, Policy>> it = treeMap.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().expiry < currentDate) it.remove();
        }
    }

    public static void main(String[] args) {
        InsurancePolicySystem system = new InsurancePolicySystem();
        system.addPolicy(new Policy(1, "John", 15, "Health", 5000));
        system.addPolicy(new Policy(2, "Alice", 40, "Auto", 3000));
        system.getExpiringPolicies(30);
    }
}

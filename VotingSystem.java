import java.util.*;

public class VotingSystem {
    HashMap<String, Integer> votes = new HashMap<>();
    LinkedHashMap<String, Integer> orderedVotes = new LinkedHashMap<>();
    TreeMap<String, Integer> sortedVotes = new TreeMap<>();

    void vote(String candidate) {
        votes.put(candidate, votes.getOrDefault(candidate, 0) + 1);
        orderedVotes.put(candidate, votes.get(candidate));
        sortedVotes.put(candidate, votes.get(candidate));
    }

    public static void main(String[] args) {
        VotingSystem system = new VotingSystem();
        system.vote("Alice");
        system.vote("Bob");
        system.vote("Alice");
        System.out.println(system.sortedVotes);
    }
}

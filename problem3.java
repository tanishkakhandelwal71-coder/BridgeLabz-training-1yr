import java.util.*;

public class VotingSystem {
    public static void main(String[] args) {
        Map<String, Integer> votes = new HashMap<>();

        // Voting process
        castVote(votes, "Aman");
        castVote(votes, "Riya");
        castVote(votes, "Aman");
        castVote(votes, "Karan");
        castVote(votes, "Riya");
        castVote(votes, "Aman");

        // Print all results
        System.out.println("Vote Count:");
        for (Map.Entry<String, Integer> entry : votes.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Find winner
        String winner = "";
        int maxVotes = 0;

        for (Map.Entry<String, Integer> entry : votes.entrySet()) {
            if (entry.getValue() > maxVotes) {
                maxVotes = entry.getValue();
                winner = entry.getKey();
            }
        }

        System.out.println("Winner: " + winner + " with " + maxVotes + " votes");
    }

    public static void castVote(Map<String, Integer> votes, String candidate) {
        votes.put(candidate, votes.getOrDefault(candidate, 0) + 1);
    }
}
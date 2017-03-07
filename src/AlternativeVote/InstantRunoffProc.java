package AlternativeVote;


import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.Map;
import java.util.TreeSet;
import java.util.TreeMap;

/**
 * ALL CREDIT goes to Scot Drysdale, this is not my own work but merely to be used for analysis
 * 
 * Runs an instant runoff election.
 * In an instant runoff election each voter submits a list of candidates,
 * in order of preference.  The first name on the list is the voter's 
 * first choice, the second the voter's second choice, etc.  The voter 
 * need not list all of the candidates.
 * 
 * The election is conducted in rounds.  Each voter's first choice is
 * tallied, and the candidate with the fewest first-place votes is 
 * eliminated.  (If there is a tie one of the lowest vote-getters is chosen 
 * at random to be eliminated.)  In each round the voter's top choice 
 * amongst the remaining candidates gets that voter's vote for that round.
 * If no current candidate is on a voter's list that voter casts no vote
 * for this round.
 * 
 * The process ends when there is a single candidate left, who is declared
 * the winner.
 * 
 * This version is written in a procedural style, with lots of static methods.
 * 
 * @author Scot Drysdale
 */
public class InstantRunoffProc {
	
	private static boolean debugOn = true;    // Print debugging output?
	

	/**
	 * Creates a set of candidate names.  A candidate is someone who appears
	 * on at least one ballot.
	 * @param ballots the set of ballots
	 * @return the set of candidate names
	 */
	public static Set<String> getInitialCandidates(List<List<String>> ballots) {
		Set<String> candidateSet = new TreeSet<String>();
		
		// Add all names on all ballots to the set.  Adding a candidate who
		// is already in the set does not change the set.
		for(List<String> ballot : ballots)
			if(ballot.size() > 0)
				candidateSet.add(ballot.get(0));  
		
		return candidateSet;
	}
	
	/**
	 * Counts the number of votes that each candidate gets.  Only current
	 * candidates can receive votes.
	 * @param candidates the current list of candidates
	 * @param ballots a set of lists of voter preferences
	 * @return the vote tally for each candidate
	 */
	public static Map<String, Integer> countVotes(Set<String> candidates, 
			List<List<String>> ballots) {
		Map<String, Integer> voteTally = new TreeMap<String, Integer>();
		
		// Set up an entry for each current candidate with no votes.
		for(String candidate : candidates)
			voteTally.put(candidate, 0);
	  
		// Tally up top choice on each ballot
		for(List<String> ballot : ballots) {
			String topChoice = getTopChoice(ballot, candidates);
			if(topChoice != null) {
				int currentTally = voteTally.get(topChoice);
				voteTally.put(topChoice,  currentTally + 1);
			}
		}
		return voteTally;	
	}
	
	/**
	 * Finds and returns the top choice among the remaining candidates.
	 * @param ballot a voter's ballot (preferential list of candidates).
	 * @param candidates the current set of candidates
	 * @return name of top choice in candidates.
	 */
	public static String getTopChoice(List<String> ballot, Set<String> candidates) {
		Iterator<String> iter = ballot.iterator();
		while(iter.hasNext()) {
			String candidate = iter.next();
			if(candidates.contains(candidate))
				return candidate;
		}
		return null;  // None of the candidates on ballot were in candidates
	}
	
	/**
	 * Finds the candidates with the fewest votes.
	 * @param candidates the current list of candidates
	 * @param voteTally a map from candidates to votes
	 * @return a list of candidates with the fewest votes.
	 */
	public static ArrayList<String> getLosers(Set<String> candidates, 
			Map<String, Integer> voteTally) {
		ArrayList<String> loserList = new ArrayList<String>();
		int minTally = Integer.MAX_VALUE;  // Bigger than any possible vote count
		
		for(String candidate : voteTally.keySet()) {
			int candidateTally = voteTally.get(candidate);
			if(candidateTally < minTally) {  // Found new loser?
				loserList.clear();    
				loserList.add(candidate);      // Remember new loser
				minTally = candidateTally;			
			}
			else if(candidateTally == minTally)
				loserList.add(candidate);      // Have another with the same low tally
		}
		return loserList;
	}
	
	/**
	 * Picks random item from a list
	 * @list the list to choose from
	 * @return an item chosen randomly from list
	 */
	public static String pickRandomItem(ArrayList<String> list) {
		return list.get((int) (Math.random()*list.size()));
	}
	
	/**
	 * Runs an instant-runoff election
	 * @param ballots the ballots for this election
	 * @return winner of the election
	 */
	public static String runInstantRunoffElection(List<List<String>> ballots) {
		Set<String> candidates = getInitialCandidates(ballots);

		
		// Run rounds until down to a single candidate
		while(candidates.size() > 1) {
			Map<String, Integer> voteTally = countVotes(candidates, ballots);
			String loser = pickRandomItem(getLosers(candidates, voteTally));
			candidates.remove(loser);
			
			if(debugOn) {
				System.out.println("Vote tally:\n" + voteTally);
				System.out.println("Loser: " + loser);
			}
		}
		
		if(candidates.size() > 0)
		  return candidates.iterator().next(); // Return the surviving candidate
		else
		  return null;
	}

	/**
	 * Test program
	 */
	public static void main(String[] args) {
		List<List<String>> ballots = new ArrayList<List<String>>();
		System.out.println();
		System.out.println("Welcome to the Alternative Vote System!");
		System.out.println("Enter candidate names in order of preference,");
		System.out.println("separated by spaces.  End with a blank line.");
		System.out.println("For example, 'Joe, Tom, Bob, Ted, Ed' is taken as a ballot in order 1,2,3,4,5,");
		System.out.println("Where 1 is a first preference, 2 is a second preference all the way up to 5 candidates");
		System.out.println("Once you have entered all the ballots you require double tap enter");
		System.out.println("The vote tallys will be displayed and the winner will be shown and you will be returned to the main menu");
		System.out.println("Scroll up the console to see where you typed and the results will be below.");
		System.out.println();
		List<String> ballot; 
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a ballot: ");
		String line = in.nextLine();
		while(!line.equals("")) {
			ballot = new ArrayList<String>();
			Scanner inLine = new Scanner(line);
			
			while(inLine.hasNext()) {
				String candidate = inLine.next();
				ballot.add(candidate);
			}
			ballots.add(ballot);
			
			System.out.print("Enter a ballot: ");
			line = in.nextLine();
		}
		System.out.println();
		String winner = runInstantRunoffElection(ballots);
		if (winner != null)
	    System.out.println("The winner of the Alternative Vote election is: " + 
		    winner);
		else
			System.out.println("No valid votes cast");
			System.out.println();
		System.out.println();
	}
}

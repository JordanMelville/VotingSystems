package Borda;

import java.util.ArrayList;

public class BordaImplementation {
	
	public static void main(String[] args) {
		BordaVoteReader vr = new BordaVoteReader();
		vr.voteReader();
		ArrayList<BordaCandidate> candidates = new ArrayList<BordaCandidate>();
		
		BordaCandidate candidate1 = vr.candidate1;
		BordaCandidate candidate2 = vr.candidate2;
		BordaCandidate candidate3 = vr.candidate3;
		BordaCandidate candidate4 = vr.candidate4;
		BordaCandidate candidate5 = vr.candidate5;
		
		candidates.add(candidate1);
		candidates.add(candidate2);
		candidates.add(candidate3);
		candidates.add(candidate4);
		candidates.add(candidate5);
		
	    System.out.println(candidate1.getBordaScore());
	    System.out.println(candidate2.getBordaScore());
	    System.out.println(candidate3.getBordaScore());
	    System.out.println(candidate4.getBordaScore());
	    System.out.println(candidate5.getBordaScore());
	    
	    
	    int maxScore = Integer.MIN_VALUE;
	    BordaCandidate winningCandidate = candidates.get(0);
	    for(BordaCandidate candidate: candidates) {
	    	if(candidate.getBordaScore() > maxScore) {
	    		maxScore = candidate.getBordaScore();
	    		winningCandidate = candidate;
	    	}
	    }
	    System.out.println("The winning candidate is " + winningCandidate.getCandidateName() + " with a Borda score of " + winningCandidate.getBordaScore());
	    
		}

	}
package FirstPastThePost;

public class FPTPCandidate {

private String candidateName;
private int totalVotes;


public FPTPCandidate(String name, int votes) {
	totalVotes = votes;
	candidateName = name;
	
}


public String getCandidateName() {
	return candidateName;
}

public int getTotalVotes() {
	return totalVotes;
}


}

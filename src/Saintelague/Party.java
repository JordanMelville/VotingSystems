package Saintelague;

public class Party {

private String partyName;
private int totalVotes;
private int totalSeats;

public Party(String name, int votes) {
	totalVotes = votes;
	partyName = name;
	
}

public void addSeat() {
	totalSeats++;
}

// formula for calculating the quotients
public Double Quotient() {
	return (double) (totalVotes /(2 * totalSeats + 1));
}

public Double modifiedQuotient() {
	return (double) (totalVotes / 1.4);
}

public String partyName() {
	return partyName;
}

public int totalVotes() {
	return totalVotes;
}

public int totalSeats() {
	return totalSeats;
	
}
public String printPartyData() {
	return partyName + " Votes " + Integer.toString(totalVotes) + " Seats " + Integer.toString(totalSeats);
}

}

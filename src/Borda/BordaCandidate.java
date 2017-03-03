package Borda;
public class BordaCandidate {

private String candidateName;
private int firstPreference;
private int secondPreference;
private int thirdPreference;
private int fourthPreference;
private int fifthPreference;
	
public BordaCandidate(String name) {
	candidateName = name;
}

public String getCandidateName() {
	return candidateName;
}
public void addFirstPref() {
	firstPreference++;
}

public void addSecondPref() {
	secondPreference++;
}

public void addThirdPref() {
	thirdPreference++;
}

public void addFourthPref() {
	fourthPreference++;
}

public void addFifthPref() {
	fifthPreference++;
}

public int getFirstPreference() {
	return firstPreference;
}

public int getSecondPreference() {
	return secondPreference;
	
}
public int getThirdPreference() {
	return thirdPreference;
}

public int getFourthPreference() {
	return fourthPreference;
}


public int getBordaScore() {
	return (5 * firstPreference)  + (4 * secondPreference) + (3 * thirdPreference) + (2 * fourthPreference) + (1 * fifthPreference);
	
}

}

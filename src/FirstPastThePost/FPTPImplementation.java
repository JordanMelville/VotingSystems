package FirstPastThePost;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class FPTPImplementation {
	
private ArrayList<FPTPCandidate> candidateList = new ArrayList<FPTPCandidate>();


public void addaCandidate(FPTPCandidate candidate) {
	candidateList.add(candidate);
}

public static void main(String[] args) throws IOException{
	// set up an instance of fptp and call the relevant methods to read from file
	// then calculate the winner of the seat.
	FPTPImplementation fptp = new FPTPImplementation();
    BufferedReader breader = new BufferedReader(new InputStreamReader(System.in));
	System.out.println();
    System.out.println("Welcome to the First Past the Post System!");
    System.out.println("There are four different election results you can choose from.");
    System.out.println("These are represented as files in this system and the names are as follows.");
    System.out.println("FPTPElection1.txt");
    System.out.println("FPTPElection2.txt");
    System.out.println("FPTPElection3.txt");
    System.out.println("FPTPElection4.txt");
    System.out.println("To load the election results for any of these files type the following.");
    System.out.println("Either 'Load1', 'Load2', 'Load3', 'Load4'.");
    System.out.println("Type 'exit' if you wish to terminate the program.");
	
    while(true) {
		String command = "";
		
		command = breader.readLine();
		
		if(command.equals("exit")){
			break;
		}
		if(command.equals("Load1")){
			System.out.println();
			fptp.LoadVotingData("FPTPElection1.txt");
			break;
		}
		if(command.equals("Load2")) {
			System.out.println();
			fptp.LoadVotingData("FPTPElection2.txt");
			break;
		}
		if(command.equals("Load3")) {
			System.out.println();
			fptp.LoadVotingData("FPTPElection3.txt");
			break;
		}
		if(command.equals("Load4")) {
			System.out.println();
			fptp.LoadVotingData("FPTPElection4.txt");
			break;
		}
	
    }
	fptp.LoadVotingData("testingData.txt");
	fptp.calculateWinnerVotes();
	
	}







private void calculateWinnerVotes() {
	    
		FPTPCandidate candidate = candidateList.get(0);
		for(FPTPCandidate nextCandidate: candidateList) {
			System.out.println(nextCandidate.getCandidateName() + "'s Votes: " + nextCandidate.getTotalVotes());
		}
		
		for(FPTPCandidate adjacentCandidate: candidateList) {
			// iterate through to find the candidate the most amount of votes.
			if(adjacentCandidate.getTotalVotes() > candidate.getTotalVotes()) {
				candidate = adjacentCandidate;
			}
			
			
		}
		System.out.println();
		System.out.println("The winner with the most votes is " + candidate.getCandidateName() + ".");
		}
		
		
	



// load in data and create party data to be then used for calculating seats
public void LoadVotingData(String file) {
	Scanner sc;
	try{
		sc = new Scanner(new File(file));
		
		while(sc.hasNextLine()){
			String line = sc.nextLine();
			Scanner scanLine = new Scanner(line);
			String candidateName = scanLine.next();
			int votes = scanLine.nextInt();
			FPTPCandidate newCandidate = new FPTPCandidate(candidateName, votes);
			this.addaCandidate(newCandidate);
			}
		} catch (FileNotFoundException ex) {
			System.out.println(ex);
	} 
	}


 
}

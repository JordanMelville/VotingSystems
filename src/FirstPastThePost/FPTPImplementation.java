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
    System.out.println();
    System.out.println("FPTPElection1.txt");
    System.out.println("FPTPElection2.txt");
    System.out.println("FPTPElection3.txt");
    System.out.println("FPTPElection4.txt");
    System.out.println();
    System.out.println("To load the election results for any of these files type the following.");
    System.out.println("Either 'Load1', 'Load2', 'Load3', 'Load4'.");
    System.out.println("Type 'exit' if you wish to terminate the program.");
    System.out.println("Once you have typed your load command the results are printed and then we are returned to the main menu.");
    System.out.println("To see the results if they are printed off the screen, scroll up the console to see where you typed and the results with be below.");
    System.out.println();
	
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
		if(command.equals("Help")) {
			System.out.println();
			System.out.println("The files that contain the data for these elections can be found underneath the class packages.");
			System.out.println("You can edit these files but they must remain in the very same format.");
			System.out.println("The data in these files are represented for example as the following sample election from election file 1.");
			System.out.println();
			System.out.println("Lisa 33678");
			System.out.println("Michael 17151");
			System.out.println("Graham 7129");
			System.out.println("Robert 1221");
			System.out.println("John 318");
			System.out.println("This represents 33678 votes for Lisa, 17151 votes for Michael, 7129 votes for Graham, 1221 votes for Robert and 318 votes for John.");
			System.out.println();
			System.out.println("Once the result has been calculated in the system from these votes, it is displayed as follows: ");
			System.out.println("Lisa's Votes: 33678");
			System.out.println("Michael's Votes: 17151");
			System.out.println("Graham's Votes: 7129");
			System.out.println("Robert's Votes: 1221");
			System.out.println("John's Votes: 318");
			System.out.println();
			System.out.println("The winner with the most votes is Lisa.");
			System.out.println();
			System.out.println("This represents the votes for each candidate in the constituency, and then the winner with the most votes out of each candidate.");
			System.out.println();
			System.out.println("You can edit these files given to you, but as stated they must be in the above format, not case sensitive for the name.");
			System.out.println("Now that you have seen help please feel free to edit these files and use any of the 'Load1', 'Load2', 'Load3', 'Load4' commands to load the files");
			System.out.println("Otherwise, please type 'Exit' to exit the program.");
		}
		if(!command.equals("Exit") | !command.equals("Load1") | !command.equals("Load2") | !command.equals("Load3") | !command.equals("Load4")  | !command.equals("Exit")) {
			System.out.println();
			System.out.println("The command you entered has not been recognized by the system.");
			System.out.println("Please read the information below to get the correct commands.");
			System.out.println();
			System.out.println("Please type a correct command: ");
		}
	
    }
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

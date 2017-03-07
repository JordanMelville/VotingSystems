package Saintelague;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;


public class Saintlagueimplementation {
	
private ArrayList<SainteParty> partyList = new ArrayList<SainteParty>();
private int seats = 63;

public void addParty(SainteParty party) {
	partyList.add(party);
}

public static void main(String[] args) throws IOException{
	Saintlagueimplementation saint = new Saintlagueimplementation();
	BufferedReader breader = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Welcome to the Saint Lague System!");
	System.out.println("There are four different elections that can be run on this system.");
	System.out.println("The data for these elections can be found in the following text files in the program.");
	System.out.println();
	System.out.println("SaintElection1.txt");
	System.out.println("SaintElection2.txt");
	System.out.println("SaintElection3.txt");
	System.out.println("SaintElection4.txt");
	System.out.println();
	System.out.println("To load any of these elections type(without the quotes) 'Load1', 'Load2', 'Load3' or 'Load4'.");
	System.out.println("The results are displayed as: Party Name, The number of votes achieved and the allocated seats to the party.");
	System.out.println("Note these text files will be able to be edited to host your own elections.");
	System.out.println("Press 'Help' if you wish to see a user manual on how to use this system");
	System.out.println("As a lot is printed with help, scroll up the console to read the information as this mini-menu will be re-printed upon loading help.");
	System.out.println("If you wish to exit the system, type(without the quotes) 'exit'.");
	System.out.println("Once you have typed your load command the results are printed and then we are returned to the main menu.");
	System.out.println("To see the results if they are printed off the screen, scroll up the console to see where you typed and the results with be below.");
	while(true) {
		System.out.println();
		String command = "";
		
		command = breader.readLine();
		
		if(command.equals("Exit")){
			break;
		}
		if(command.equals("Load1")){
			saint.LoadVotingData("SaintElection1.txt");
			break;
		}
		if(command.equals("Load2")){
			saint.LoadVotingData("SaintElection2.txt");
			break;
		}
		if(command.equals("Load3")){
			saint.LoadVotingData("SaintElection3.txt");
			break;
		}
		if(command.equals("Load4")){
			saint.LoadVotingData("SaintElection4.txt");
			break;
		}
		if(command.equals("Help")) {
			System.out.println();
			System.out.println("The files that contain the data for these elections can be found underneath the class packages.");
			System.out.println("You can edit these files but they must remain in the very same format.");
			System.out.println("The data in these files are represented for example as the following sample election from election file 1.");
			System.out.println();
			System.out.println("RED 370");
			System.out.println("BLUE 290");
			System.out.println("GREEN 190");
			System.out.println("YELLOW 150");
			System.out.println("This represents 370 votes for RED, 290 votes for BLUE, 190 votes for GREEN and 150 votes for YELLOW.");
			System.out.println();
			System.out.println("Once the results have been calculated in the system from these results, it is displayed as follows: ");
			System.out.println("RED Votes 370 Seats 25");
			System.out.println("BLUE Votes 290 Seats 18");
			System.out.println("GREEN Votes 190 Seats 12");
			System.out.println("YELLOW Votes 150 Seats 8");
			System.out.println();
			System.out.println("This represents 370 votes and 25 seats for RED, 290 votes and 18 seats for BLUE, 190 votes and 12 seats for GREEN and 150 votes and 8 seats for YELLOW.");
			System.out.println();
			System.out.println("You can edit these files given to you, but as stated they must be in the above format, not case sensitive for the name.");
			System.out.println("Now that you have seen help please feel free to edit these files and use any of the 'Load1', 'Load2', 'Load3', 'Load4' commands to load the files");
			System.out.println("Otherwise, please type 'Exit' to exit the program.");
			
		if(!command.equals("Exit") | !command.equals("Load1") | !command.equals("Load2") | !command.equals("Load3") | !command.equals("Load4")  | !command.equals("Exit")) {
			System.out.println();
			System.out.println("The command you entered has not been recognized by the system.");
			System.out.println("Please read the information below to get the correct commands.");
			System.out.println();
		}
		}
	}
	System.out.println();
	saint.delegateSeats();
	saint.printAllParties();
	System.out.println();
	}





private void delegateSeats() {
	int seats = 63;
	while(seats > 0) {
		SainteParty party = partyList.get(0);
		
		for(SainteParty nextParty: partyList) {
			if(nextParty.Quotient() > party.Quotient()) {
				party = nextParty; 
			}
			if(seats > 0) {
			party.addSeat();
			seats--;	
			}
		}
		}
		}
	



// load in data and create party data to be then used for calculating seats
public void LoadVotingData(String file) {
	Scanner sc;
	try{
		sc = new Scanner(new File(file));
		
		while(sc.hasNextLine()){
			String line = sc.nextLine();
			Scanner scanLine = new Scanner(line);
			String partyName = scanLine.next();
			int votes = scanLine.nextInt();
			SainteParty newParty = new SainteParty(partyName, votes);
			this.addParty(newParty);
			}
		} catch (FileNotFoundException ex) {
			System.out.println(ex);
	} 
	}
public void printAllParties() {
	 for(SainteParty party: partyList) {
		 System.out.println(party.printPartyData());
	 }
}

 
}

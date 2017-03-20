package ModifiedSainteLague;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;


public class MSLImplementation {
	
private ArrayList<MSLParty> partyList = new ArrayList<MSLParty>();
private int seats = 100;


public void addParty(MSLParty party) {
	partyList.add(party);
}

public void printAllParties() {
	 for(MSLParty party: partyList) {
		 System.out.println(party.printPartyData());
	 }
}
// main method 
public static void main(String[] args) throws IOException{
	MSLImplementation msl = new MSLImplementation();
	BufferedReader breader = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Welcome to the Modified Sainte lague system!");
	System.out.println("There are four different elections that can be run on this system.");
	System.out.println("The data for these elections can be found in the following text files in the program.");
	System.out.println();
	System.out.println("MSLElection1.txt");
	System.out.println("MSLElection2.txt");
	System.out.println("MSLElection3.txt");
	System.out.println("MSLElection4.txt");
	System.out.println();
	System.out.println("To load any of these elections type(without the quotes) 'load1', 'load2', 'load3' or 'load4'.");
	System.out.println("The results are displayed as: Party Name, The number of votes achieved and the allocated seats to the party.");
	System.out.println("Note these text files will be able to be edited to host your own elections.");
	System.out.println("Read the user manual on how to edit and interpret the data for this system if you don't understand.");
	System.out.println("If you wish to exit the system, type(without the quotes) 'exit'.");
	System.out.println("Once you have typed your load command the results are printed and then we are returned to the main menu.");
	System.out.println("To see the results if they are printed off the screen, scroll up the console to see where you typed and the results with be below.");
	while(true) {
		String command = "";
		
		command = breader.readLine();
		
		if(command.equals("finished")){
			break;
		}
		if(command.equals("Load1")){
			msl.LoadVotingData("MSLElection1.txt");
			break;
		}
		if(command.equals("Load2")){
			msl.LoadVotingData("MSLElection2.txt");
			break;
		}
		if(command.equals("Load3")){
			msl.LoadVotingData("MSLElection3.txt");
			break;
		}
		if(command.equals("Load4")){
			msl.LoadVotingData("MSLElection4.txt");
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
			System.out.println("RED Votes 370 Seats 24");
			System.out.println("BLUE Votes 290 Seats 18");
			System.out.println("GREEN Votes 190 Seats 12");
			System.out.println("YELLOW Votes 150 Seats 9");
			System.out.println();
			System.out.println("This represents 370 votes and 24 seats for RED, 290 votes and 18 seats for BLUE, 190 votes and 12 seats for GREEN and 150 votes and 9 seats for YELLOW.");
			System.out.println();
			System.out.println("You can edit these files given to you, but as stated they must be in the above format, not case sensitive for the name.");
			System.out.println("Now that you have seen help please feel free to edit these files and use any of the 'Load1', 'Load2', 'Load3', 'Load4' commands to load the files");
			System.out.println("Otherwise, please type 'Exit' to exit the program.");
		}
		if(!command.equals("Exit") | !command.equals("Load1") | !command.equals("Load2") | !command.equals("Load3") | !command.equals("Load4")  | !command.equals("Exit")) {
			System.out.println();
			System.out.println("The command you entered has not been recognized by the system.");
			System.out.println("Please read the information above to get the correct commands.");
			System.out.println();
			System.out.println("Please enter a correct command:");
		}
	}
	msl.delegateSeats();
	msl.printAllParties();
	
	}





private void delegateSeats() {
	
	MSLParty party = partyList.get(0);
	while(seats > 0) {
		
		for(MSLParty nextParty: partyList) {
			if(party.totalSeats() == 0) {
				if(nextParty.Quotient() > party.modifiedQuotient()) {
					party = nextParty;
				}
			}
			else {
				if(nextParty.totalSeats() == 0) {
				if(nextParty.Quotient() > party.Quotient()) {
					party = nextParty;
				}
				}
				else {
					if(nextParty.totalSeats() == 0 && party.totalSeats() == 0) {
						if(nextParty.modifiedQuotient() > party.modifiedQuotient()) {
							party = nextParty;
						}
					}
					else {
						if(nextParty.Quotient() > party.Quotient()) {
							party = nextParty;
							
						}
					}
				}
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
	
	Scanner s;
	
	try{
		s = new Scanner(new File(file));
		
		while(s.hasNextLine()){
			String line = s.nextLine();
			
			Scanner scanLine = new Scanner(line);
			String partyName = scanLine.next();
			int votes = scanLine.nextInt();
			MSLParty newParty = new MSLParty(partyName, votes);
			this.addParty(newParty);
			}
		} catch (FileNotFoundException ex) {
			System.out.println(ex);
	} 
	}


 
}

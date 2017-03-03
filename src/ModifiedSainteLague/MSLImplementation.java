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
private int seats = 63;


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
	while(true) {
		String command = "";
		
		command = breader.readLine();
		
		if(command.equals("finished")){
			break;
		}
		if(command.equals("Load1")){
			msl.LoadVotingData("testingData.txt");
			break;
		}
		if(command.equals("Load2")){
			msl.LoadVotingData("testingData.txt");
			break;
		}
		if(command.equals("Load3")){
			msl.LoadVotingData("testingData.txt");
			break;
		}
		if(command.equals("Load4")){
			msl.LoadVotingData("testingData.txt");
			break;
		}
	}
	msl.delegateSeats();
	msl.printAllParties();
	
	}





private void delegateSeats() {
	
	MSLParty party = partyList.get(0);
	while(seats > 0) {
		
		for(MSLParty nextParty: partyList) {
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
			if(seats > 0) {
			System.out.println(party.partyName());
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

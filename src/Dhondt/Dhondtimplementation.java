package Dhondt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;


public class Dhondtimplementation {
	
private ArrayList<DhondtParty> partyList = new ArrayList<DhondtParty>();


public void addParty(DhondtParty party) {
	partyList.add(party);
}

public static void main(String[] args) throws IOException{
	Dhondtimplementation dhon = new Dhondtimplementation();
	BufferedReader breader = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Welcome to the D'hondt system!");
	System.out.println("There are four different elections that can be run on this system.");
	System.out.println("The data for these elections can be found in the following text files in the program.");
	System.out.println();
	System.out.println("D'hondtElection1.txt");
	System.out.println("D'hondtElection2.txt");
	System.out.println("D'hondtElection3.txt");
	System.out.println("D'hondtElection4.txt");
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
			dhon.LoadVotingData("DhondtElection1.txt");
			break;
		}
		if(command.equals("Load2")){
			dhon.LoadVotingData("DhondtElection2.txt");
			break;
		}
		if(command.equals("Load3")){
			dhon.LoadVotingData("DhondtElection3.txt");
			break;
		}
		if(command.equals("Load4")){
			dhon.LoadVotingData("DhondtElection4.txt");
			break;
		}
	}
	dhon.delegateSeats();
	dhon.printAllParties();
	}


public void delegateSeats() {
	int seats = 100;
	while (seats > 0) {
		DhondtParty party = partyList.get(0);
		for (DhondtParty nextParty : partyList) {
			if (nextParty.Quotient() > party.Quotient()) {
				party = nextParty;
			}
		}

			party.addSeat();
			seats--;
			
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
			DhondtParty newParty = new DhondtParty(partyName, votes);
			this.addParty(newParty);
			}
		} catch (FileNotFoundException ex) {
			System.out.println(ex);
	} 
	}
public void printAllParties() {
	 for(DhondtParty party: partyList) {
		 System.out.println(party.printPartyData());
	 }
}

 
}
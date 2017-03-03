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
			saint.LoadVotingData("testingData.txt");
			break;
		}
		if(command.equals("Load2")){
			saint.LoadVotingData("testingData.txt");
			break;
		}
		if(command.equals("Load3")){
			saint.LoadVotingData("testingData.txt");
			break;
		}
		if(command.equals("Load4")){
			saint.LoadVotingData("testingData.txt");
			break;
		}
	}
	saint.delegateSeats();
	saint.printAllParties();
	}





private void delegateSeats() {
	SainteParty party = partyList.get(0);
	while(seats > 0) {
		for(SainteParty nextParty: partyList) {
			if(nextParty.Quotient() > party.Quotient()) {
				party = nextParty; 
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

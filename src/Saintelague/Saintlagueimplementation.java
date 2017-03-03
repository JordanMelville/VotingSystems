package Saintelague;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;


public class Saintlagueimplementation {
	
private ArrayList<Party> partyList = new ArrayList<Party>();
private int seats = 63;

public void addParty(Party party) {
	partyList.add(party);
}

public static void main(String[] args) throws IOException{
	Saintlagueimplementation saint = new Saintlagueimplementation();
	saint.LoadVotingData("TestingData.txt");
	saint.delegateSeats();
	saint.printAllParties();
	}





private void delegateSeats() {
	Party party = partyList.get(0);
	while(seats > 0) {
		for(Party nextParty: partyList) {
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
			Party newParty = new Party(partyName, votes);
			this.addParty(newParty);
			}
		} catch (FileNotFoundException ex) {
			System.out.println(ex);
	} 
	}
public void printAllParties() {
	 for(Party party: partyList) {
		 System.out.println(party.printPartyData());
	 }
}

 
}

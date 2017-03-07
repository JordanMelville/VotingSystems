package Main;
import java.io.IOException;
import java.util.Scanner;

import Borda.BordaCandidate;
import Borda.BordaImplementation;
import AlternativeVote.InstantRunoffProc;
import Dhondt.Dhondtimplementation;
import Dhondt.DhondtParty;
import FirstPastThePost.FPTPCandidate;
import FirstPastThePost.FPTPImplementation;
import ModifiedSainteLague.MSLImplementation;
import ModifiedSainteLague.MSLParty;
import Saintelague.Saintlagueimplementation;
import Saintelague.SainteParty;
public class FinalProgramMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean ended = false;
		int electionCounter = 0;
	 System.out.println();	
     System.out.println("Thank you for using the voting systems analyser!");
     System.out.println("This system allows you to run a selection of voting methods using pre-given election data!");
     System.out.println("The system also allows you to change voting files to select your own data!");
     System.out.println("Once you have recieved your election results the menu will be displayed again");
     System.out.println("If you wish to use the same system again, just re-enter the same command!");
     System.out.println();
     while(ended != true) {
     System.out.println("The six systems available in this program are as follows.");
     System.out.println("1 Borda Count Method");
     System.out.println("2 Sainte-lague Method");
     System.out.println("3 D'hondt Method");
     System.out.println("4 First Past The Post Method");
     System.out.println("5 Modified Sainte Lague Method");
     System.out.println("6 Alternative Vote Method");
     System.out.println();
     System.out.println("If you are unsure about any of these voting styles or would like to know more.");
     System.out.println("If you are unfamiliar with any of these systems, type 'Help' and information will be provided.");
     System.out.println("Otherwise type(without quotes, case sensitive) 'Borda', 'Saint', 'Dhondt', 'First', 'Modified', 'Alternative'.");
     System.out.println("If you wish to exit the program, just type 'exit'.");
     System.out.println("There are voting files attached to this program that you can edit to make your own elections.");
     System.out.println("Note to edit Borda votes use the VoteReader class to change the number of votes for each permutation of 12345.");
     System.out.println("Note that Alternative Vote system does not use a text file, you type the ballots manually.");
     
     
     Scanner input = new Scanner(System.in);
     String userInput = input.nextLine();
     if(userInput.equals("Borda")) {
    	 BordaImplementation.main(args);
     }
     else if(userInput.equals("Help")) {
    	System.out.println();
  		System.out.println("The Borda Count is a single winner election method in which voters vote in order of preference");
  		System.out.println("Each candidate is given 1 point for every last vote they recieved, 2 points for the second last etc.");
  		System.out.println("All the way up to N candidates(this system is limited to 5)");
  		System.out.println("Once the scores have been counted the candidate with the most points wins.");
  		System.out.println("A great example of this working is this weblink here");
  		System.out.println("http://www.ctl.ua.edu/math103/Voting/borda.htm");
  		System.out.println();
  		System.out.println("The Sainte-lague method is a highest voting quotient method used to allocate seats in multi party systems");
  		System.out.println("The quotient is just a voting threshold that candidates need to achieve to be allocated a seat");
  		System.out.println("It is calculated by taking the total number of votes the party recieved");
  		System.out.println("Then dividing them by two multiplied by the number of seats the party has achieved already plus one");
  		System.out.println("The candidate who surpasses the quotient gets allocated a seat, this continues until there are no more seats to be allocated");
  		System.out.println("The following link provides more information and an example if you wish to know more");
  		System.out.println("https://en.wikipedia.org/wiki/Webster/Sainte-Lagu%C3%AB_method");
  		System.out.println();
  		System.out.println("The Modified Sainte-lague method is basically the exact same as the original sainte lague method");
  		System.out.println("The only difference is in the way the quotient is calculated, the quota changes depending on if a party,");
  	    System.out.println("doesn't have any seats at the moment. The quota now becomes the total votes/1.4.");
  		System.out.println("If a party has more than one seat the quota remains the same as the original system.");
  		System.out.println("Candidates who surpass quotients the quotient gets allocated a seat, this continues until there are no more seats to be allocated.");
  		System.out.println("The following link provides a description of the Modified Sainte-lague method.");
  		System.out.println("https://en.wikipedia.org/wiki/Webster/Sainte-Lagu%C3%AB_method.");
  		System.out.println();
  		System.out.println("The D'hondt method is a highest averages method used to allocate seats in multi party systems");
  		System.out.println("A quotient(voting threshold) is calculated that candidates need to achieve to be allocated a seat");
  		System.out.println("It is calculated by taking the total number of votes the party has recieved");
  		System.out.println("Then, dividing them by the number of seats the party has plus 1");
  		System.out.println("Quotients are compared and the candidate with the highest quotient wins a seat.");
  		System.out.println("This continues until all seats have been allocated to the candidates.");
  		System.out.println("The following link provides more information and an example if you wish to know more");
  		System.out.println("https://en.wikipedia.org/wiki/D'Hondt_method");
  		System.out.println();
  		System.out.println("First Past the Post is a single choice voting system, in which voters express a vote for one candidate");
  		System.out.println("These are all counted together and the candidate who recieved the most amount of votes wins the seat.");
  		System.out.println("This then happens all around the country for each seat that needs to be allocated.");
  		System.out.println("The party who has the most MPS will form a government but to achieve a majority is a difficult task.");
  		System.out.println("In the event of a non-majority win, parties may have to band together to form a coalition.");
  		System.out.println("If you wish to know more information about this, this link below provides more information and an example");
     }
     else if(userInput.equals("Saint")) {
    	 try {
			Saintlagueimplementation.main(args);
		} catch (IOException e) {
			System.out.println("Could not find the specified file, the file is missing from the system.");
			e.printStackTrace();
		}
     }
     else if(userInput.equals("Dhondt")) {
    	 try {
			Dhondtimplementation.main(args);
		} catch (IOException e) {
			System.out.println("Could not find the specified file, the file is missing from the system.");
			e.printStackTrace();
		}
    	 electionCounter++;
     }
     else if(userInput.equals("First")) {
    	 try {
			FPTPImplementation.main(args);
		} catch (IOException e) {
			System.out.println("Could not find the specified file, the file is missing from the system.");
			e.printStackTrace();
		}
    	
    	
     }
     else if(userInput.equals("Modified")) {
    	 try {
			MSLImplementation.main(args);
		} catch (IOException e) {
			System.out.println("Could not find the specified file, the file is missing from the system.");
			e.printStackTrace();
		}
    	 ended = true;	 
     }
     else if(userInput.equals("Alternative")) {
    	 InstantRunoffProc.main(args);
     }
     else if(!userInput.equals("Help") | !userInput.equals("Borda") | !userInput.equals("Saint") | !userInput.equals("Dhondt") | !userInput.equals("First") | !userInput.equals("Modified") |!userInput.equals("Alternative") | !userInput.equals("exit")){
    	 System.out.println();
    	 System.out.println("The command you typed has not been recognized");
    	 System.out.println("Now going back to the main menu.");
    	 System.out.println("Read the information below for the correct commands");
    	 System.out.println();
     }
  
     }
	}
     }
	



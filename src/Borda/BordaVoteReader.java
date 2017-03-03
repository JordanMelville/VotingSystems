package Borda;


import java.util.ArrayList;
// this class was designed to act as a class that reads
// in vote data, this class is editted by the user to host an election
// for the voting system method Borda Count Method

//there must be 5 and only 5 candidates running
//there are a total of 120 different voting permutations
//for five candidates and these are taken into account.
public class BordaVoteReader {


ArrayList<Integer> votes = new ArrayList<Integer>();



// There must be five candidates running in this Borda example
BordaCandidate candidate1 = new BordaCandidate("Mary Johnston");
BordaCandidate candidate2 = new BordaCandidate("Barry Hill");
BordaCandidate candidate3 = new BordaCandidate("Terry Thomas");
BordaCandidate candidate4 = new BordaCandidate("Sean Ferris");
BordaCandidate candidate5 = new BordaCandidate("Gary Whyte");


public void voteReader() {
	

// the comments above each of the for loops is there
// to show which permutation of vote this represents
// for example, 1 2 3 4 5 means that candidate 1 has
// been ranked 1st place, candidate 2 has been ranked 2nd
// place etc, as there are 120 permutations of 12345 there
// are 120 different voting preferences and these are all
// taken into account, to add votes just adjust the votes
// on each of the for loops.

	
	
// preferences where the first preference is 1.
	
// 1    2      3     4    5
for(int i = 0; i < 30; i++) {
	votes.add(12345);
	candidate1.addFirstPref();
	candidate2.addSecondPref();
	candidate3.addThirdPref();
	candidate4.addFourthPref();
	candidate5.addFifthPref();
}

//1    2      3     5    4
for(int i = 0; i < 25; i++) {
	votes.add(12354);
	candidate1.addFirstPref();
	candidate3.addSecondPref();
	candidate2.addThirdPref();
	candidate5.addFourthPref();
	candidate4.addFifthPref();
}

//1    2      4     3    5
for(int j = 0; j < 20; j++) {
	votes.add(12435);
	candidate1.addFirstPref();
	candidate2.addSecondPref();
	candidate4.addThirdPref();
	candidate3.addFourthPref();
	candidate5.addFifthPref();
	
}

//1    2      4     5    3
for(int k = 0; k < 10; k++) {
	votes.add(12453);
	candidate1.addFirstPref();
	candidate2.addSecondPref();
	candidate4.addThirdPref();
	candidate5.addFourthPref();
	candidate3.addFifthPref();
}

//1    2      5     3    4
for(int l = 0; l < 5; l++) {
	votes.add(12534);
	candidate1.addFirstPref();
	candidate2.addSecondPref();
	candidate5.addThirdPref();
	candidate3.addFourthPref();
	candidate4.addFifthPref();
}

//1    2      5     4    3
for(int m = 0; m < 3; m++) {
	votes.add(12543);
	candidate1.addFirstPref();
	candidate2.addSecondPref();
	candidate5.addThirdPref();
	candidate4.addFourthPref();
	candidate3.addFifthPref();
}

//1    3      2     4    5
for(int i = 0; i < 25; i++) {
	votes.add(13245);
	candidate1.addFirstPref();
	candidate3.addSecondPref();
	candidate2.addThirdPref();
	candidate4.addFourthPref();
	candidate5.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(13254);
	candidate1.addFirstPref();
	candidate3.addSecondPref();
	candidate2.addThirdPref();
	candidate5.addFourthPref();
	candidate4.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(13425);
	candidate1.addFirstPref();
	candidate3.addSecondPref();
	candidate4.addThirdPref();
	candidate2.addFourthPref();
	candidate5.addFifthPref();
}


for(int i = 0; i < 25; i++) {
	votes.add(13452);
	candidate1.addFirstPref();
	candidate3.addSecondPref();
	candidate4.addThirdPref();
	candidate5.addFourthPref();
	candidate2.addFifthPref();
}


for(int i = 0; i < 25; i++) {
	votes.add(13524);
	candidate1.addFirstPref();
	candidate3.addSecondPref();
	candidate5.addThirdPref();
	candidate2.addFourthPref();
	candidate4.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(13542);
	candidate1.addFirstPref();
	candidate3.addSecondPref();
	candidate5.addThirdPref();
	candidate4.addFourthPref();
	candidate2.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(14235);
	candidate1.addFirstPref();
	candidate4.addSecondPref();
	candidate2.addThirdPref();
	candidate3.addFourthPref();
	candidate5.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(14253);
	candidate1.addFirstPref();
	candidate4.addSecondPref();
	candidate2.addThirdPref();
	candidate5.addFourthPref();
	candidate3.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(14325);
	candidate1.addFirstPref();
	candidate4.addSecondPref();
	candidate3.addThirdPref();
	candidate2.addFourthPref();
	candidate5.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(14352);
	candidate1.addFirstPref();
	candidate4.addSecondPref();
	candidate3.addThirdPref();
	candidate5.addFourthPref();
	candidate2.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(14523);
	candidate1.addFirstPref();
	candidate4.addSecondPref();
	candidate5.addThirdPref();
	candidate2.addFourthPref();
	candidate3.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(14532);
	candidate1.addFirstPref();
	candidate4.addSecondPref();
	candidate5.addThirdPref();
	candidate3.addFourthPref();
	candidate2.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(15234);
	candidate1.addFirstPref();
	candidate5.addSecondPref();
	candidate2.addThirdPref();
	candidate3.addFourthPref();
	candidate4.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(15243);
	candidate1.addFirstPref();
	candidate5.addSecondPref();
	candidate2.addThirdPref();
	candidate4.addFourthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(15324);
	candidate1.addFirstPref();
	candidate5.addSecondPref();
	candidate3.addThirdPref();
	candidate2.addFourthPref();
	candidate4.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(15342);
	candidate1.addFirstPref();
	candidate5.addSecondPref();
	candidate3.addThirdPref();
	candidate4.addFourthPref();
	candidate2.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(15423);
	candidate1.addFirstPref();
	candidate5.addSecondPref();
	candidate4.addThirdPref();
	candidate2.addFourthPref();
	candidate3.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(15432);
	candidate1.addFirstPref();
	candidate5.addSecondPref();
	candidate4.addThirdPref();
	candidate3.addFourthPref();
	candidate2.addFifthPref();
}


//preferences where the first preference is 2.
for(int i = 0; i < 30; i++) {
	votes.add(21345);
	candidate2.addFirstPref();
	candidate1.addSecondPref();
	candidate3.addThirdPref();
	candidate4.addFourthPref();
	candidate5.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(21354);
	candidate2.addFirstPref();
	candidate1.addSecondPref();
	candidate3.addThirdPref();
	candidate5.addFourthPref();
	candidate4.addFifthPref();
}

for(int j = 0; j < 20; j++) {
	votes.add(21435);
	candidate2.addFirstPref();
	candidate1.addSecondPref();
	candidate4.addThirdPref();
	candidate3.addFourthPref();
	candidate5.addFifthPref();
	
}

for(int k = 0; k < 10; k++) {
	votes.add(21453);
	candidate2.addFirstPref();
	candidate1.addSecondPref();
	candidate4.addThirdPref();
	candidate5.addFourthPref();
	candidate3.addFifthPref();
}

for(int l = 0; l < 5; l++) {
	votes.add(21534);
	candidate2.addFirstPref();
	candidate1.addSecondPref();
	candidate5.addThirdPref();
	candidate3.addFourthPref();
	candidate4.addFifthPref();
}

for(int m = 0; m < 3; m++) {
	votes.add(21543);
	candidate2.addFirstPref();
	candidate1.addSecondPref();
	candidate5.addThirdPref();
	candidate4.addFourthPref();
	candidate3.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(23145);
	candidate2.addFirstPref();
	candidate3.addSecondPref();
	candidate1.addThirdPref();
	candidate4.addFourthPref();
	candidate5.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(23154);
	candidate2.addFirstPref();
	candidate3.addSecondPref();
	candidate1.addThirdPref();
	candidate5.addFourthPref();
	candidate4.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(23415);
	candidate2.addFirstPref();
	candidate3.addSecondPref();
	candidate4.addThirdPref();
	candidate1.addFourthPref();
	candidate5.addFifthPref();
}


for(int i = 0; i < 25; i++) {
	votes.add(23451);
	candidate2.addFirstPref();
	candidate3.addSecondPref();
	candidate4.addThirdPref();
	candidate5.addFourthPref();
	candidate1.addFifthPref();
}


for(int i = 0; i < 25; i++) {
	votes.add(23514);
	candidate2.addFirstPref();
	candidate3.addSecondPref();
	candidate5.addThirdPref();
	candidate1.addFourthPref();
	candidate4.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(23541);
	candidate2.addFirstPref();
	candidate3.addSecondPref();
	candidate5.addThirdPref();
	candidate4.addFourthPref();
	candidate1.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(24135);
	candidate2.addFirstPref();
	candidate4.addSecondPref();
	candidate1.addThirdPref();
	candidate3.addFourthPref();
	candidate5.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(24153);
	candidate2.addFirstPref();
	candidate4.addSecondPref();
	candidate1.addThirdPref();
	candidate5.addFourthPref();
	candidate3.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(24315);
	candidate2.addFirstPref();
	candidate4.addSecondPref();
	candidate3.addThirdPref();
	candidate1.addFourthPref();
	candidate5.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(24351);
	candidate2.addFirstPref();
	candidate4.addSecondPref();
	candidate3.addThirdPref();
	candidate5.addFourthPref();
	candidate1.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(24513);
	candidate2.addFirstPref();
	candidate4.addSecondPref();
	candidate5.addThirdPref();
	candidate1.addFourthPref();
	candidate3.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(24531);
	candidate2.addFirstPref();
	candidate4.addSecondPref();
	candidate5.addThirdPref();
	candidate3.addFourthPref();
	candidate1.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(25134);
	candidate2.addFirstPref();
	candidate5.addSecondPref();
	candidate1.addThirdPref();
	candidate3.addFourthPref();
	candidate4.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(25143);
	candidate2.addFirstPref();
	candidate5.addSecondPref();
	candidate1.addThirdPref();
	candidate4.addFourthPref();
	candidate3.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(25314);
	candidate2.addFirstPref();
	candidate5.addSecondPref();
	candidate3.addThirdPref();
	candidate1.addFourthPref();
	candidate4.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(25341);
	candidate2.addFirstPref();
	candidate5.addSecondPref();
	candidate3.addThirdPref();
	candidate4.addFourthPref();
	candidate1.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(25314);
	candidate2.addFirstPref();
	candidate5.addSecondPref();
	candidate3.addThirdPref();
	candidate1.addFourthPref();
	candidate4.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(25341);
	candidate2.addFirstPref();
	candidate5.addSecondPref();
	candidate3.addThirdPref();
	candidate4.addFourthPref();
	candidate1.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(25413);
	candidate2.addFirstPref();
	candidate5.addSecondPref();
	candidate4.addThirdPref();
	candidate1.addFourthPref();
	candidate3.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(25431);
	candidate2.addFirstPref();
	candidate5.addSecondPref();
	candidate4.addThirdPref();
	candidate3.addFourthPref();
	candidate1.addFifthPref();
}

//preferences where the first preference is 3.
for(int i = 0; i < 30; i++) {
	votes.add(31245);
	candidate3.addFirstPref();
	candidate1.addSecondPref();
	candidate2.addThirdPref();
	candidate4.addFourthPref();
	candidate5.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(31254);
	candidate3.addFirstPref();
	candidate1.addSecondPref();
	candidate2.addThirdPref();
	candidate5.addFourthPref();
	candidate4.addFifthPref();
}

for(int j = 0; j < 20; j++) {
	votes.add(31425);
	candidate3.addFirstPref();
	candidate1.addSecondPref();
	candidate4.addThirdPref();
	candidate2.addFourthPref();
	candidate5.addFifthPref();
	
}

for(int k = 0; k < 10; k++) {
	votes.add(31452);
	candidate3.addFirstPref();
	candidate1.addSecondPref();
	candidate4.addThirdPref();
	candidate5.addFourthPref();
	candidate2.addFifthPref();
}

for(int l = 0; l < 5; l++) {
	votes.add(31524);
	candidate3.addFirstPref();
	candidate1.addSecondPref();
	candidate5.addThirdPref();
	candidate2.addFourthPref();
	candidate4.addFifthPref();
}

for(int m = 0; m < 3; m++) {
	votes.add(31542);
	candidate3.addFirstPref();
	candidate1.addSecondPref();
	candidate5.addThirdPref();
	candidate4.addFourthPref();
	candidate2.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(32145);
	candidate3.addFirstPref();
	candidate2.addSecondPref();
	candidate1.addThirdPref();
	candidate4.addFourthPref();
	candidate5.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(32154);
	candidate3.addFirstPref();
	candidate2.addSecondPref();
	candidate1.addThirdPref();
	candidate5.addFourthPref();
	candidate4.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(32415);
	candidate3.addFirstPref();
	candidate2.addSecondPref();
	candidate4.addThirdPref();
	candidate1.addFourthPref();
	candidate5.addFifthPref();
}


for(int i = 0; i < 25; i++) {
	votes.add(32451);
	candidate3.addFirstPref();
	candidate2.addSecondPref();
	candidate4.addThirdPref();
	candidate5.addFourthPref();
	candidate1.addFifthPref();
}


for(int i = 0; i < 25; i++) {
	votes.add(32514);
	candidate3.addFirstPref();
	candidate2.addSecondPref();
	candidate5.addThirdPref();
	candidate1.addFourthPref();
	candidate4.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(32541);
	candidate3.addFirstPref();
	candidate2.addSecondPref();
	candidate5.addThirdPref();
	candidate4.addFourthPref();
	candidate1.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(34125);
	candidate3.addFirstPref();
	candidate4.addSecondPref();
	candidate1.addThirdPref();
	candidate2.addFourthPref();
	candidate5.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(34152);
	candidate3.addFirstPref();
	candidate4.addSecondPref();
	candidate1.addThirdPref();
	candidate5.addFourthPref();
	candidate2.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(34215);
	candidate3.addFirstPref();
	candidate4.addSecondPref();
	candidate2.addThirdPref();
	candidate1.addFourthPref();
	candidate5.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(34251);
	candidate3.addFirstPref();
	candidate4.addSecondPref();
	candidate2.addThirdPref();
	candidate5.addFourthPref();
	candidate1.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(34512);
	candidate3.addFirstPref();
	candidate4.addSecondPref();
	candidate5.addThirdPref();
	candidate1.addFourthPref();
	candidate2.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(34521);
	candidate3.addFirstPref();
	candidate4.addSecondPref();
	candidate5.addThirdPref();
	candidate2.addFourthPref();
	candidate1.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(35124);
	candidate3.addFirstPref();
	candidate5.addSecondPref();
	candidate1.addThirdPref();
	candidate2.addFourthPref();
	candidate4.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(35142);
	candidate3.addFirstPref();
	candidate5.addSecondPref();
	candidate1.addThirdPref();
	candidate4.addFourthPref();
	candidate2.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(35214);
	candidate3.addFirstPref();
	candidate5.addSecondPref();
	candidate2.addThirdPref();
	candidate1.addFourthPref();
	candidate4.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(35241);
	candidate3.addFirstPref();
	candidate5.addSecondPref();
	candidate2.addThirdPref();
	candidate4.addFourthPref();
	candidate1.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(35412);
	candidate3.addFirstPref();
	candidate5.addSecondPref();
	candidate4.addThirdPref();
	candidate1.addFourthPref();
	candidate2.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(35421);
	candidate3.addFirstPref();
	candidate5.addSecondPref();
	candidate4.addThirdPref();
	candidate2.addFourthPref();
	candidate1.addFifthPref();
}

//preferences where the first preference is 4.
for(int i = 0; i < 30; i++) {
	votes.add(41235);
	candidate4.addFirstPref();
	candidate1.addSecondPref();
	candidate2.addThirdPref();
	candidate3.addFourthPref();
	candidate5.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(41253);
	candidate4.addFirstPref();
	candidate1.addSecondPref();
	candidate2.addThirdPref();
	candidate5.addFourthPref();
	candidate3.addFifthPref();
}

for(int j = 0; j < 20; j++) {
	votes.add(41325);
	candidate4.addFirstPref();
	candidate1.addSecondPref();
	candidate3.addThirdPref();
	candidate2.addFourthPref();
	candidate5.addFifthPref();
	
}

for(int k = 0; k < 10; k++) {
	votes.add(41352);
	candidate4.addFirstPref();
	candidate1.addSecondPref();
	candidate3.addThirdPref();
	candidate5.addFourthPref();
	candidate2.addFifthPref();
}

for(int l = 0; l < 5; l++) {
	votes.add(41523);
	candidate4.addFirstPref();
	candidate1.addSecondPref();
	candidate5.addThirdPref();
	candidate2.addFourthPref();
	candidate3.addFifthPref();
}

for(int m = 0; m < 3; m++) {
	votes.add(41532);
	candidate4.addFirstPref();
	candidate1.addSecondPref();
	candidate5.addThirdPref();
	candidate3.addFourthPref();
	candidate2.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(42135);
	candidate4.addFirstPref();
	candidate2.addSecondPref();
	candidate1.addThirdPref();
	candidate3.addFourthPref();
	candidate5.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(42153);
	candidate4.addFirstPref();
	candidate2.addSecondPref();
	candidate1.addThirdPref();
	candidate5.addFourthPref();
	candidate3.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(42315);
	candidate4.addFirstPref();
	candidate2.addSecondPref();
	candidate3.addThirdPref();
	candidate1.addFourthPref();
	candidate5.addFifthPref();
}


for(int i = 0; i < 25; i++) {
	votes.add(42351);
	candidate4.addFirstPref();
	candidate2.addSecondPref();
	candidate3.addThirdPref();
	candidate5.addFourthPref();
	candidate1.addFifthPref();
}


for(int i = 0; i < 25; i++) {
	votes.add(42513);
	candidate4.addFirstPref();
	candidate2.addSecondPref();
	candidate5.addThirdPref();
	candidate1.addFourthPref();
	candidate3.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(42531);
	candidate4.addFirstPref();
	candidate2.addSecondPref();
	candidate5.addThirdPref();
	candidate3.addFourthPref();
	candidate1.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(43125);
	candidate4.addFirstPref();
	candidate3.addSecondPref();
	candidate1.addThirdPref();
	candidate2.addFourthPref();
	candidate5.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(43152);
	candidate4.addFirstPref();
	candidate3.addSecondPref();
	candidate1.addThirdPref();
	candidate5.addFourthPref();
	candidate2.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(43215);
	candidate4.addFirstPref();
	candidate3.addSecondPref();
	candidate2.addThirdPref();
	candidate1.addFourthPref();
	candidate5.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(43251);
	candidate4.addFirstPref();
	candidate3.addSecondPref();
	candidate2.addThirdPref();
	candidate5.addFourthPref();
	candidate1.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(43512);
	candidate4.addFirstPref();
	candidate3.addSecondPref();
	candidate5.addThirdPref();
	candidate1.addFourthPref();
	candidate2.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(43521);
	candidate4.addFirstPref();
	candidate3.addSecondPref();
	candidate5.addThirdPref();
	candidate2.addFourthPref();
	candidate1.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(45123);
	candidate4.addFirstPref();
	candidate5.addSecondPref();
	candidate1.addThirdPref();
	candidate2.addFourthPref();
	candidate3.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(45132);
	candidate4.addFirstPref();
	candidate5.addSecondPref();
	candidate1.addThirdPref();
	candidate3.addFourthPref();
	candidate2.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(45213);
	candidate4.addFirstPref();
	candidate5.addSecondPref();
	candidate2.addThirdPref();
	candidate1.addFourthPref();
	candidate3.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(45231);
	candidate4.addFirstPref();
	candidate5.addSecondPref();
	candidate2.addThirdPref();
	candidate3.addFourthPref();
	candidate1.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(45312);
	candidate4.addFirstPref();
	candidate5.addSecondPref();
	candidate3.addThirdPref();
	candidate1.addFourthPref();
	candidate2.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(45321);
	candidate4.addFirstPref();
	candidate5.addSecondPref();
	candidate3.addThirdPref();
	candidate2.addFourthPref();
	candidate1.addFifthPref();
}

//preferences where the first preference is 5.
for(int i = 0; i < 30; i++) {
	votes.add(51234);
	candidate5.addFirstPref();
	candidate1.addSecondPref();
	candidate2.addThirdPref();
	candidate3.addFourthPref();
	candidate4.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(51243);
	candidate5.addFirstPref();
	candidate1.addSecondPref();
	candidate2.addThirdPref();
	candidate4.addFourthPref();
	candidate3.addFifthPref();
}

for(int j = 0; j < 20; j++) {
	votes.add(51324);
	candidate5.addFirstPref();
	candidate1.addSecondPref();
	candidate3.addThirdPref();
	candidate2.addFourthPref();
	candidate4.addFifthPref();
	
}

for(int k = 0; k < 10; k++) {
	votes.add(51342);
	candidate5.addFirstPref();
	candidate1.addSecondPref();
	candidate3.addThirdPref();
	candidate4.addFourthPref();
	candidate2.addFifthPref();
}

for(int l = 0; l < 5; l++) {
	votes.add(51423);
	candidate5.addFirstPref();
	candidate1.addSecondPref();
	candidate4.addThirdPref();
	candidate2.addFourthPref();
	candidate3.addFifthPref();
}

for(int m = 0; m < 3; m++) {
	votes.add(51432);
	candidate5.addFirstPref();
	candidate1.addSecondPref();
	candidate4.addThirdPref();
	candidate3.addFourthPref();
	candidate2.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(52134);
	candidate5.addFirstPref();
	candidate2.addSecondPref();
	candidate1.addThirdPref();
	candidate3.addFourthPref();
	candidate4.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(52143);
	candidate5.addFirstPref();
	candidate2.addSecondPref();
	candidate1.addThirdPref();
	candidate4.addFourthPref();
	candidate3.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(52314);
	candidate5.addFirstPref();
	candidate2.addSecondPref();
	candidate3.addThirdPref();
	candidate1.addFourthPref();
	candidate4.addFifthPref();
}


for(int i = 0; i < 25; i++) {
	votes.add(52341);
	candidate5.addFirstPref();
	candidate2.addSecondPref();
	candidate3.addThirdPref();
	candidate4.addFourthPref();
	candidate1.addFifthPref();
}


for(int i = 0; i < 25; i++) {
	votes.add(52413);
	candidate5.addFirstPref();
	candidate2.addSecondPref();
	candidate4.addThirdPref();
	candidate1.addFourthPref();
	candidate3.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(52431);
	candidate5.addFirstPref();
	candidate2.addSecondPref();
	candidate4.addThirdPref();
	candidate3.addFourthPref();
	candidate1.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(53124);
	candidate5.addFirstPref();
	candidate3.addSecondPref();
	candidate1.addThirdPref();
	candidate2.addFourthPref();
	candidate4.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(53142);
	candidate5.addFirstPref();
	candidate3.addSecondPref();
	candidate1.addThirdPref();
	candidate4.addFourthPref();
	candidate2.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(53214);
	candidate5.addFirstPref();
	candidate3.addSecondPref();
	candidate2.addThirdPref();
	candidate1.addFourthPref();
	candidate4.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(53241);
	candidate5.addFirstPref();
	candidate3.addSecondPref();
	candidate2.addThirdPref();
	candidate4.addFourthPref();
	candidate1.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(53412);
	candidate5.addFirstPref();
	candidate3.addSecondPref();
	candidate4.addThirdPref();
	candidate1.addFourthPref();
	candidate2.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(53421);
	candidate5.addFirstPref();
	candidate3.addSecondPref();
	candidate4.addThirdPref();
	candidate2.addFourthPref();
	candidate1.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(54123);
	candidate5.addFirstPref();
	candidate4.addSecondPref();
	candidate1.addThirdPref();
	candidate2.addFourthPref();
	candidate3.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(54132);
	candidate5.addFirstPref();
	candidate4.addSecondPref();
	candidate1.addThirdPref();
	candidate3.addFourthPref();
	candidate2.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(54213);
	candidate5.addFirstPref();
	candidate4.addSecondPref();
	candidate2.addThirdPref();
	candidate1.addFourthPref();
	candidate3.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(54231);
	candidate5.addFirstPref();
	candidate4.addSecondPref();
	candidate2.addThirdPref();
	candidate3.addFourthPref();
	candidate1.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(54312);
	candidate5.addFirstPref();
	candidate4.addSecondPref();
	candidate3.addThirdPref();
	candidate1.addFourthPref();
	candidate2.addFifthPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(54321);
	candidate5.addFirstPref();
	candidate4.addSecondPref();
	candidate3.addThirdPref();
	candidate2.addFourthPref();
	candidate1.addFifthPref();
}

}

}


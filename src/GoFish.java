//Jerrel Sogoni (109619783)

import java.util.Scanner;

public class GoFish {
    public static void main(String[] args) {
    	Scanner answer = new Scanner(System.in);
    	DeckOfCards myDeck = new DeckOfCards();
    	Player me = new Player("Player");
    	Player computer = new Player("Computer");

    	// Player and Computer now have 7 cards
    	for (int i = 0; i < 7 ;i++ ) {
    		me.addCard(myDeck.nextCard());
    		computer.addCard(myDeck.nextCard());
    	}
    	do{
    	me.scoreCounter();
        computer.scoreCounter2();
    	System.out.println();
    	int user = me.playerResponse();
    		while(computer.check(user) == true){
    		me.swapCard(user, computer);
    		computer.removeCard(user);
    		me.scoreCounter();
            computer.scoreCounter2();
    		System.out.println();
    		user = me.playerResponse();
    		}
    	if(computer.check(user) != true){
    		me.goFish(myDeck.nextCard());
    		System.out.println();
    		me.scoreCounter();
            computer.scoreCounter2();
    		System.out.println();
    	}
    	int guess = computer.computerTurn();
    	char response = answer.next().charAt(0);
    	response = Character.toUpperCase(response);
    	boolean check = true;
    	while(check){
    		String computerGuess = computer.computerGuess();
    		if(me.check(guess) == true && response == 'N'){
    		System.out.println("Do not Cheat!");
    		System.out.print(computerGuess);
    		response = answer.next().charAt(0);
    		response = Character.toUpperCase(response);
    		}
    		else if (me.check(guess) == false && response == 'Y') {
    		System.out.println("Do not Cheat!");
    		System.out.print(computerGuess);
    		response = answer.next().charAt(0);
    		response = Character.toUpperCase(response);	
    		}
    		else {
    			check = false;
    			break;
    		}
    	}
    	boolean check2 = true;
        boolean check3 = true;
    	while(check2){
            String computerGuess = computer.computerGuess();
            if(me.check(guess) == true && response == 'N'){
            System.out.println("Do not Cheat!");
            System.out.print(computerGuess);
            response = answer.next().charAt(0);
            response = Character.toUpperCase(response);
            }
            if (me.check(guess) == false && response == 'Y') {
            System.out.println("Do not Cheat!");
            System.out.print(computerGuess);
            response = answer.next().charAt(0);
            response = Character.toUpperCase(response); 
            }
            if(me.check(guess) == true && response == 'Y'){
            computer.swapCard(guess, me);
            me.removeCard(guess);
            guess = computer.computerTurn();
            computerGuess = computer.computerGuess();
            response = answer.next().charAt(0);
            response = Character.toUpperCase(response);
            }
    		else {
    			check2 = false;
    			break;
    		}
    	}
    	if(me.check(guess) == false && response == 'N'){
    			computer.computerGoFish(myDeck.nextCard());
    			System.out.println();
    		}

    	}while(myDeck.nextCard() != null && me.handEmpty() != false && computer.handEmpty() != false );
    	System.out.println("Game is Over:\nSince there is no cards in the deck\nOr A Player has no more cards");
        if( me.getScore() == computer.getScore()){
            System.out.println("It is tied our Score is: " + me.getScore() + " Computer Score is: " + computer.getScore());
        }
        else if ( me.getScore() > computer.getScore()) {
            System.out.println("You win: Your Score is: " + me.getScore() + " Computer Score is: " + computer.getScore());
        }
        else{
            System.out.println("Computer Wins: Score is: "+ computer.getScore() + " Player Score is: " + me.getScore());
        }
    	


    }

}


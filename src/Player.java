//Jerrel Sogoni (109619783)
import java.util.Random;
import java.util.Scanner;

public class Player {
    private Cards[] myCards = new Cards[52];
    private int numCards;
    public static final int NEEDED_OCCURENCES = 4;
    private int score = 0;
    private String user = "";
    private int computerGuess;
    public void setComputerGuess(int theGuess ){
        this.computerGuess = theGuess;
    }
    public int getComputerGuess(){
        return this.computerGuess;
    }
    public void setnumCards(int thenumCards){
        this.numCards = thenumCards;
    }
    public int getnumCards(){
        return this.numCards;
    }
    public Player(String a){
        this.user = a;
    }
    public void setName(String theUser){
        this.user = theUser;
    }
    public String getName(){
        return this.user;
    }

    public void addCard( Cards theCard){
        this.myCards[this.numCards] = theCard;
    	this.numCards++;
    }
    public void printHand(){
        System.out.println("Your Cards:");
    	for( int i = 0 ; i < this.numCards; i++){
    		System.out.printf("%d  %s\n", i, this.myCards[i].toString());
    	}
    }
    public void setCards(Cards[] theCards){
    	this.myCards = theCards;

    }
    public Cards[] getCards(){
    	return this.myCards;
    }
    public void displayCard(int a){
        int name;
        name = this.myCards[a].getNumber();
        System.out.println(name);
    }
    public void scoreCounter(){
        int ones = 0;
        int twos = 0;
        int threes = 0;
        int fours = 0;
        int fives = 0;
        int six = 0;
        int seven = 0;
        int eight = 0;
        int nine = 0;
        int ten = 0;
        int eleven = 0;
        int twelve = 0;
        int thirteen = 0;
        for(int i = 0; i < this.numCards; i++){
            // Updated this method to use a switch statement to make things a bit more clean
            // Also avoids NullPointerException error
            switch ( this.myCards[i].getNumber() ) {
                case 1:
                    ones++;
                    if( ones % NEEDED_OCCURENCES == 0 ){
                        this.score++;
                        removeCard(1);
                    }
                    break;

                case 2:
                    twos++;
                    if(twos % NEEDED_OCCURENCES == 0 ){
                        this.score++;
                        removeCard(2);
                    }
                    break;

                case 3:
                    threes++;
                    if(threes % NEEDED_OCCURENCES == 0 ){
                        this.score++;
                        removeCard(3);
                    }
                    break;

                case 4:
                    fours++;
                    if(fours % NEEDED_OCCURENCES == 0 ){
                        this.score++;
                        removeCard(4);
                    }
                    break;

                case 5:
                    fives++;
                    if(fives % NEEDED_OCCURENCES == 0 ){
                        this.score++;
                        removeCard(5);
                    }
                    break;

                case 6:
                    six++;
                    if(six % NEEDED_OCCURENCES == 0 ){
                        this.score++;
                        removeCard(6);
                    }
                    break;

                case 7:
                    seven++;
                    if(seven % NEEDED_OCCURENCES == 0 ){
                        this.score++;
                        removeCard(7);
                    }
                    break;

                case 8:
                    eight++;
                    if(eight % NEEDED_OCCURENCES == 0 ){
                        this.score++;
                        removeCard(8);
                    }
                    break;

                case 9:
                    nine++;
                    if(nine % NEEDED_OCCURENCES == 0 ){
                        this.score++;
                        removeCard(9);
                    }
                    break;

                case 10:
                    ten++;
                    if(ten % NEEDED_OCCURENCES == 0 ){
                        this.score++;
                        removeCard(10);
                    }
                    break;

                case 11:
                    eleven++;
                    if(eleven % NEEDED_OCCURENCES == 0 ){
                        this.score++;
                        removeCard(11);
                    }
                    break;

                case 12:
                    twelve++;
                    if(twelve % NEEDED_OCCURENCES == 0 ){
                        this.score++;
                        removeCard(12);
                    }
                    break;

                case 13:
                    thirteen++;
                    if(thirteen % NEEDED_OCCURENCES == 0 ){
                        this.score++;
                        removeCard(13);
                    }
                    break;
            }
        }
        printHand();
        System.out.println(this.user + " Score: " + this.score);
    }
    public void scoreCounter2(){
        int ones = 0;
        int twos = 0;
        int threes = 0;
        int fours = 0;
        int fives = 0;
        int six = 0;
        int seven = 0;
        int eight = 0;
        int nine = 0;
        int ten = 0;
        int eleven = 0;
        int twelve = 0;
        int thirteen = 0;
        for(int i = 0; i < this.numCards; i++){
            // Updated this method to use a switch statement to make things a bit more clean
            // Also avoids NullPointerException error
            switch ( this.myCards[i].getNumber() ) {
                case 1:
                    ones++;
                    if( ones % NEEDED_OCCURENCES == 0 ){
                        this.score++;
                        removeCard(1);
                    }
                    break;

                case 2:
                    twos++;
                    if(twos % NEEDED_OCCURENCES == 0 ){
                        this.score++;
                        removeCard(2);
                    }
                    break;

                case 3:
                    threes++;
                    if(threes % NEEDED_OCCURENCES == 0 ){
                        this.score++;
                        removeCard(3);
                    }
                    break;

                case 4:
                    fours++;
                    if(fours % NEEDED_OCCURENCES == 0 ){
                        this.score++;
                        removeCard(4);
                    }
                    break;

                case 5:
                    fives++;
                    if(fives % NEEDED_OCCURENCES == 0 ){
                        this.score++;
                        removeCard(5);
                    }
                    break;

                case 6:
                    six++;
                    if(six % NEEDED_OCCURENCES == 0 ){
                        this.score++;
                        removeCard(6);
                    }
                    break;

                case 7:
                    seven++;
                    if(seven % NEEDED_OCCURENCES == 0 ){
                        this.score++;
                        removeCard(7);
                    }
                    break;

                case 8:
                    eight++;
                    if(eight % NEEDED_OCCURENCES == 0 ){
                        this.score++;
                        removeCard(8);
                    }
                    break;

                case 9:
                    nine++;
                    if(nine % NEEDED_OCCURENCES == 0 ){
                        this.score++;
                        removeCard(9);
                    }
                    break;

                case 10:
                    ten++;
                    if(ten % NEEDED_OCCURENCES == 0 ){
                        this.score++;
                        removeCard(10);
                    }
                    break;

                case 11:
                    eleven++;
                    if(eleven % NEEDED_OCCURENCES == 0 ){
                        this.score++;
                        removeCard(11);
                    }
                    break;

                case 12:
                    twelve++;
                    if(twelve % NEEDED_OCCURENCES == 0 ){
                        this.score++;
                        removeCard(12);
                    }
                    break;

                case 13:
                    thirteen++;
                    if(thirteen % NEEDED_OCCURENCES == 0 ){
                        this.score++;
                        removeCard(13);
                    }
                    break;
            }
        }
        System.out.println(this.user + " Score: " + this.score);
    }
    public int getScore(){
        return this.score;
    }
    public boolean handEmpty(){
        if(this.numCards == 0){
            return false;
        }
        else{
            return true;
        }
    }
    public int playerResponse(){
        Scanner input = new Scanner(System.in);
        System.out.print("Choose a card that you want to play (index of the card): ");
        int number = input.nextInt();
        int numberToDeck = this.myCards[number].getNumber();
        return numberToDeck;

    }
    public String computerGuess(){
        return ("Do you have any " + this.myCards[this.computerGuess].getRank()+ "?(Y/N): ");

    }
    public int computerTurn(){
        System.out.println("Computer Turn:");
        Random rng = new Random();
        int index = rng.nextInt(this.numCards);
        this.computerGuess = index;
        System.out.print("Do you have any " + this.myCards[index].getRank()+ "?(Y/N): ");
        int numberToDeck = this.myCards[index].getNumber();
        return numberToDeck;

    }
        public void goFish( Cards theCard){
        System.out.println(this.user + " Go Fish!!!");
        if(theCard != null){
            this.myCards[this.numCards] = theCard;
            System.out.println("You got " + this.myCards[this.numCards].getRank() + " from deck.");
            this.numCards++;
        }
    }
    public void computerGoFish( Cards theCard){
        System.out.println(this.user + " Go Fish!!!");
        if(theCard != null){
            this.myCards[this.numCards] = theCard;
            System.out.println("The " + this.user + " got a from deck.");
            this.numCards++;
            System.out.println("The " + this.user + " has " + this.numCards + " cards");
        }
    }
    public boolean check(int a){
        for(int i = 0; i < this.numCards; i++){
            if( a == this.myCards[i].getNumber()){
                return true;
            }
        }
        return false;
     }
    public void removeCard(int a){
        int removed = 0;
        for ( int i = 0; i < this.numCards; i++ ) {
            if( a == this.myCards[i].getNumber() ) {
                this.myCards[i] = null;
                removed++;
            }
        }

        // Create new array which excludes any null elements
        Cards[] temp = new Cards[52];
        for ( int i = 0, j = 0; i < this.numCards; i++ )
            if ( this.myCards[i] != null )
                temp[ j++ ] = this.myCards[i];

        // Update class properties
        this.myCards  = temp;
        this.numCards = this.numCards - removed; // numCards stores index of first card on top of deck
    }
    public void swapCard(int a, Player b){
        for(int i = 0; i < b.getnumCards(); i++){
            if( a == b.myCards[i].getNumber()){
                System.out.println("I got " +  b.myCards[i] + " from " + b.getName());
                this.myCards[ this.numCards ] = b.myCards[i];
                this.numCards++;
            }
        }
        System.out.println();
    }
}
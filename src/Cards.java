//Jerrel Sogoni (109619783)

public class Cards {
	// Suits of the cards Hearts, Diamonds, Spades, Clubs
    private Suits cardSuits;
    // Card number : [Ace : 1] , 2, 3, 4, 5, 6 ,7 ,8, 9, 10 , [Jack :11], [Queen:12],[King- 13]
    private int cardNumber;
    //
    public Cards(Suits theSuit, int theNumber){
    	this.cardSuits = theSuit;
    	if (theNumber >= 1 && theNumber <= 13) {
    	    	this.cardNumber = theNumber;	
    	}
    	else {
    		System.out.println("Invalid number of cards");
    	}

    }
    public int getNumber(){
    	return cardNumber;
    }
    public String toString(){
    	String numberStr = "";

    	switch (this.cardNumber) {
    		case 1:
    		numberStr = "ACE_1";
    		break;
    		case 2:
    		numberStr = "TWO_2";
    		break;
    		case 3:
    		numberStr = "THREE_3";
    		break;
    		case 4:
    		numberStr = "FOUR_4";
    		break;
    		case 5:  
    		numberStr = "FIVE_5";
    		break;
    		case 6:
    		numberStr = "SIX_6";
    		break;
    		case 7: 
    		numberStr = "SEVEN_7";
    		break;
    		case 8:
    		numberStr = "EIGHT_8";
    		break;
    		case 9:
    		numberStr = "NINE_9";
    		break;
    		case 10:
    		numberStr = "TEN_10";
    		break;
    		case 11:
    		numberStr = "JACK_11";
    		break;
    		case 12:
    		numberStr = "QUEEN_12";
    		break;
    		case 13:
    		numberStr = "KING_13";
    		break;
    	}
    	return numberStr + " " + cardSuits.toString();
    }
    public String getRank(){
        String numberStr = "";

        switch (this.cardNumber) {
            case 1:
            numberStr = "ACE_1";
            break;
            case 2:
            numberStr = "TWO_2";
            break;
            case 3:
            numberStr = "THREE_3";
            break;
            case 4:
            numberStr = "FOUR_4";
            break;
            case 5:  
            numberStr = "FIVE_5";
            break;
            case 6:
            numberStr = "SIX_6";
            break;
            case 7: 
            numberStr = "SEVEN_7";
            break;
            case 8:
            numberStr = "EIGHT_8";
            break;
            case 9:
            numberStr = "NINE_9";
            break;
            case 10:
            numberStr = "TEN_10";
            break;
            case 11:
            numberStr = "JACK_11";
            break;
            case 12:
            numberStr = "QUEEN_12";
            break;
            case 13:
            numberStr = "KING_13";
            break;
        }
        return numberStr;
    }
}

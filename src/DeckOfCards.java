//Jerrel Sogoni (109619783)

import java.util.Random;

public class DeckOfCards {
    private Cards[] myCards;
    private int numCards;
    public DeckOfCards(){
    	this.numCards = 52;
    	int count = 0;
    	this.myCards = new Cards[this.numCards];
	    	for( int i = 0; i < 4; i++){
	    		for (int ii = 1; ii <= 13 ; ii++) {
	    			this.myCards[count] = new Cards(Suits.values()[i], ii);
	    			count++;
	    		}
	    	}
    	this.shuffle();
    }
    public void shuffle(){
    	Random r = new Random();
    	 Cards temp;
    	 int a;
    	 for (int i = 0 ; i < this.numCards ; i ++ ) {
    	 	a = r.nextInt(this.numCards);
    	 	temp = this.myCards[i];
    	 	this.myCards[i] = this.myCards[a];
    	 	this.myCards[a] = temp;

    	 }
    }
    public Cards nextCard(){
        if(this.numCards == 0){
            System.out.println("No more cards");
            return null;
        }
        else {
        	Cards top = this.myCards[0];
        	for ( int i = 1; i < this.numCards; i ++){
        		this.myCards[i -1] = this.myCards[i];
        	}
        	this.myCards[ this.numCards - 1] = null;
        	this.numCards--;
        	return top;
        }
    }
    public void printDeck(){
    	for( int i = 0 ; i < this.numCards ; i++){
    		System.out.printf("%d  %s\n", i, this.myCards[i].toString());
    	}

    }
    public boolean isEmpty(){
        if( this.myCards == null){
            return false;
        }
        else{
            return true;
        }
    }
}
    

package week06;

public class Application {

	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.describe();
		deck.shuffle();
		deck.describe();		
		Card drawnCard = deck.draw();
		drawnCard.describe();
		
		
		

	}
	

}

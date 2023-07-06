package week06;
public class App {

	public static void main(String[] args) {
		Deck deck = new Deck();
		Player player1 = new Player("player1");
		Player player2 = new Player("player2");
		
		deck.shuffle();
		for(int i = 0; i <= 26; i++ ) {
			
			player1.draw(deck);
			player2.draw(deck);
		}
		
		for(int i = 0; i <= 26; i++) {
			if(player1.flip().getValue() > player2.flip().getValue()) {
				player1.incrementScore();
			} else { 
				player2.incrementScore();
			}
		}

	}

}

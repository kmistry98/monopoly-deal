package game;

import java.util.ArrayList;

import cards.Card;

public  class Board {
	
	private Deck deck;
	Player p1 = new Player();
	Player p2 = new Player();
	
	public Board() {
		deck = new Deck();


		p1.assignCards(5,p1, deck);
		p2.assignCards(5,p2,deck);

		
	}
	
	public Player getPlayer(int x) {
		if (x == 1) {
			return p1;
		} else {
			return p2;
		}
	}
	
	public static void main(String args[]) {
		Board b = new Board();
		ArrayList<Card> player1 = b.getPlayer(1).getHand();
		ArrayList<Card> player2 = b.getPlayer(2).getHand();
		System.out.println(player1.toString());
		System.out.print(player2.toString());
		
		
	}
}

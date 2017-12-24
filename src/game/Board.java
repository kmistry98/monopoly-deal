package game;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

import cards.Card;

public  class Board {

	private static Deck deck;
	Player p1;
	Player p2;

	public Board() {
		deck = new Deck();
		p1 = new Player(deck);
		p2 = new Player(deck);


		p1.assignCards(5,p1);
		p2.assignCards(5,p2);


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
		try {
			for(Card c: player1) {
				if(c.toString().equals("Pass Go")) {
					b.getPlayer(1).playCard(c);
					player1 = b.getPlayer(1).getHand();
					System.out.println(player1.toString());
				}
			}
		}
		catch(ConcurrentModificationException c) {
		}


	}
}

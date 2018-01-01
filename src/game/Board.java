package game;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

import cards.Card;
import view.Hand;
import view.MainBoard;

public  class Board {

	private static Deck deck;
	static Player p1;
	static Player p2;
	static CardsInTheMiddle c;
	private static ArrayList<Card> cardsInTheMiddle = new ArrayList<Card>();


	public Board() {
		deck = new Deck();
		
		p1 = new Player(deck);
		p2 = new Player(deck);


		p1.assignCards(5,p1);
		p2.assignCards(5,p2);


	}

	public static Player getPlayer(int x) {
		if (x == 1) {
			return p1;
		} else {
			return p2;
		}
	}
	public static ArrayList<Card> getCardsInTheMiddle() {
		return cardsInTheMiddle;
	}

//	public static void main(String args[]) {
//		Board b = new Board();
//		ArrayList<Card> player1 = b.getPlayer(1).getHand();
//		ArrayList<Card> player2 = b.getPlayer(2).getHand();
//		System.out.println(player1.toString());
//		System.out.println(player2.toString());
//		Card card = b.getPlayer(1).getHand().get(1);
//		card.transferCard(card,p1,p2);
//		System.out.println(p1.getMoney().toString());
//		System.out.println(p2.getMoney().toString());
//		System.out.println(p1.getProperty().toString());
//		System.out.println(p2.getProperty().toString());
//		
////		try {
////			for(Card c: player1) {
////				if(c.toString().equals("Pass Go")) {
////					b.getPlayer(1).playCard(c);
////					player1 = b.getPlayer(1).getHand();
////					System.out.println(player1.toString());
////				}
////			}
////		}
////		catch(ConcurrentModificationException c) {
////		}
//
//
//	}
}

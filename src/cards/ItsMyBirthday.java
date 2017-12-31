package cards;

import java.util.ArrayList;

import game.Player;

public class ItsMyBirthday extends Card{
	private static final int CASH_ASKED_FOR = 2;
	
	public ItsMyBirthday() {
		super(2, 2, "It's My Birthday!");
	}
	
	public int getPaid(Player p1, Player p2) {
		
		return CASH_ASKED_FOR;
	}
	
	public void play(Player p1, Player p2, ArrayList<Card> c ) {
		p1.pay(2, c, p1, p2);
	}

	
}

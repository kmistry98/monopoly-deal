package cards;

import java.util.ArrayList;

import game.Player;

public class DebtCollector extends Card{
	private static final int CASH_ASKED_FOR = 5;
	
	public DebtCollector() {
		super(2, 3, "Debt Collector");
	}
	public int getPaid(Player p1, Player p2) {
		
		return CASH_ASKED_FOR;
	}
	public void play(Player p1, Player p2, ArrayList<Card> c ) {
		p1.pay(2, c, p1, p2);
	}
	
}

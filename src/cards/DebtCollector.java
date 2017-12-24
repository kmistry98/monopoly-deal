package cards;

import game.Player;

public class DebtCollector extends Card{
	private static final int CASH_ASKED_FOR = 5;
	
	public DebtCollector() {
		super(2, 3, "Debt Collector");
	}
	public int getPaid(Player p1, Player p2) {
		
		return CASH_ASKED_FOR;
	}
	
}

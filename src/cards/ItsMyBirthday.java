package cards;

import game.Player;

public class ItsMyBirthday extends Card{
	private static final int CASH_ASKED_FOR = 2;
	
	public ItsMyBirthday() {
		super(2, 2, "It's My Birthday!");
	}
	
	public int getPaid(Player p1, Player p2) {
		
		return CASH_ASKED_FOR;
	}

	
}

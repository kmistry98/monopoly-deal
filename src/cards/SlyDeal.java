package cards;

import game.Player;

public class SlyDeal extends Card{
	private boolean fullSet;
	
	
	public SlyDeal() {
		super(2, 3, "Sly Deal");
	}
	
	public boolean canSteal() {
		if(fullSet) {
			return false;
		}
		else {
			return true;
		}
	}
	
//	public void play(Property p, Player p1, Player p2) {
//	if(p.getCardsInSet() == a.numberOfCardsInSet(p)) {
//		fullSet = true;
//	}
//}
	
}

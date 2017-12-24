	package cards;

import game.Player;

public class ForcedDeal extends Card{
		private boolean fullSet;
		
		
		public ForcedDeal() {
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
		
//		public void steal(Property p, Player a) {
//			if(p.getCardsInSet() == a.numberOfCardsInSet(p)) {
//				fullSet = true;
//			}
//		}
		
	}



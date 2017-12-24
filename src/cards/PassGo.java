package cards;

import game.Deck;
import game.Player;

public class PassGo extends Card{

	public PassGo() {
		super(2, 1, "Pass Go");
		// TODO Auto-generated constructor stub
	}
	public void passGo(Player p, Deck d) {
		for (int i=0;i>2;i++) {
			p.assignCards(2,p,d);
		}
	}

}

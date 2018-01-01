package cards;

import javax.swing.DefaultListModel;

import game.Player;

public class PassGo extends Card{

	public PassGo() {
		super(2, 1, "Pass Go");
		// TODO Auto-generated constructor stub
	}
	public void play(Player p) {
			p.assignCards(2,p);

		System.out.println("hello");

	}

}

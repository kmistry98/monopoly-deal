package cards;

import game.Board;

public class JustSayNo extends Card{
	

	private static String name = "Just Say No";
		
	public JustSayNo() {
		super(2, 4, name);
	}
	
	public void play() {
		int a = 0;
		for(int i =0;i<Board.getCardsInTheMiddle().size();i++) {
			if(Board.getCardsInTheMiddle().get(i) == this) {
				a=i;
			}
		}
		
		if(Board.getCardsInTheMiddle().get(a-1).getType() == 2) {
			
		}
	}
	
	

}

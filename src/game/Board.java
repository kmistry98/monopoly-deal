package game;



public  class Board {
	
	private Deck deck;
	Player p1 = new Player();
	Player p2 = new Player();
	
	public Board() {
		p1.assignCards(5, p1, deck);
		p2.assignCards(5,p2,deck);
		
		
	}
}

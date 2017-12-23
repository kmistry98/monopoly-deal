package cards;

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
	
}

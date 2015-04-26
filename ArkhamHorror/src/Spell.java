
public class Spell extends Item
{
	int hand;
	
	public Spell(int pHand, String[] uEffects, String[] rEffects) {
		super(null, uEffects, rEffects);
		hand = pHand;
	}
}

public class Spell extends Item
{
	int hand;
	
	public Spell(int pHand, String[] eEffects, String[] uEffects, String[] rEffects) {
		super(null, eEffects, uEffects, rEffects);
		hand = pHand;
	}
}
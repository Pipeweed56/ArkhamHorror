
public class RareItem extends Item
{
	int money;
	int hand;
	
	public RareItem(int pMoney, int pHand,
			String[] hEffects, String[] uEffects, String[] rEffects) {
		super(hEffects, uEffects, rEffects);
		money = pMoney;
		hand = pHand;
	}
}
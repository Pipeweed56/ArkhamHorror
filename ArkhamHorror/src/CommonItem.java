
public class CommonItem extends Item
{
	int money;
	int hand;
	
	public CommonItem(int pMoney, int pHand, String[] pTypes,
			String[] hEffects, String[] eEffects, String[] uEffects, String[] rEffects) {
		super(hEffects, eEffects, uEffects, rEffects);
		types = pTypes;
		money = pMoney;
		hand = pHand;
	}
}
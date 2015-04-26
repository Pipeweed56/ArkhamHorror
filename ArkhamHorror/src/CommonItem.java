
public class CommonItem extends Item
{
	int money;
	int hand;
	
	public CommonItem(int pMoney, int pHand,
			String[] hEffects, String[] uEffects, String[] rEffects) {
		super(hEffects, uEffects, rEffects);
		money = pMoney;
		hand = pHand;
	}
}
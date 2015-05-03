import java.util.Random;

public class UnitTest 
{
	public static void main(String[] args) {
		CardDeck<CommonItem> deck1 = new CardDeck<CommonItem>(new Random());
		deck1.add(new CommonItem(1,1,null,null,null,null, null));
		CommonItem item1;
		System.out.println(deck1.peekTop().money);
		System.out.println(deck1.peekTop().index);
		item1 = deck1.drawTop();
		System.out.println(deck1.cardList.size());
		System.out.println(item1.money);
		System.out.println(item1.index);
	}
}
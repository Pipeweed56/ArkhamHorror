import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class CardDeck
{
	ArrayList<Card> cardList;
	HashMap<String, Card> cardMap;
	Random randSrc;
	
	public CardDeck() {
		cardList = new ArrayList<Card>();
		cardMap = new HashMap<String, Card>();
		randSrc = new Random();
	}
	
	
	public void shuffle() {
		if(cardList.size()<=1)
			return;
		Card tempC;
		int tempI;
		for(int n=cardList.size()-1; n>=0; n--) {
			tempI = randSrc.nextInt(n+1);
			if(tempI==n)
				continue;
			tempC = cardList.get(tempI);
			cardList.set(tempI, cardList.get(n));
			cardList.set(n, tempC);
		}		
	}
}
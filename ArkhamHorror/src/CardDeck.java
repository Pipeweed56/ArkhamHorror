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
	
	public void add(Card target) {
		cardList.add(target);
		if(!cardMap.containsKey(target.name))
			cardMap.put(target.name, target);
		else {
			Card tempC = cardMap.get(target.name);
			while(tempC.next!=null)
				tempC = tempC.next;
			tempC.next = target;
		}
	}
	
	public void insert(Card target, int loc) {
		if(loc>=cardList.size())
			cardList.add(target);
		else
			cardList.add(loc, target);
		if(!cardMap.containsKey(target.name))
			cardMap.put(target.name, target);
		else {
			Card tempC = cardMap.get(target.name);
			while(tempC.next!=null)
				tempC = tempC.next;
			tempC.next = target;
		}
	}
	
	public Card drawTop() {
		
	}
	
	public Card drawSpec(String name) {
		
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class CardDeck<T extends Card>
{
	ArrayList<T> cardList;
	HashMap<String, T> cardMap;
	Random randSrc;
	
	public CardDeck(Random pRandSrc) {
		cardList = new ArrayList<T>();
		cardMap = new HashMap<String, T>();
		randSrc = pRandSrc;
	}
	
	public void add(T target) {
		cardList.add(target);
		target.index = cardList.size()-1;
		if(!cardMap.containsKey(target.name))
			cardMap.put(target.name, target);
		else {
			Card tempC = cardMap.get(target.name);
			while(tempC.next!=null)
				tempC = tempC.next;
			tempC.next = target;
		}
	}
	
	public void insert(T target, int loc) {
		if(loc>cardList.size()) {
			cardList.add(target);
			target.index = cardList.size()-1;
		}
		else {
			cardList.add(loc-1, target);
			target.index = loc-1;
		}
		if(!cardMap.containsKey(target.name))
			cardMap.put(target.name, target);
		else {
			Card tempC = cardMap.get(target.name);
			while(tempC.next!=null)
				tempC = tempC.next;
			tempC.next = target;
		}
	}
	
	@SuppressWarnings("unchecked")
	public T drawTop() {
		if(cardList.size()==0)
			return null;
		T tempC1 = cardList.get(0);
		T tempC2 = cardMap.get(tempC1.name);
		if(tempC2==tempC1)
			cardMap.put(tempC1.name, (T)(tempC2.next));
		else
			while(tempC2.next!=tempC1)
				tempC2 = (T)(tempC2.next);
		tempC2.next = tempC1.next;
		tempC1.next = null;
		tempC1.index = -1;
		cardList.remove(0);
		return tempC1;		
	}
	
	@SuppressWarnings("unchecked")
	public T drawSpec(String name) {
		if(!cardMap.containsKey(name))
			return null;
		T tempC = cardMap.get(name);
		if(tempC.next==null)
			cardMap.remove(name);
		else
			cardMap.put(name, (T)(tempC.next));
		tempC.next = null;
		cardList.remove(tempC.index);
		tempC.index = -1;
		return tempC;
	}
	
	public T peekTop() {
		if(cardList.size()==0)
			return null;
		return cardList.get(0);
	}
	
	public void shuffle() {
		if(cardList.size()<=1)
			return;
		T tempC;
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
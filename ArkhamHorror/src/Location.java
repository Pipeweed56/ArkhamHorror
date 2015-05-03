import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Location
{
	String name;
	// location type: 0 for street, 1 for place, 2 for other-worlds
	int type;
	// stage only for other-world exploration progress
	int stage;
	// whether a real-world location is stable or not
	int stable;
	Gate gate;
	Boolean isClosed;
	int clue;
	ArrayList<Investigator> invList;
	ArrayList<Monster> monsterList;
	ArrayList<Location> neighborList;
	CardDeck<Encounter> encounters;
	
	public Location(String pName, int pType, int pStable, Random pRandSrc) {
		name = pName;
		type = pType;
		stable = pStable;
		stage = 1;
		gate = null;
		isClosed = false;
		clue = 0;
		invList = new ArrayList<Investigator>();
		monsterList = new ArrayList<Monster>();
		neighborList = new ArrayList<Location>();
		encounters = new CardDeck<Encounter>(pRandSrc);
	}
	
	public void addEncounter(Encounter target) {
		encounters.add(target);
	}
	
	public List<Encounter> drawEncounter(int num) {
		if(encounters.size()<num)
			encounters.shuffleAll();
		ArrayList<Encounter> result = new ArrayList<Encounter>();
		for(int n=0; n<num && encounters.size()>0; n++)
			result.add(encounters.drawTop());
		return result;
	}
	
	public void returnEncounter(Encounter target) {
		encounters.returnCard(target);
	}
	
	public void addInvestigator(Investigator target) {
		if(invList.contains(target))
			return;
		invList.add(target);
	}
	
	public void removeInvestigator(Investigator target) {
		invList.remove(target);		
	}
	
	public void addMonster(Monster target) {
		if(monsterList.contains(target))
			return;
		monsterList.add(target);
	}
	
	public void removeMonster(Monster target) {
		monsterList.remove(target);
	}
	
	public void addClue(int num) {
		clue += num;
	}
	
	public int getClue(int num) {
		if(clue<num)
			return -1;
		return clue -= num;
	}
	
	public int countClue() {
		return clue;
	}
}
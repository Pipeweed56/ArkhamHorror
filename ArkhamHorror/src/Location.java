import java.util.ArrayList;

public class Location
{
	String name;
	// location type: 0 for street, 1 for place, 2 for other-worlds
	int type;
	// stage only for other-world exploration progress
	int stage;
	Gate gate;
	Boolean closed;
	int clue;
	ArrayList<Investigator> invList;
	ArrayList<Monster> monsterList;
	ArrayList<Location> neighborList;
	
	public Location(String pName, int pType) {
		name = pName;
		type = pType;
		stage = 1;
		gate = null;
		closed = false;
		clue = 0;
		invList = new ArrayList<Investigator>();
		monsterList = new ArrayList<Monster>();
		neighborList = new ArrayList<Location>();
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
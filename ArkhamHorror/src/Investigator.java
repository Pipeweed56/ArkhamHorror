import java.util.HashMap;

public class Investigator extends Card
{
	int money;
	int maxHealth, maxSanity;
	int health, sanity;
	int movePoint;
	int focus;
	int hand;
	int clue;
	String startLoc;
	
	int[][] speed_sneak, fight_will, lore_luck;	
	
	HashMap<String, CommonItem> commonList;
	HashMap<String, RareItem> rareList;
	HashMap<String, Spell> spellList;
	HashMap<String, Skill> skillList;
	HashMap<String, Ally> allyList;
	HashMap<String, Monster> monsterTrophy;
	HashMap<String, Gate> gateTrophy;
	HashMap<String, Integer> effectList;
	
	public Investigator(String pName, int iMoney, int pMH, int pMS,	int pFocus, 
			int sSpeed, int sSneak, int sFight, int sWill, int sLore, int sLuck,
			int pClue, String sLoc) {
		name = pName;
		money = iMoney;
		maxHealth = pMH;
		maxSanity = pMS;
		health = maxHealth;
		sanity = maxSanity;
		focus = pFocus;
		clue = pClue;
		startLoc = sLoc;
		
		hand = 2;
		
		speed_sneak = new int[2][4];
		fight_will = new int[2][4];
		lore_luck = new int[2][4];
		for(int n=0; n<4; n++) {
			speed_sneak[0][n] = sSpeed-3+n;
			speed_sneak[1][n] = sSneak-n;
			fight_will[0][n] = sFight-3+n;
			fight_will[1][n] = sWill-n;
			lore_luck[0][n] = sLore-3+n;
			lore_luck[1][n] = sLuck-n;
		}
		
		commonList = new HashMap<String, CommonItem>();
		rareList = new HashMap<String, RareItem>();
		spellList = new HashMap<String, Spell>();
		skillList = new HashMap<String, Skill>();
		allyList = new HashMap<String, Ally>();
		monsterTrophy = new HashMap<String, Monster>();
		gateTrophy = new HashMap<String, Gate>();
		effectList = new HashMap<String, Integer>();
	}
}
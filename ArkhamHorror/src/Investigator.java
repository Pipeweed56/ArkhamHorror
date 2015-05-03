import java.util.HashMap;

public class Investigator extends Card
{
	int money;
	int maxStamina, maxSanity;
	int stamina, sanity;
	int movePoint;
	int focus;
	int hand;
	int clue;
	String startLoc;
	
	// Some status variables
	boolean isBlessed;
	boolean hasRetainer;
	boolean isPolice;
	boolean isLodgeMember;
	
	int[][] speed_sneak, fight_will, lore_luck;	
	
	HashMap<String, CommonItem> commonList;
	HashMap<String, UniqueItem> uniqueList;
	HashMap<String, Spell> spellList;
	HashMap<String, Skill> skillList;
	HashMap<String, Ally> allyList;
	HashMap<String, Monster> monsterTrophy;
	HashMap<String, Gate> gateTrophy;
	HashMap<String, Integer> effectList;
	HashMap<String, Object[]> actionList;
	
	public Investigator(String pName, int iMoney, int pMSta, int pMSan,	int pFocus, 
			int sSpeed, int sSneak, int sFight, int sWill, int sLore, int sLuck,
			int pClue, String sLoc, boolean pIsBlessed, boolean pHasRetainer,
			boolean pIsPolice, boolean pIsLodgeMember) {
		name = pName;
		money = iMoney;
		maxStamina = pMSta;
		maxSanity = pMSan;
		stamina = maxStamina;
		sanity = maxSanity;
		focus = pFocus;
		clue = pClue;
		startLoc = sLoc;
		
		hand = 2;
		
		isBlessed = pIsBlessed;
		hasRetainer = pHasRetainer;
		isPolice = pIsPolice;
		isLodgeMember = pIsLodgeMember;
		
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
		uniqueList = new HashMap<String, UniqueItem>();
		spellList = new HashMap<String, Spell>();
		skillList = new HashMap<String, Skill>();
		allyList = new HashMap<String, Ally>();
		monsterTrophy = new HashMap<String, Monster>();
		gateTrophy = new HashMap<String, Gate>();
		effectList = new HashMap<String, Integer>();
		actionList = new HashMap<String, Object[]>();
	}
}
public class Monster extends Card
{
	int combatMod, horrorMod;
	int lifeDamage, sanityDamage;
	int toughness, awareness;
	// Sign determines movement (0-moon,1-hexagon)
	int sign;
	// Movement type: 0 for normal; 1 for stationary; 2 for flying; 3 for fast
	int movement;
	// Ability
	String[] abilities;
	
	String[] victoryEffects;
	String[] defeatEffects;
	
	public Monster(String pName, int cMod, int hMod, int lDam, int sDam, int tough, int aware,
			int pSign, int pMove, String[] vEffects, String[] dEffects, String[] pAbilities) {
		name = pName;
		combatMod = cMod;
		horrorMod = hMod;
		lifeDamage = lDam;
		sanityDamage = sDam;
		toughness = tough;
		awareness = aware;
		sign = pSign;
		movement = pMove;
		
		victoryEffects = vEffects;
		defeatEffects = dEffects;
		abilities = pAbilities;
	}
}
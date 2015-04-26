public class Monster extends Card
{
	int combatMod, horrorMod;
	int lifeDamage, sanityDamage;
	int toughness;
	// Sign determines movement
	int sign;
	// Monster type: 0 for normal; 1 for stationary; 2 for flying; 3 for fast
	int type;
	
	String victoryEffect;
	String defeatEffect;
	
	public Monster(String pName, int cMod, int hMod, int lDam, int sDam, int tough,
			int pSign, int pType, String vEffect, String dEffect) {
		name = pName;
		combatMod = cMod;
		horrorMod = hMod;
		lifeDamage = lDam;
		sanityDamage = sDam;
		toughness = tough;
		sign = pSign;
		type = pType;
		
		victoryEffect = vEffect;
		defeatEffect = dEffect;
	}
}
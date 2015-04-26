import java.util.Random;
import java.util.HashMap;

public class GameMaster
{
	Random randSrc;
	HashMap<String, Location> locList;
	
	public void initializeGame() {
		randSrc = new Random();
		locList = new HashMap<String, Location>();
	}
	
	public int[] rollDice(int num) {
		int[] results = new int[num];
		for(int n=0; n<num; n++)
			results[n] = randSrc.nextInt(6)+1;
		return results;
	}
}
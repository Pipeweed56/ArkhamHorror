public class Item extends Card
{
	boolean exhausted;
	String[] holdEffects;
	String[] useEffects;
	String[] refreshEffects;
	
	public Item(String[] hEffects, String[] uEffects, String[] rEffects) {
		exhausted = false;
		holdEffects = hEffects;
		useEffects = uEffects;
		refreshEffects = rEffects;
	}
	
	public String[] hold() {
		return holdEffects;
	}
	
	public String[] use() {
		return useEffects;
	}
}
public class Item extends Card
{
	boolean exhausted;
	String[] holdEffects;
	String[] equipEffects;
	String[] useEffects;
	String[] refreshEffects;
	String[] types;
	
	public Item(String[] hEffects, String[] eEffects, String[] uEffects, String[] rEffects) {
		exhausted = false;
		holdEffects = hEffects;
		equipEffects = eEffects;
		useEffects = uEffects;
		refreshEffects = rEffects;
	}
	
	public String[] hold() {
		return holdEffects;
	}
	
	public String[] equip() {
		return equipEffects;
	}
	
	public String[] use() {
		return useEffects;
	}
}
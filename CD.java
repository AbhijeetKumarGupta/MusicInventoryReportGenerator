package MusicInventory;

public class CD extends Music {

	int formatMusic;
	int playingLength;
	boolean specialOrder;

	CD(String mId, String disItNa, int invenQuan, double itePr) {
		super(mId, disItNa, invenQuan, itePr);
	}

	public CD(String mId, String disItNa, int invenQuan, double itePr, int formatMusic, int playingLength,
			boolean specialOrder) {
		super(mId, disItNa, invenQuan, itePr);
		this.formatMusic = formatMusic;
		this.playingLength = playingLength;
		this.specialOrder = specialOrder;
	}

	public int getFormatMusic() {
		return formatMusic;
	}

	public void setFormatMusic(int formatMusic) {
		this.formatMusic = formatMusic;
	}

	public int getPlayingLength() {
		return playingLength;
	}

	public void setPlayingLength(int playingLength) {
		this.playingLength = playingLength;
	}

	public boolean isSpecialOrder() {
		return specialOrder;
	}

	public void setSpecialOrder(boolean specialOrder) {
		this.specialOrder = specialOrder;
	}

	@Override
	public String toString() {
		return "CD [ musicID = " + musicID + ", displayItemName = " + displayItemName + ", inventoryQuantity = "+ inventoryQuantity + 
				", itemPrice =" + itemPrice + "formatMusic = " + formatMusic + ", playingLength = " + playingLength + ", specialOrder = " 
				+ specialOrder +  "]";
	}
	
}

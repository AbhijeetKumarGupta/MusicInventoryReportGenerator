package MusicInventory;

public class Vinyl_Album {

	int formatMusic;
	int playingLength;
	boolean specialOrder;
	
	public Vinyl_Album(int formatMusic, int playingLength, boolean specialOrder) {
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
		return "Vinyl_Album [formatMusic=" + formatMusic + ", playingLength=" + playingLength + ", specialOrder="
				+ specialOrder + "]";
	}
	
}

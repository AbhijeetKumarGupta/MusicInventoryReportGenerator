package MusicInventory;

public abstract class Music {
	String musicID;
	String displayItemName;
	int inventoryQuantity;
	double itemPrice;

	public Music(String musicID, String displayItemName, int inventoryQuantity, double itemPrice) {
		this.musicID = musicID;
		this.displayItemName = displayItemName;
		this.inventoryQuantity = inventoryQuantity;
		this.itemPrice = itemPrice;
	}

	public String getMusicID() {
		return musicID;
	}

	public String getDisplayItemName() {
		return displayItemName;
	}

	public int getInventoryQuantity() {
		return inventoryQuantity;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	
}

package lk.ijse.boot_wholesale.dto;

public class ItemDTO {
	private String itemId;
	private String itemName;
	private int itemQty;
	private double itemPrice;
	
	public ItemDTO() {
		super();
	}

	public ItemDTO(String itemId, String itemName, int itemQty, double itemPrice) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemQty = itemQty;
		this.itemPrice = itemPrice;
	}

	public String getItemId() {
		return itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public int getItemQty() {
		return itemQty;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public void setItemQty(int itemQty) {
		this.itemQty = itemQty;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	@Override
	public String toString() {
		return "ItemDTO [itemId=" + itemId + ", itemName=" + itemName + ", itemQty=" + itemQty + ", itemPrice="
				+ itemPrice + "]";
	}	
	
}

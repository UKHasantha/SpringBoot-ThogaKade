package lk.ijse.boot_wholesale.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {
	@Id
	private String itemId;
	private String itemName;
	private String itemQty;
	private double itemPrice;
	
	public Item() {
		super();
	}

	public Item(String itemId, String itemName, String itemQty, double itemPrice) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemQty = itemQty;
		this.itemPrice = itemPrice;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemQty() {
		return itemQty;
	}

	public void setItemQty(String itemQty) {
		this.itemQty = itemQty;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", itemQty=" + itemQty + ", itemPrice=" + itemPrice
				+ "]";
	}

	

}

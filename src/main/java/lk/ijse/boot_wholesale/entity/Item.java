package lk.ijse.boot_wholesale.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Item")
public class Item {
	@Id
	private String itemId;
	private String itemName;
	private int itemQty;
	private double itemPrice;
	
	public Item() {
		super();
	}

	public Item(String itemId, String itemName, int itemQty, double itemPrice) {
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
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", itemQty=" + itemQty + ", itemPrice=" + itemPrice
				+ "]";
	}
	
}

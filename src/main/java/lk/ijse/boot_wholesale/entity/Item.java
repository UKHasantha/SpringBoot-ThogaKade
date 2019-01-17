package lk.ijse.boot_wholesale.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {
	@Id
	private String code;
	private String discription;
	private Double unitPrice;
	private int QtyOnHand;
	
	public Item() {
		super();
	}

	public Item(String code, String discription, Double unitPrice, int qtyOnHand) {
		super();
		this.code = code;
		this.discription = discription;
		this.unitPrice = unitPrice;
		this.QtyOnHand = qtyOnHand;
	}

	public String getCode() {
		return code;
	}

	public String getDiscription() {
		return discription;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public int getQtyOnHand() {
		return QtyOnHand;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public void setQtyOnHand(int qtyOnHand) {
		QtyOnHand = qtyOnHand;
	}

	@Override
	public String toString() {
		return "Item [code=" + code + ", discription=" + discription + ", unitPrice=" + unitPrice + ", QtyOnHand="
				+ QtyOnHand + "]";
	}

	
}

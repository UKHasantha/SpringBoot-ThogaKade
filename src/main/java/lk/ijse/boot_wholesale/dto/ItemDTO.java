package lk.ijse.boot_wholesale.dto;

public class ItemDTO {
	private String code;
	private String discription;
	private Double unitPrice;
	private int QtyOnHand;
	
	public ItemDTO() {
		super();
	}

	public ItemDTO(String code, String discription, Double unitPrice, int qtyOnHand) {
		super();
		this.code = code;
		this.discription = discription;
		this.unitPrice = unitPrice;
		QtyOnHand = qtyOnHand;
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
		return "ItemDTO [code=" + code + ", discription=" + discription + ", unitPrice=" + unitPrice + ", QtyOnHand="
				+ QtyOnHand + "]";
	}
	
}

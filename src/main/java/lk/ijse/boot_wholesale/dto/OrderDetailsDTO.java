package lk.ijse.boot_wholesale.dto;

import lk.ijse.boot_wholesale.entity.DetailOrders_PK;
import lk.ijse.boot_wholesale.entity.Item;
import lk.ijse.boot_wholesale.entity.Orders;

public class OrderDetailsDTO {
	private double quantity;
	private double unitprice;
	private Item code;
	private Orders orders;
	private DetailOrders_PK detailOrders_PK;
	
	public OrderDetailsDTO() {
		super();
	}

	public OrderDetailsDTO(double quantity, double unitprice, Item code, Orders orders,
			DetailOrders_PK detailOrders_PK) {
		super();
		this.quantity = quantity;
		this.unitprice = unitprice;
		this.code = code;
		this.orders = orders;
		this.detailOrders_PK = detailOrders_PK;
	}

	public double getQuantity() {
		return quantity;
	}

	public double getUnitprice() {
		return unitprice;
	}

	public Item getCode() {
		return code;
	}

	public Orders getOrders() {
		return orders;
	}

	public DetailOrders_PK getDetailOrders_PK() {
		return detailOrders_PK;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public void setUnitprice(double unitprice) {
		this.unitprice = unitprice;
	}

	public void setCode(Item code) {
		this.code = code;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	public void setDetailOrders_PK(DetailOrders_PK detailOrders_PK) {
		this.detailOrders_PK = detailOrders_PK;
	}

	@Override
	public String toString() {
		return "OrderDetailsDTO [quantity=" + quantity + ", unitprice=" + unitprice + ", code=" + code + ", orders="
				+ orders + ", detailOrders_PK=" + detailOrders_PK + "]";
	}
	
}

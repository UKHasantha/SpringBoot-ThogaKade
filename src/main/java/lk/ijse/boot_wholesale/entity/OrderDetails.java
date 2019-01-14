package lk.ijse.boot_wholesale.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

@Entity
public class OrderDetails implements Serializable{

	private int quantity;
	private double unitprice;
	  
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumns(@JoinColumn(name="oID",referencedColumnName="oID",insertable=false,updatable=false))
	private Orders order;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumns(@JoinColumn(name="code",referencedColumnName="code",insertable=false,updatable=false))
	private Item item;
		
	@EmbeddedId
	private DetailOrders_PK orderDetails_PK;
	
	public OrderDetails() {
		super();
	}

	public OrderDetails(int quantity, double unitprice, Orders order, Item item, DetailOrders_PK orderDetails_PK) {
		super();
		this.quantity = quantity;
		this.unitprice = unitprice;
		this.order = order;
		this.item = item;
		this.orderDetails_PK = orderDetails_PK;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getUnitprice() {
		return unitprice;
	}

	public Orders getOrder() {
		return order;
	}

	public Item getItem() {
		return item;
	}

	public DetailOrders_PK getOrderDetails_PK() {
		return orderDetails_PK;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setUnitprice(double unitprice) {
		this.unitprice = unitprice;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public void setOrderDetails_PK(DetailOrders_PK orderDetails_PK) {
		this.orderDetails_PK = orderDetails_PK;
	}

	@Override
	public String toString() {
		return "OrderDetails [quantity=" + quantity + ", unitprice=" + unitprice + ", order=" + order + ", item=" + item
				+ ", orderDetails_PK=" + orderDetails_PK + "]";
	}
	
}

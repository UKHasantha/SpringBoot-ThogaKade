package lk.ijse.boot_wholesale.entity;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

@Entity
public class OrderDetails {

	private String odDate;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumns(@JoinColumn(name="orderid",referencedColumnName="orderid",insertable=false,updatable=false))
	private Orders order;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumns(@JoinColumn(name="itemid",referencedColumnName="itemid",insertable=false,updatable=false))
	private Item item;
		
	@EmbeddedId
	private DetailOrders_PK orderDetails_PK;
	
	public OrderDetails() {
		super();
	}

	public OrderDetails(String odDate, Orders order, Item item, DetailOrders_PK orderDetails_PK) {
		super();
		this.odDate = odDate;
		this.order = order;
		this.item = item;
		this.orderDetails_PK = orderDetails_PK;
	}

	public String getOdDate() {
		return odDate;
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

	public void setOdDate(String odDate) {
		this.odDate = odDate;
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
		return "OrderDetails [odDate=" + odDate + ", order=" + order + ", item=" + item + ", orderDetails_PK="
				+ orderDetails_PK + "]";
	}
	
}

package lk.ijse.boot_wholesale.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class DetailOrders_PK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String orderid;
	private String itemId;
	
	
	
	public DetailOrders_PK() {
		super();
	}

	public DetailOrders_PK(String orderid, String itemId) {
		super();
		this.orderid = orderid;
		this.itemId = itemId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getOrderid() {
		return orderid;
	}

	public String getItemId() {
		return itemId;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	
	

}

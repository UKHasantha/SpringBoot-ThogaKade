package lk.ijse.boot_wholesale.entity;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Orders")
public class Orders {
	
	@Id
	private String orderid;
    private String orderdate;
    private String orderqty;
    private double orderprice;
     
    @ManyToOne(cascade=CascadeType.ALL)
    private User user;

	public Orders() {
		super();
	}

	public Orders(String orderid, String orderdate, String orderqty, double orderprice) {
		super();
		this.orderid = orderid;
		this.orderdate = orderdate;
		this.orderqty = orderqty;
		this.orderprice = orderprice;
	}

	public String getOrderid() {
		return orderid;
	}

	public String getOrderdate() {
		return orderdate;
	}

	public String getOrderqty() {
		return orderqty;
	}

	public double getOrderprice() {
		return orderprice;
	}

	public User getUser() {
		return user;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public void setOrderdate(String orderdate) {
		this.orderdate = orderdate;
	}

	public void setOrderqty(String orderqty) {
		this.orderqty = orderqty;
	}

	public void setOrderprice(double orderprice) {
		this.orderprice = orderprice;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Orders [orderid=" + orderid + ", orderdate=" + orderdate + ", orderqty=" + orderqty + ", orderprice="
				+ orderprice + ", user=" + user + "]";
	}
	
}

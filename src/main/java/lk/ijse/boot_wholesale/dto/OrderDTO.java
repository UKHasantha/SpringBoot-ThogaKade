package lk.ijse.boot_wholesale.dto;

public class OrderDTO {
	private String orderid;
    private String orderdate;
    private String orderqty;
    private double orderprice;
    private UserDTO userId;
    
	public OrderDTO() {
		super();
	}

	public OrderDTO(String orderid, String orderdate, String orderqty, double orderprice, UserDTO userId) {
		super();
		this.orderid = orderid;
		this.orderdate = orderdate;
		this.orderqty = orderqty;
		this.orderprice = orderprice;
		this.userId = userId;
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

	public UserDTO getUserId() {
		return userId;
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

	public void setUserId(UserDTO userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "OrderDTO [orderid=" + orderid + ", orderdate=" + orderdate + ", orderqty=" + orderqty + ", orderprice="
				+ orderprice + ", userId=" + userId + "]";
	}
    
    
    
}

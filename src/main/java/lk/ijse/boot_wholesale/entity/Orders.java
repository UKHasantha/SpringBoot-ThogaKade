package lk.ijse.boot_wholesale.entity;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Orders {
	
	@Id
	private String oID;
	private String date;
	private double totalPrice;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private User user;
	
	public Orders() {
		super();
	}
	
	public Orders(String oID, String date, double totalPrice, User user) {
		super();
		this.oID = oID;
		this.date = date;
		this.totalPrice = totalPrice;
		this.user = user;
	}
	
	public String getoID() {
		return oID;
	}
	public String getDate() {
		return date;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public User getUser() {
		return user;
	}
	public void setoID(String oID) {
		this.oID = oID;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Orders [oID=" + oID + ", date=" + date + ", totalPrice=" + totalPrice + ", user=" + user + "]";
	}
	
}

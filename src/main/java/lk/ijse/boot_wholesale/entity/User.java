package lk.ijse.boot_wholesale.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {
	@Id
	private String userId;
	private String userName;
	private String userContact;
	private String userAddress;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<Orders> orders;
	
	public User() {
		super();
	}

	public User(String userId, String userName, String userContact, String userAddress) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userContact = userContact;
		this.userAddress = userAddress;
	}

	public String getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public String getUserContact() {
		return userContact;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public List<Orders> getOrders() {
		return orders;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setUserContact(String userContact) {
		this.userContact = userContact;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userContact=" + userContact + ", userAddress="
				+ userAddress + ", orders=" + orders + "]";
	}

	
}

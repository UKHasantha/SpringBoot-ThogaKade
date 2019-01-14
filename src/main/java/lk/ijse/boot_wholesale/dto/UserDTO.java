package lk.ijse.boot_wholesale.dto;

import java.util.ArrayList;

public class UserDTO {
	private String userId;
	private String userName;
	private String userContact;
	private String userAddress;
    private ArrayList<OrdersDTO> ordersDTOs;
	
	public UserDTO() {
		super();
	}

	public UserDTO(String userId, String userName, String userContact, String userAddress) {
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

	public ArrayList<OrdersDTO> getOrderDTOs() {
		return ordersDTOs;
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

	public void setOrderDTOs(ArrayList<OrdersDTO> ordersDTOs) {
		this.ordersDTOs = ordersDTOs;
	}

	@Override
	public String toString() {
		return "UserDTO [userId=" + userId + ", userName=" + userName + ", userContact=" + userContact
				+ ", userAddress=" + userAddress + ", orderDTOs=" + ordersDTOs + "]";
	}
	
}

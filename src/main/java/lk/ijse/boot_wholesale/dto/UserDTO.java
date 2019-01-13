package lk.ijse.boot_wholesale.dto;

public class UserDTO {
	private String userId;
	private String userName;
	private String userContact;
	private String userAddress;
	
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

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserContact() {
		return userContact;
	}

	public void setUserContact(String userContact) {
		this.userContact = userContact;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	@Override
	public String toString() {
		return "UserDTO [userId=" + userId + ", userName=" + userName + ", userContact=" + userContact
				+ ", userAddress=" + userAddress + "]";
	}
		
	
}

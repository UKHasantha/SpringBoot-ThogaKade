package lk.ijse.boot_wholesale.dto;

public class OrdersDTO {

	private String oID;
	private String date;
	private double totalPrice;
	private UserDTO userDTO;
	
	
	public OrdersDTO() {
		super();
	}


	public OrdersDTO(String oID, String date, double totalPrice, UserDTO userDTO) {
		super();
		this.oID = oID;
		this.date = date;
		this.totalPrice = totalPrice;
		this.userDTO = userDTO;
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


	public UserDTO getUserDTO() {
		return userDTO;
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


	public void setUserDTO(UserDTO userDTO) {
		this.userDTO = userDTO;
	}


	@Override
	public String toString() {
		return "OrdersDTO [oID=" + oID + ", date=" + date + ", totalPrice=" + totalPrice + ", userDTO=" + userDTO + "]";
	}
	
	
    
}

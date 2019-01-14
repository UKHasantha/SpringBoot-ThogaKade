package lk.ijse.boot_wholesale.dto;

public class DetailOrder_PKDTO {
	private String code;
	private String oID;
	
	
	public DetailOrder_PKDTO() {
		super();
	}
	public DetailOrder_PKDTO(String code, String oID) {
		super();
		this.code = code;
		this.oID = oID;
	}
	public String getCode() {
		return code;
	}
	public String getoID() {
		return oID;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public void setoID(String oID) {
		this.oID = oID;
	}
	@Override
	public String toString() {
		return "DetailOrder_PKDTO [code=" + code + ", oID=" + oID + "]";
	}
	
	
}

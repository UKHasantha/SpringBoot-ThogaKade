package lk.ijse.boot_wholesale.entity;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class DetailOrders_PK implements Serializable{

	private String code;
	private String oID;
	
	public DetailOrders_PK() {
		super();
	}
	
	public DetailOrders_PK(String code, String oID) {
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
		return "DetailOrders_PK [code=" + code + ", oID=" + oID + "]";
	}
	
	
}

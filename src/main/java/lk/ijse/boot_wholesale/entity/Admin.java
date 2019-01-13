package lk.ijse.boot_wholesale.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Admin")
public class Admin {
	@Id
	private String adminId;
	private String adminName;
	private String adminEmail;
	private String adminPassword;
	
	public Admin() {
		super();
	}

	public Admin(String adminId, String adminName, String adminEmail, String adminPassword) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminEmail = adminEmail;
		this.adminPassword = adminPassword;
	}

	public String getAdminId() {
		return adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public String getAdminEmail() {
		return adminEmail;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", adminEmail=" + adminEmail
				+ ", adminPassword=" + adminPassword + "]";
	}

}

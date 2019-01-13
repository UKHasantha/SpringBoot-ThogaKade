package lk.ijse.boot_wholesale.service;

import java.util.ArrayList;

import lk.ijse.boot_wholesale.dto.AdminDTO;

public interface AdminService {
	
    public ArrayList<AdminDTO> getAllAdmins();
    public boolean saveAdmin(AdminDTO adminDTO);
    public boolean deleteAdmin(String adminid);
    public long getTotalAdmins();
    public AdminDTO searchAdmin(String adminid);
    public boolean updateAdmin(AdminDTO adminDTO);
    
}

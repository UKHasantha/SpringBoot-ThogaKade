package lk.ijse.boot_wholesale.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.ijse.boot_wholesale.dto.AdminDTO;
import lk.ijse.boot_wholesale.entity.Admin;
import lk.ijse.boot_wholesale.repository.AdminRepository;
import lk.ijse.boot_wholesale.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminRepository adminRepository;
	
	@Override
	public ArrayList<AdminDTO> getAllAdmins() {
		ArrayList<AdminDTO> allAdmins=new ArrayList<>();
		List<Admin> admin=adminRepository.findAll();
		for (Admin admin2 : admin) {
			AdminDTO adminDTO=new AdminDTO(admin2.getAdminId(),admin2.getAdminName(),admin2.getAdminEmail(),admin2.getAdminPassword());
			allAdmins.add(adminDTO);
		}
		return allAdmins;
	}

	@Override
	public boolean saveAdmin(AdminDTO adminDTO) {
		Admin admin=new Admin(adminDTO.getAdminId(),adminDTO.getAdminName(),adminDTO.getAdminEmail(),adminDTO.getAdminPassword());
		System.out.println("dtos"+adminDTO);
		adminRepository.save(admin);
		return true;
	}

	@Override
	public boolean deleteAdmin(String adminid) {
		adminRepository.deleteById(adminid);
		return true;
	}

	@Override
	public long getTotalAdmins() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public AdminDTO searchAdmin(String adminid) {
		Admin admin=adminRepository.findById(adminid).get();
		AdminDTO adminDTO=new AdminDTO();
		adminDTO.getAdminId();
		adminDTO.getAdminName();
		adminDTO.getAdminEmail();
		return null;
	}
	 @Override
	 public boolean updateAdmin(AdminDTO adminDTO) {
		 Admin admin = new Admin();
		 admin.getAdminId();
		 admin.getAdminName();
		 admin.getAdminEmail();
		 admin.getAdminPassword();
		 if (adminRepository.existsById(adminDTO.getAdminId())) {
			adminRepository.save(admin);
		}
		 return true;
	 }

}

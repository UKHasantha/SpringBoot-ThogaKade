package lk.ijse.boot_wholesale.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ijse.boot_wholesale.dto.AdminDTO;
import lk.ijse.boot_wholesale.service.AdminService;

@RestController
@CrossOrigin
@RequestMapping("api/v1/admins")
public class AdminController {
	
	@Autowired
	private AdminService adminservice;
	
	@PostMapping(value="/saveuser")
	public boolean saveAdmin(@RequestBody AdminDTO adminDTO) {
		System.out.println("dto "+adminDTO);
		return adminservice.saveAdmin(adminDTO);
	}
	@GetMapping(value="/getAllAdmins")
	public ArrayList<AdminDTO> getAllAdminDTO(){
		return adminservice.getAllAdmins();
	}
	@PutMapping(value="/updateadmins")
	public boolean updateAdmin(@RequestBody AdminDTO adminDTO) {
		return adminservice.updateAdmin(adminDTO);
	}
	@GetMapping(value="/{id}")
	public AdminDTO findById(@PathVariable("id") String adminid) {
		return adminservice.searchAdmin(adminid);
	}
	@DeleteMapping(value="/{id}")
	public boolean deleteAdmin(@PathVariable("id")String adminid) {
		return adminservice.deleteAdmin(adminid);
	}
}

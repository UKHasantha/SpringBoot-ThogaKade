package lk.ijse.boot_wholesale.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ijse.boot_wholesale.dto.UserDTO;
import lk.ijse.boot_wholesale.service.UserService;

@RestController
@CrossOrigin
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping
	public boolean saveUser(@RequestBody UserDTO userDTO) {
		return userService.saveUser(userDTO);
	}
	
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public ArrayList<UserDTO> getAllUsers(UserDTO userDTO){
		return userService.getAllUsers(userDTO);
	}
	
}

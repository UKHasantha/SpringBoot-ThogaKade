package lk.ijse.boot_wholesale.service;

import java.util.ArrayList;

import lk.ijse.boot_wholesale.dto.UserDTO;

public interface UserService {
	public ArrayList<UserDTO> getAllUsers(UserDTO userDTO);
	public boolean saveUser(UserDTO userDTO);
	public boolean deleteUser(String userId);
	public boolean updateUser(UserDTO userDTO);
	public long getTotalUsers();
	public UserDTO getUser(UserDTO userDTO);
	public UserDTO searchUser(String userId);
}

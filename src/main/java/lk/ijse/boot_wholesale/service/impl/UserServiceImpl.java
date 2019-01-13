package lk.ijse.boot_wholesale.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.ijse.boot_wholesale.dto.UserDTO;
import lk.ijse.boot_wholesale.entity.User;
import lk.ijse.boot_wholesale.repository.UserRepository;
import lk.ijse.boot_wholesale.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public ArrayList<UserDTO> getAllUsers(UserDTO userDTO) {
		ArrayList<UserDTO> AllUsers=new ArrayList<>();
		List<User> user=userRepository.findAll();
		for (User user2 : user) {
			UserDTO userDTOs=new UserDTO(user2.getUserId(),user2.getUserName(),user2.getUserContact(),user2.getUserAddress());
			AllUsers.add(userDTOs);
		}
		return AllUsers;
	}

	@Override
	public boolean saveUser(UserDTO userDTO) {
		User user=new User(userDTO.getUserId(),userDTO.getUserName(),userDTO.getUserContact(),userDTO.getUserAddress());
		userRepository.save(user);
		return true;
	}

	@Override
	public boolean deleteUser(String userId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUser(UserDTO userDTO) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long getTotalUsers() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public UserDTO getUser(UserDTO userDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDTO searchUser(String userId) {
		User user=userRepository.findById(userId).get();
		UserDTO userDTO=new UserDTO();
		userDTO.getUserId();
		userDTO.getUserName();
		userDTO.getUserContact();
		userDTO.getUserAddress();
		
		return userDTO;
	}

}

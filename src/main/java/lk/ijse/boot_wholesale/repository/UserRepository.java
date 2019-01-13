package lk.ijse.boot_wholesale.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lk.ijse.boot_wholesale.entity.User;

public interface UserRepository extends JpaRepository<User, String>{

}

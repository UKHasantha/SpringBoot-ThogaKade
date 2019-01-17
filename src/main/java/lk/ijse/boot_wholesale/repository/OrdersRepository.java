package lk.ijse.boot_wholesale.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import lk.ijse.boot_wholesale.entity.Orders;

public interface OrdersRepository extends JpaRepository<Orders, String>{
	
}

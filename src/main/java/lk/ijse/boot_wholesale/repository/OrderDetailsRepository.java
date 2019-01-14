package lk.ijse.boot_wholesale.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lk.ijse.boot_wholesale.entity.OrderDetails;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Integer>{

}

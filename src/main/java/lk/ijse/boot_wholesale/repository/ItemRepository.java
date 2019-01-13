package lk.ijse.boot_wholesale.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lk.ijse.boot_wholesale.entity.Item;

public interface ItemRepository extends JpaRepository<Item, String>{

}

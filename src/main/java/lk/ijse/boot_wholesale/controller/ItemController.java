package lk.ijse.boot_wholesale.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ijse.boot_wholesale.dto.ItemDTO;
import lk.ijse.boot_wholesale.service.ItemService;

@CrossOrigin
@RequestMapping("api/v1/items")
@RestController
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@PostMapping
	public boolean saveItem(@RequestBody ItemDTO itemDTO) {
		System.out.println("Item:"+itemDTO);
		return itemService.saveItem(itemDTO);
	}
	
	@GetMapping
	public ArrayList<ItemDTO> getAllItems(ItemDTO itemDTO) {
		System.out.println("Item:"+itemDTO);
		return itemService.getAllItems();
	}
	@DeleteMapping(value = "/{id}")
	public boolean deleteItem(@PathVariable("id") String itemId) {
		return itemService.deleteItem(itemId);
	}
}

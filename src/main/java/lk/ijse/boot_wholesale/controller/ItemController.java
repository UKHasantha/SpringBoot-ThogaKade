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

import lk.ijse.boot_wholesale.dto.ItemDTO;
import lk.ijse.boot_wholesale.service.ItemService;

@CrossOrigin
@RequestMapping("/items")
@RestController
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@PostMapping
	public boolean saveItem(@RequestBody ItemDTO itemDTO) {
		return itemService.saveItem(itemDTO);
	}
	
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public ArrayList<ItemDTO> getAllItems(ItemDTO itemDTO) {
		System.out.println("Item:"+itemDTO);
		return itemService.getAllItems();
	}
	
}

package lk.ijse.boot_wholesale.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lk.ijse.boot_wholesale.dto.ItemDTO;
import lk.ijse.boot_wholesale.entity.Item;
import lk.ijse.boot_wholesale.repository.ItemRepository;
import lk.ijse.boot_wholesale.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService{
	
	@Autowired
	private ItemRepository itemRepository;

	@Override
	public ArrayList<ItemDTO> getAllItems() {
		ArrayList<ItemDTO> AllItems=new ArrayList<>();
		List<Item> items=itemRepository.findAll();
		for (Item item : items) {
			ItemDTO itemDTO=new ItemDTO(item.getCode(),item.getDiscription(),item.getUnitPrice(),item.getQtyOnHand());
			AllItems.add(itemDTO);
			}
		return AllItems;
	}

	@Override
	public boolean saveItem(ItemDTO itemDTO) {
		Item item=new Item(itemDTO.getCode(),itemDTO.getDiscription(),itemDTO.getUnitPrice(),itemDTO.getQtyOnHand());
		System.out.println("Item:Service:="+itemDTO);
		itemRepository.save(item);
		return true;
	}

	@Override
	public boolean deleteItem(String itemId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long getTotalItem() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ItemDTO searchItem(String itemId) {
		Item item=itemRepository.findById(itemId).get();
		ItemDTO itemDTO=new ItemDTO();
		itemDTO.getCode();
		itemDTO.getDiscription();
		itemDTO.getUnitPrice();
		itemDTO.getQtyOnHand();
		return itemDTO;
	}

}

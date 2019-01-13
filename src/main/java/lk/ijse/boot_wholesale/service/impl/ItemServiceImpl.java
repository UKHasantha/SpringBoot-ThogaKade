package lk.ijse.boot_wholesale.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
			ItemDTO itemDTO=new ItemDTO(item.getItemId(),item.getItemName(),item.getItemQty(),item.getItemPrice());
			AllItems.add(itemDTO);
			}
		return AllItems;
	}

	@Override
	public boolean saveItem(ItemDTO itemDTO) {
		Item item=new Item(itemDTO.getItemId(),itemDTO.getItemName(),itemDTO.getItemQty(),itemDTO.getItemPrice());
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
		itemDTO.getItemId();
		itemDTO.getItemName();
		itemDTO.getItemQty();
		itemDTO.getItemQty();
		return itemDTO;
	}

}

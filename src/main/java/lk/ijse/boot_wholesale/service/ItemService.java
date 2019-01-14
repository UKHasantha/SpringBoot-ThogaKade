package lk.ijse.boot_wholesale.service;

import java.util.ArrayList;

import lk.ijse.boot_wholesale.dto.ItemDTO;

public interface ItemService {
	 	public ArrayList<ItemDTO> getAllItems();
	    public boolean saveItem(ItemDTO itemDTO);
	    public boolean deleteItem(String itemId);
	    public long getTotalItem();
	    public ItemDTO searchItem(String itemId);
}

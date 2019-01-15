package lk.ijse.boot_wholesale.service;

import java.util.ArrayList;

import lk.ijse.boot_wholesale.dto.OrdersDTO;
import lk.ijse.boot_wholesale.dto.PlaceOrderDTO;

public interface PlaceOrderService {
	public boolean placeOrder(PlaceOrderDTO placeOrderDTO);
	public ArrayList<OrdersDTO> getAllOrders();
	public long getTotalOrders();
	
}

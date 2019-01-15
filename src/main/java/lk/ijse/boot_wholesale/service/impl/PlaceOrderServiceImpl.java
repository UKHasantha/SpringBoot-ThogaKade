package lk.ijse.boot_wholesale.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.ijse.boot_wholesale.dto.ItemDTO;
import lk.ijse.boot_wholesale.dto.OrderDetailsDTO;
import lk.ijse.boot_wholesale.dto.OrdersDTO;
import lk.ijse.boot_wholesale.dto.PlaceOrderDTO;
import lk.ijse.boot_wholesale.dto.UserDTO;
import lk.ijse.boot_wholesale.entity.Item;
import lk.ijse.boot_wholesale.entity.OrderDetails;
import lk.ijse.boot_wholesale.entity.Orders;
import lk.ijse.boot_wholesale.entity.User;
import lk.ijse.boot_wholesale.repository.ItemRepository;
import lk.ijse.boot_wholesale.repository.OrderDetailsRepository;
import lk.ijse.boot_wholesale.repository.OrdersRepository;
import lk.ijse.boot_wholesale.service.PlaceOrderService;

@Service
public class PlaceOrderServiceImpl implements PlaceOrderService{
	
	@Autowired
	private ItemRepository itemrepository;
	
	@Autowired
	private OrdersRepository orderrepository;
	
	@Autowired
	private OrderDetailsRepository orderDetailsRepository;
	

	@Override
	public ArrayList<OrdersDTO> getAllOrders() {
		
		return null;
	}

	@Override
	public long getTotalOrders() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean placeOrder(PlaceOrderDTO placeOrderDTO) {
		
		OrdersDTO ordersDTO=placeOrderDTO.getOrdersDTO();
		UserDTO userDTO=placeOrderDTO.getOrdersDTO().getUserDTO();
		
		User user=new User();
		user.getUserId();
		user.getUserName();
		user.getUserContact();
		user.getUserAddress();
		
		Orders orders=new Orders();
		orders.setoID(ordersDTO.getoID());
		orders.setDate(ordersDTO.getDate());
		orders.setTotalPrice(placeOrderDTO.getItemDTO().getUnitPrice());
		orders.setUser(user);
		
		orderrepository.save(orders);
		
		List<OrderDetailsDTO> orderDetailsDTOs=placeOrderDTO.getOrderDetailsDTOs();
		for (OrderDetailsDTO orderDetailsDTO : orderDetailsDTOs) {
			ItemDTO itemDTO=new ItemDTO();
			Item item=new Item();
			item.setCode(itemDTO.getCode());
			item.setDiscription(itemDTO.getDiscription());
			item.setQtyOnHand(itemDTO.getQtyOnHand());
			item.setUnitPrice(itemDTO.getUnitPrice());
			
			OrderDetails orderDetails=new OrderDetails();
			orderDetails.setItem(item);
			orderDetails.setOrder(orders);
			orderDetails.setQuantity((int)orderDetailsDTO.getQuantity());
			orderDetails.setUnitprice(orderDetails.getUnitprice());
			
			orderDetailsRepository.save(orderDetails);
				
		}
		
		return true;
	}

}

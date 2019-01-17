package lk.ijse.boot_wholesale.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.ijse.boot_wholesale.dto.ItemDTO;
import lk.ijse.boot_wholesale.dto.OrderDetailsDTO;
import lk.ijse.boot_wholesale.dto.OrdersDTO;
import lk.ijse.boot_wholesale.dto.PlaceOrderDTO;
import lk.ijse.boot_wholesale.dto.UserDTO;
import lk.ijse.boot_wholesale.entity.DetailOrders_PK;
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
		List<Orders> orderList = orderrepository.findAll();
		ArrayList<OrdersDTO> allorders =new ArrayList<>();
		
		for (OrdersDTO orders : allorders) {
			OrdersDTO orderDto=new OrdersDTO();
			orderDto.setoID(orders.getoID());
			orderDto.setDate(orders.getDate());
			orderDto.setTotalPrice(orders.getTotalPrice());
			allorders.add(orderDto);	
		}
		
		return allorders;
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
		user.setUserId(userDTO.getUserId());
		user.setUserName(userDTO.getUserName());
		user.setUserContact(userDTO.getUserContact());
		user.setUserAddress(userDTO.getUserAddress());
		
		Orders orders=new Orders();
		orders.setoID(ordersDTO.getoID());
		orders.setDate(ordersDTO.getDate());
		orders.setTotalPrice(placeOrderDTO.getItemDTO().getUnitPrice());
		orders.setUser(user);
		
		orderrepository.save(orders);
		
		List<OrderDetailsDTO> orderDetailsDTOs=placeOrderDTO.getOrderDetailsDTOs();
		
		for (OrderDetailsDTO orderDetailsDTO : orderDetailsDTOs) {
			ItemDTO itemDTO=placeOrderDTO.getItemDTO();
			
			Item item=new Item();
			item.setCode(itemDTO.getCode());
			item.setDiscription(itemDTO.getDiscription());
			item.setQtyOnHand(itemDTO.getQtyOnHand());
			item.setUnitPrice(itemDTO.getUnitPrice());
			
//			DetailOrders_PK ordeDetailOrders_PK=new DetailOrders_PK();
//			ordeDetailOrders_PK.setCode(itemDTO.getCode());
//			ordeDetailOrders_PK.setoID(orders.getoID());
			
			OrderDetails orderDetails=new OrderDetails();
			orderDetails.setItem(item);
			orderDetails.setOrder(orders);
			orderDetails.setQuantity((int)orderDetailsDTO.getQuantity());
			orderDetails.setUnitprice(orderDetails.getUnitprice());
//			orderDetails.setOrderDetails_PK(ordeDetailOrders_PK);
			
			orderDetailsRepository.save(orderDetails);
				
		}
		return true;
	}

}

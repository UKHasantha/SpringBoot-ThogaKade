package lk.ijse.boot_wholesale.dto;

import java.util.List;

public class PlaceOrderDTO {
	
	private ItemDTO itemDTO;
	private OrdersDTO ordersDTO;
	private List<OrderDetailsDTO> orderDetailsDTOs;
	
	public PlaceOrderDTO() {
		super();
	}

	public PlaceOrderDTO(ItemDTO itemDTO, OrdersDTO ordersDTO, List<OrderDetailsDTO> orderDetailsDTOs) {
		super();
		this.itemDTO = itemDTO;
		this.ordersDTO = ordersDTO;
		this.orderDetailsDTOs = orderDetailsDTOs;
	}

	public ItemDTO getItemDTO() {
		return itemDTO;
	}

	public OrdersDTO getOrdersDTO() {
		return ordersDTO;
	}

	public List<OrderDetailsDTO> getOrderDetailsDTOs() {
		return orderDetailsDTOs;
	}

	public void setItemDTO(ItemDTO itemDTO) {
		this.itemDTO = itemDTO;
	}

	public void setOrdersDTO(OrdersDTO ordersDTO) {
		this.ordersDTO = ordersDTO;
	}

	public void setOrderDetailsDTOs(List<OrderDetailsDTO> orderDetailsDTOs) {
		this.orderDetailsDTOs = orderDetailsDTOs;
	}

	@Override
	public String toString() {
		return "PlaceOrderDTO [itemDTO=" + itemDTO + ", ordersDTO=" + ordersDTO + ", orderDetailsDTOs="
				+ orderDetailsDTOs + "]";
	}
	
	
}

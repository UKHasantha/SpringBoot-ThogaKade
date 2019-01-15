package lk.ijse.boot_wholesale.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ijse.boot_wholesale.dto.PlaceOrderDTO;
import lk.ijse.boot_wholesale.service.PlaceOrderService;

@RestController
@CrossOrigin
@RequestMapping("api/v1/placeorders")
public class PlaceOrderController {
	@Autowired
	private PlaceOrderService placeOrderService;
	
	@PostMapping(value="/placeorder")
	public boolean placeOrder(@RequestBody PlaceOrderDTO placeOrderDTO) {
		return placeOrderService.placeOrder(placeOrderDTO);
	}
}

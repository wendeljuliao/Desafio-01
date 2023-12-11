package com.wendel.desafio1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wendel.desafio1.entities.Order;

@Service
public class OrderService {
	
	@Autowired
	ShippingService shippingService;
	
	public double total(Order order) {		
		double calculo = order.getBasic() - 
				order.getBasic() * (order.getDiscount() / 100)
				+ shippingService.shipment(order);
		
		return calculo;
	}

}

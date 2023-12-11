package com.wendel.desafio1.services;

import org.springframework.stereotype.Service;

import com.wendel.desafio1.entities.Order;

@Service
public class ShippingService {

	public double shipment(Order order) {
		Double valorFrete = 0.00;
		
		if (order.getBasic() < 100) {
			valorFrete = 20.00;
		} else if(order.getBasic() < 200) {
			valorFrete = 12.00;
		}
		
		return valorFrete;
	}
	
}

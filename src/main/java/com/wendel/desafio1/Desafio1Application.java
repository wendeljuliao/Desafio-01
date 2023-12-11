package com.wendel.desafio1;

import java.text.DecimalFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wendel.desafio1.entities.Order;
import com.wendel.desafio1.services.OrderService;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner {

	@Autowired
	OrderService orderService;
	
	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		DecimalFormat decimalFormat = new DecimalFormat("0.00");
		
		Order order1 = new Order(1034, 150.00, 20.0);
		
		double valorTotal = orderService.total(order1);
		
		System.out.println("Pedido código " + order1.getCode());
		System.out.println("Valor total: R$ " + decimalFormat.format(valorTotal));
		
		System.out.println("---------------------");
		
		Order order2 = new Order(2282, 800.00, 10.0);
		
		double valorTotal2 = orderService.total(order2);
		
		System.out.println("Pedido código " + order2.getCode());
		System.out.println("Valor total: R$ " + decimalFormat.format(valorTotal2));
		
		System.out.println("---------------------");
		
		Order order3 = new Order(1309, 95.90, 0.0);
		
		double valorTotal3 = orderService.total(order3);
		
		System.out.println("Pedido código " + order3.getCode());
		System.out.println("Valor total: R$ " + decimalFormat.format(valorTotal3));
	}

}

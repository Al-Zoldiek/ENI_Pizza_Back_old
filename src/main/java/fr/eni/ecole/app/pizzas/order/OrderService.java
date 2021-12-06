package fr.eni.ecole.app.pizzas.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	
	@Autowired
	OrderRepo crustRepo;

}

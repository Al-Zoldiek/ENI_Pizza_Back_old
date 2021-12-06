package fr.eni.ecole.app.pizzas.order;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;

import fr.eni.ecole.app.pizzas.pizzas.Pizza;
import lombok.Data;

@Entity
@Data
public class Order implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1471028713836927771L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	private LocalDateTime date;
	
	@NotBlank	
	private String status;
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name="OrderPizza",
				joinColumns= {@JoinColumn(name="orderId")},
				inverseJoinColumns = {@JoinColumn(name="pizzaId")})
	private List<Pizza> pizzasList;
	
}

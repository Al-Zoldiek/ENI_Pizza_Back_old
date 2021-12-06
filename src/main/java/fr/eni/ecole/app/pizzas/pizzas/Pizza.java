package fr.eni.ecole.app.pizzas.pizzas;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

import fr.eni.ecole.app.ingredients.crust.Crust;
import fr.eni.ecole.app.ingredients.sauce.Sauce;
import fr.eni.ecole.app.ingredients.toppings.Topping;
import lombok.Data;

@Entity
@Data
public class Pizza implements Serializable{
	
	private static final long serialVersionUID = 431978631785513179L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	private String name;
	
	@NotBlank
	private double price;
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name="PizzaTopping",
				joinColumns= {@JoinColumn(name="pizzaId")},
				inverseJoinColumns = {@JoinColumn(name="toppingId")})
	private List<Topping> toppingsList;
	
	@ManyToOne
	private Crust crust;
	@ManyToOne
	private Sauce sauce;
}

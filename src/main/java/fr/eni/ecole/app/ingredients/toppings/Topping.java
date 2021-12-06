package fr.eni.ecole.app.ingredients.toppings;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Entity
@Data
public class Topping implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1193507421599007858L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long id;
	
	@NotBlank
	private String name;
	
	@NotBlank
	private String category;
}

package fr.eni.ecole.app.ingredients.crust;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import lombok.Data;


@Entity
@Data
public class Crust implements Serializable{
	
	private static final long serialVersionUID = -7392509431207618866L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	private String name;
	
}

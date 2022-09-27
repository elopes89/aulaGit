package ex2;

import lombok.Data;

@Data 
public class Professor {

	private String nome;
	private int idade;
	
	public Professor() {
		
	}
	
	public Professor(String nome, int idade) {
		this.idade  = idade;
		this.nome = nome;
	}
}



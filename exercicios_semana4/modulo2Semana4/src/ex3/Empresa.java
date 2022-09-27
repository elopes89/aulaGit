package ex3;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Empresa {

	String nome;
	private List<Escritorio> listaEscritorio = new ArrayList<>();
	
	public Empresa() {
		
	}
	
	public Empresa(String nome, List<Escritorio> lista) {
		this.nome = nome;
		this.listaEscritorio = lista;
	}
	
	public List<Escritorio> obterLista() {
		return this.listaEscritorio;
	}
}

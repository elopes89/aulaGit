package ex3;

import java.util.ArrayList;
import java.util.List;

public class Programa {

	public static void main(String[] args) {
		Escritorio escritorio1 = new Escritorio("Finanças", "Rua Nova, n° 101");
		Escritorio escritorio2 = new Escritorio("RH", "Rua Holanda, n° 12");
		Escritorio escritorio3 = new Escritorio("Marketing", "Rua Velha, n° 98");
		Escritorio escritorio4 = new Escritorio("Gastos", "Rua nova, n° 34");

		List<Escritorio> listaEsc = new ArrayList<>();
			listaEsc.add(escritorio1);
			listaEsc.add(escritorio2);
			listaEsc.add(escritorio3);
			listaEsc.add(escritorio4);
			
			Empresa empresa = new Empresa("SENAI", listaEsc);

			List<Escritorio> totalEscritorios = empresa.obterLista();
			
			
			System.out.println("ESCRITÓRIOS SENAI:\n");
			for (Escritorio escritorio : totalEscritorios) {
				System.out.println("Escritório: " + escritorio.nome + " e endereço: " + escritorio.endereco);
			}

			
	}
}

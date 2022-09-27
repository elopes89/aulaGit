package empresa;

public class Empregado {

	private int id;
	private String nome;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	 String getNome() {
		return nome;
	}

	 void setNome(String nome) {
		this.nome = nome;
	}
	
	void Trabalhar() {
		System.out.println("Diz que está trabalhando");
	}
	
	void IrEmbora() {
		System.out.println("Partindo");
	}
	
	String TirarFolga() {
		return "Está em casa";
	}
}

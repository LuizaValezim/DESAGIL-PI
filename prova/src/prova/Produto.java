package prova;

public class Produto {
	// Atributos
	private String nome;
	private double preco;
	
	// Construtor
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	// Getters & Setters
	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}
}
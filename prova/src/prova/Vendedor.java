package prova;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Usuario{
	// Atributos
	private List<Produto> produtos;

	// Construtor
	public Vendedor() {
		super();
		this.produtos = new ArrayList<>();
	}
	
	// Métodos
	public List<Produto> cadastraProduto(String nome, double preco) {
		this.produtos.add(new Produto(nome, preco));
		return this.produtos;
	}
}
package prova;

import java.util.HashMap;
import java.util.Map;

public class Video {
	// Atributos
	private int id;
	private Usuario usuario;
	private Produto produto;
	private Map<Usuario, Integer> avaliacoes;
	
	// Construtor
	public Video(int id, Usuario usuario, Produto produto) {
		this.id = id;
		this.usuario = usuario;
		this.produto = produto;
		this.avaliacoes = new HashMap<>();
	}

	// Getters & Setters
	public int getId() {
		return id;
	}
	public Produto getProduto() {
		return produto;
	}
	
	// Métodos
	public Map<Usuario, Integer> adicionaAvaliacao(Usuario usuario2, int inteiro) {
		if (usuario2 != this.usuario && inteiro > 0 && inteiro <= 5) {
			avaliacoes.put(usuario2, inteiro);
			return avaliacoes;
		}
		return null;
		
	}
	
	public int mediaAvaliacoes() {
		double media = 0.0;
		
		for (Usuario usuario : avaliacoes.keySet()) {
			media += avaliacoes.get(usuario); // Não sei se está certo
		}
		
		media = media/avaliacoes.size();
		return (int) Math.round(media);
	}
}
package prova;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	// Atributos
	private String nome;
	private List<Video> videos;

	
	// Construtor
	public Usuario(String nome) {
		this.nome = nome;
		this.videos = new ArrayList<>();
	}

	
	// Getters & Setters
	public String getNome() {
		return nome;
	}
	
	
	// Métodos
	public Video postaVideo(int id, Produto produto) {
		Usuario usuario = this;
		Video novoVideo = new Video(id, usuario, produto);
		videos.add(novoVideo);
		
		return novoVideo;
	}
	
	public long totalAvaliacoes() {
		long soma = 0;
		for (Video v : videos) {
			soma += v.mediaAvaliacoes();
		}
		return soma;
	}
}
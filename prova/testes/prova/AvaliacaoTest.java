package prova;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AvaliacaoTest {
	private Usuario mesmoUsuario;
	private Usuario novoUsuario;
	private Produto p;
	
	@BeforeEach
	public void setUp() {
		Usuario mesmoUsuario = new Usuario("Hashi");
		Usuario novoUsuario = new Usuario("Joice");
		Produto p = new Produto("Teclado", 499.99);
	}
	
	@Test
	public void umVideoDuasInvalidas() { 
		int av1 = 0;
		int av2 = 6;
		
		Video video1 = new Video(3, mesmoUsuario, p);
		
		video1.adicionaAvaliacao(mesmoUsuario, av1);
		video1.adicionaAvaliacao(mesmoUsuario, av2);
		
		assertEquals(0, video1.mediaAvaliacoes());
}
	
	@Test
	public void umVideoUmaValida() {
		int av1 = 3;
		
		Video video2 = new Video(2, mesmoUsuario, p);
		
		video2.adicionaAvaliacao(novoUsuario, av1);
		
		assertEquals(3, video2.mediaAvaliacoes());
	}
	
	@Test
	public void umVideoDuasValidas() {
		int av1 = 4;
		int av2 = 5;
		
		Video video3 = new Video(3, mesmoUsuario, p);
		
		video3.adicionaAvaliacao(novoUsuario, av1);
		video3.adicionaAvaliacao(novoUsuario, av2);
		
		assertEquals(5, video3.mediaAvaliacoes());
	}
	
	@Test
	public void umVideoTresValidas() {
		int av1 = 3;
		int av2 = 4;
		int av3 = 5;
		
		Video video4 = new Video(4, mesmoUsuario, p);
		
		video4.adicionaAvaliacao(novoUsuario, av1);
		video4.adicionaAvaliacao(novoUsuario, av2);
		video4.adicionaAvaliacao(novoUsuario, av2);
		
		assertEquals(3, video4.mediaAvaliacoes());
	}
	
	@Test
	public void doisVideosDuasValidas() {
		int av1 = 3;
		int av2 = 4;
		int av3 = 5;
		
		Video video51 = new Video(51, mesmoUsuario, p);
		Video video52 = new Video(52, mesmoUsuario, p);
		
		video51.adicionaAvaliacao(novoUsuario, av1);
		video51.adicionaAvaliacao(novoUsuario, av2);
		video52.adicionaAvaliacao(novoUsuario, av3);
		
		assertEquals(4, video51.mediaAvaliacoes());
		assertEquals(5, video52.mediaAvaliacoes());
	}
}
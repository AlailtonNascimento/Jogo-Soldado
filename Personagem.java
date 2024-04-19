package jogo;

import java.util.ArrayList;

public abstract class Personagem {


	protected  String nome;
	protected int pontuacao;
	protected boolean vencedor;
	private ArrayList<Integer> listaAcoes;
	
	protected Personagem(int tamanhoListaAcoes, String nome) {
		this.nome= nome;
		listaAcoes= new ArrayList<Integer>();
		gerarListaAcoes(tamanhoListaAcoes);
		this.pontuacao=0;
	}
	
	private void gerarListaAcoes(int tamanho) {
		
		for (int i = 0; i < tamanho; i++) {
			listaAcoes.add(gerarNumeroAleatorio());
		}
	}
	
	public ArrayList<Integer> getListaAcoes(){
		return listaAcoes;
	}
	
	protected int gerarNumeroAleatorio() {
		return (int) ((Math.random() * 50) + 1);
	}
	
	public int tamanhoListaAcoes() {
		
		return listaAcoes.size();
	}
	
}

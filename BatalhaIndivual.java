package jogo;

public class BatalhaIndivual {

	private Personagem morfeu;
	private Personagem copinho;
	public Personagem vencedor;

	public BatalhaIndivual(Personagem m, Personagem c) {
		this.morfeu = m;
		this.copinho = c;
	}

	private int tamanhoListasConsideradas() {
		int tamanhoListaAcoes = 0;

		if (morfeu.getListaAcoes().size() > copinho.getListaAcoes().size()) {
			tamanhoListaAcoes = copinho.getListaAcoes().size();
		} else {
			tamanhoListaAcoes = morfeu.getListaAcoes().size();
		}

		return tamanhoListaAcoes;

	}

	public void lutar() {

		for (int i = 0; i < tamanhoListasConsideradas(); i++) {

			if(morfeu.getListaAcoes().get(i)> copinho.getListaAcoes().get(i)) {
				morfeu.pontuacao++;
			}else if(morfeu.getListaAcoes().get(i)< copinho.getListaAcoes().get(i)) {
				copinho.pontuacao++;
			}
		}
		verificarVencedor();
	}
	
	private void verificarVencedor() {
		
		if(morfeu.pontuacao> copinho.pontuacao) {
			this.vencedor=morfeu;
		}else if(morfeu.pontuacao< copinho.pontuacao) {
			this.vencedor=copinho;
		}else {
			this.vencedor=null;
		}
	}
}

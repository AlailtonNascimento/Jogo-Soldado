package jogo;

public class Main {

	public static void main(String[] args) {

		int contMorfeu = 0;
		int contCopinho = 0;
		int contEmpate = 0;
		
		for (int i = 0; i < 100000000; i++) {

			Personagem morfeu = new Morfeu(100, "M-01");
			Personagem copinho = new Copinho(100, "C-01");

			BatalhaIndivual b = new BatalhaIndivual(morfeu, copinho);

			b.lutar();

			if (b.vencedor != null) {
//				System.out.println(b.vencedor.nome);

				if (b.vencedor == morfeu) {
					contMorfeu++;
				} else {
					contCopinho++;
				}

			} else {
//				System.out.println("Empatou");
				contEmpate++;
			}

		}

		System.out.println("Morfeu: " + contMorfeu + " Copinho: " + contCopinho + " Empate: "+ contEmpate);
	}

}

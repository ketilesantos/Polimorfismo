package polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class TabuleiroXadres {
	private List<XadreExercicio5> tabuleiro = new ArrayList<XadreExercicio5>();

	public void adicionarPeca(XadreExercicio5 xadreExercicio5) {
		tabuleiro.add(xadreExercicio5);
	}

	public void tabuleiro() {
		for (XadreExercicio5 peca : this.tabuleiro) {
			System.out.println("Peça: " + peca.getnomePeca());
			System.out.println("Movimento: " + peca.movimentoPeca());
			System.out.println("Pode pular peças: " + peca.getpulaPeca());
			System.out.println();
		}
	}
}

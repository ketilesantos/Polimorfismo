package polimorfismo;

public class MainExercicio6 {
	public static void main(String[] args) {

		TabuleiroXadres pecas = new TabuleiroXadres();

		XadreExercicio5 p1 = new BispoExercicio6();
		pecas.adicionarPeca(p1);

		XadreExercicio5 p2 = new CavaloExercicio6();
		pecas.adicionarPeca(p2);
		
		pecas.tabuleiro();
	}
}

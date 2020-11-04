package polimorfismo;

public class MainExercicio4 {
	public static void main(String[] args) {
		FormasGeometricas formas = new FormasGeometricas();

		FormaExercicio2 f1 = new CirculoExercicio4(10);
		formas.adicionarForma(f1);

		FormaExercicio2 f2 = new QuadradoExercicio4(8);
		formas.adicionarForma(f2);

		FormaExercicio2 f3 = new TrianguloExercicio4(20);
		formas.adicionarForma(f3);

		FormaExercicio2 f4 = new RetanguloExercicio4(5, 10);
		formas.adicionarForma(f4);

		formas.calcular();

	}
}

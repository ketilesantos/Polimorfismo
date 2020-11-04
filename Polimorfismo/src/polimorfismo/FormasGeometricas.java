package polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class FormasGeometricas {

	private List<FormaExercicio2> formas = new ArrayList<FormaExercicio2>();

	public void adicionarForma(FormaExercicio2 formaExercicio2) {
		formas.add(formaExercicio2);
	}

	public void calcular() {
		for (FormaExercicio2 forma : this.formas) {
			System.out.println(forma.getnome());
			System.out.println(forma.calcularPerimetro());
			System.out.println(forma.getcalcularArea());
			System.out.println();
		}
	}
}

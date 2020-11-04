package polimorfismo;

public class QuadradoExercicio4 extends FormaExercicio2 {
	double lado;

	public QuadradoExercicio4(double lado) {
		this.lado = lado;
	}

	public String getnome() {
		return "Quadrado";
	}

	public double calcularPerimetro() {
		return lado * 4;
	}

	public double getcalcularArea() {
		return Math.pow(lado, 2);
	}
}

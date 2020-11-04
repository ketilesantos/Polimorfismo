package polimorfismo;

public class CirculoExercicio4 extends FormaExercicio2 {
	public double raio;

	public CirculoExercicio4(double raio) {
		this.raio = raio;
	}

	public String getnome() {
		return "Circulo";
	}

	public final double PI = 3.14;

	public double calcularPerimetro() {
		return raio * 2 * PI;
	}

	public double getcalcularArea() {
		return Math.pow(raio, 2) * PI;
	}

}

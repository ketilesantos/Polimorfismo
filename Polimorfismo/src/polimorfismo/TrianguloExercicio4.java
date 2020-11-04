package polimorfismo;

public class TrianguloExercicio4 extends FormaExercicio2 {
	public double lado;

	public TrianguloExercicio4(double lado) {
		this.lado = lado;
	}

	public String getnome() {
		return "Triangulo";
	}

	public double calcularPerimetro() {
		return lado * 3;
	}

	public double getcalcularArea() {
		return (Math.pow(lado, 2) * Math.sqrt(3)) / 4;
	}
}

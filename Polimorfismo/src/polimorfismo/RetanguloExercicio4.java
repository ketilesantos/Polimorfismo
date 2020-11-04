package polimorfismo;

public class RetanguloExercicio4 extends FormaExercicio2 {
	public double altura;
	public double base;

	public RetanguloExercicio4(double altura, double base) {
		this.altura = altura;
		this.base = base;
	}

	public String getnome() {
		return "Retangulo";
	}

	public double calcularPerimetro() {
		return ((base * 2) + (altura * 2));
	}

	public double getcalcularArea() {
		return base * altura;
	}
}

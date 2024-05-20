ublic class Triangulo {
	private double ladoA;
	private double ladoB;
	private double ladoC;
	
	public Triangulo(double novoLadoA, double novoLadoB, double novoLadoC) {
		this.ladoA = novoLadoA;
		this.ladoB = novoLadoB;
		this.ladoC = novoLadoC;
	}
	public double getLadoA() {
		return ladoA;
	}
	public double getLadoB() {
		return ladoB;
	}
	public double getLadoC() {
		return ladoC;
	}
	public void getLadoA(double novoLadoA) {
		this.ladoA = novoLadoA;
	}
	public void getLadoB(double novoLadoB) {
		this.ladoB = novoLadoB;
	}
	public void getLadoC(double novoLadoC) {
		this.ladoC = novoLadoC;
	}
	public double calcularArea(double base, double altura) {
		return (base * altura)/2;
	}
	public double calcularPerimetro() {
		return (ladoA + ladoB + ladoC);
	}
}

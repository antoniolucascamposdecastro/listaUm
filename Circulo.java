private double raio;
	
	public Circulo(double novoRaio) {
		this.raio = novoRaio;
	}
	public double getRaio() {
		return raio;
	}
	public void setRaio(double novoRaio) {
		this.raio = novoRaio;
	}
	public double caucularArea(double raio) {
		return raio * raio;
	}
	public double caucularPerimetro(double raio) {
		return 3.14 * raio * raio;
	}

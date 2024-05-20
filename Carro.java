public class Carro {
	private String modelo;
	private String marca;
	private int ano;
	private String placa;
	
	public Carro(String novoModelo, String novaMarca, int novoAno, String novaPlaca) {
		this.modelo = novoModelo;
		this.marca = novaMarca;
		this.ano = novoAno;
		this.placa = novaPlaca;
	}
	
//get
	
	public String getModelo() {
		return modelo;
	}
	public String getMarca() {
		return marca;
	}
	public int getAno() {
		return ano;
	}
	public String getPlaca() {
		return placa;
	}
	
//set
	
	public void setModelo(String novoModelo) {
		this.modelo = novoModelo;
	}
	public void setMarca(String novaMarca) {
		this.marca = novaMarca;
	}
	public void setAno(int novoAno) {
		this.ano = novoAno;
	}
	public void setPlaca(String novaPlaca) {
		this.placa = novaPlaca;
	}
	
	public String toString() {
		return "Modelo: " + this.modelo + "\nAno:" + this.ano + " \nData:" + this.placa + "/" + "/" + this.ano;
	}	

}

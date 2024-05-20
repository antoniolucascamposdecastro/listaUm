public class Animal {
	private String nome;
	private String raca; //Raça
	private double idade;
	
	public Animal(String novoNome, String novaRaca, double novaIdade) {
		this.nome = novoNome;
		this.raca = novaRaca;
		this.idade = novaIdade;
	}
	public Animal(String novoNome, double novaIdade) {
		this.nome = novoNome;
		this.idade = novaIdade;
	}
	
	public String getNome() {
		return nome;
	}
	public String getRaca() {
		return raca;
	}
	public double	getIdade() {
		return idade;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	public void setRaca(String novaRaca) {
		this.raca = novaRaca;
	}
	public void setIdade(double novaIdade) {
		this.idade = novaIdade;
	}
	public String imitar(String a) {
		return a;
	}
	
	public String imprimirInformacoes() {
		return " O nome do seu animal é: " + this.nome + " e a raça dele é: " + this.raca + " e sua idade é: " + this.idade + " anos.";
	}
}

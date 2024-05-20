public class Gato {
	
	private String nome;
	private String raca;
	private int idade;
	
	public Gato(String novoNome, String novaRaca, int novaIdade) {
		this.nome = novoNome;
		this.raca = novaRaca;
		this.idade = novaIdade;
	}

//get 
	
	public String getNome() {
		return nome;
	}
	public String getRaca() {
		return raca;
	}
	public int getIdade() {
		return idade;
	}
	
//set 
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	public void setRaca(String novaRaca) {
		this.raca = novaRaca;
	}
	public void setIdade(int novaIdade) {
		this.idade = novaIdade;
	}
	

	public String miar() {
		return "Miau!";
	}
	public String toString() {
		return "Nome: " + this.nome + " sua raça é:" + this.raca + " a idade do mano é:" + this.idade + "anos";
	}	
}

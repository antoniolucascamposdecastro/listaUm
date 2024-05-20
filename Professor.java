public class Professor {
	
	private String nome;
	private String departamento;
	private String titulacao;

	public Professor(String novoNome, String novoDepartamento, String novaTitulacao) {
		this.nome = novoNome;
		this.departamento = novoDepartamento;
		this.titulacao = novaTitulacao;
	}
	
//get
	
	public String getNome() {
		return nome;
	}
	public String getDepartamento() {
		return departamento;
	}
	public String getTitulacao() {
		return titulacao;
	}
	
//set
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	public void setDepartamento(String novoDepartamento) {
		this.departamento = novoDepartamento;
	}
	public void setTitulacao(String novaTitulacao) {
		this.titulacao = novaTitulacao;
	}
}

public class Aluno {
	private String nome;
	private String matricula;
	private String curso;
	
	public Aluno(String novoNome, String novaMatricula, String novoCurso) {
		this.nome = novoNome;
		this.matricula = novaMatricula;
		this.curso = novoCurso;
	}

//get
	
	public String getNome() {
		return nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public String getCurso() {
		return curso;
	}
	
//set
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	public void setMatricula(String novaMatricula) {
		this.matricula = novaMatricula;
	}
	public void setCurso(String novoCurso) {
		this.curso = novoCurso;
	}
}

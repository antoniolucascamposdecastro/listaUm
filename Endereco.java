public class Endereco {
	
	private String rua;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	private int numero;
	
	public Endereco(String novaRua, String novoComplemento, String novoBairro, String novaCidade, String novoEstado, String novoCep, int novoNumero) {
		this.rua = novaRua;
		this.complemento = novoComplemento;
		this.bairro = novoBairro;
		this.cidade = novaCidade;
		this.estado = novoEstado;
		this.cep = novoCep;
		this.numero = novoNumero;
		
	}

	public String getRua() {
		return rua;
	}

	public String getComplemento() {
		return complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEstado() {
		return estado;
	}

	public String getCep() {
		return cep;
	}

	public int getNumero() {
		return numero;
	}
	
	public void SetRua(String novaRua) {
		this.rua = novaRua;
	}
	
	public void SetComplemento(String novoComplemento) {
		this.complemento = novoComplemento;
	}
	
	public void SetBairro(String novoBairro) {
		this.bairro = novoBairro;
	}
	
	public void SetCidade(String novaCidade) {
		this.cidade = novaCidade;
	}
	
	public void SetEstado(String novoEstado) {
		this.estado = novoEstado;
	}
	
	public void SetCep(String novoCep) {
		this.cep = novoCep;
	}
	
	public void SetNumero(int novoNumero) {
		this.numero = novoNumero;
	}
}

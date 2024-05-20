public class Yosa {
	
	private String nome;
	private String dataNasc;
	private int idade;
	private double altura;
	private String cor;
	private String item;
	private double cura;
	private double vida;
	private String povo;
	private int velocidade;
//construtor
	
	public Yosa(String novoNome, String novaDataNasc, int novaIdade, double novaAltura, String novaCor, String novoItem, double novaCura, double novaVida, String novoPovo, int novaVelocidade) {
		this.nome = novoNome;
		this.dataNasc = novaDataNasc;
		this.idade = novaIdade;
		this.altura = novaAltura;
		this.cor = novaCor;
		this.item = novoItem;
		this.cura = novaCura;
		this.vida = novaVida;
		this.povo = novoPovo;
		this.velocidade = novaVelocidade;
	}
	
//get
	
	public String getNome() {
		return nome;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	public int getIdade() {
		return idade;
	}
	public double getAltura() {
		return altura;
	}
	public String getCor() {
		return cor;
	}
	public String getItem() {
		return item;
	}
	public double getCura() {
		return cura;
	}
	public double getVida() {
		return vida;
	}
	public String getPovo() {
		return povo;
	}
	public int getVelocidade() {
		return velocidade;
	}
	
//set
	
	public void setItem(String novoItem) {
		this.item = novoItem;
	}
	public void setVida(int novaVida) {
		this.vida = novaVida;
	}
	public void setCura(int novaCura) {
		this.cura = novaCura;
	}

//metodos do personagem
	
	public String ataque(){
		return "190 de dano!";
	}
	public String golpeEspecial() {
		return "900 de dano!";
	}
	
	public String defesa() {
		return "Bloqueou!";
	}
	public String coletar() {
		return "coletou o item" + this.item;
	}
	public String curar() {
		return "Curou" + this.vida + this.cura;
	}
	public String correr() {
		return "Sprint";
	}
	public String pular() {
		return "huh";
	}
	public String dash() {
		return "huh";
	}

public String toString() {
	return "Seu nome é " + this.nome + " \nNasceu em  " + this.dataNasc + " \nsua idade é: " + this.idade + " anos" + " \nTem " + this.altura + "M" + "\nTem " + this.vida + " de vida" + "\nPovo" + this.povo + "\nSua velocidade normal é de " + this.velocidade + "km/h";
	}	
	
}

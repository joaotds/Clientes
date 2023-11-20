package modelo;

public class ClientePF extends Cliente {

	private String nomePF;
	private String cpf;
	
	//Métodos
	public String getNome() {
		return this.nomePF;
	}
	
	public String getNroDoc() {
		return this.cpf;
	}
	
	public String getTipo() {
		return "F";
	}
	
	public String getDados() {
	String dados = this.id +  " | " + this.email + " | " + this.getNome() + " | " + this.nomeSocial + " | " + this.getCpf();
	return dados;
	}
	
	//GETs e SETs
	public String getNomePF() {
		return nomePF;
	}
	public void setNomePF(String nomePF) {
		this.nomePF = nomePF;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}

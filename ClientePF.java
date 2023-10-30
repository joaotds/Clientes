package modelo;

public class ClientePF extends Cliente {

	private String nomePF;
	private String cpf;
	
	public String getNome() {
		return this.nomePF;
	}

	public String getNroDoc() {
		return this.cpf;
	}

	public String getTipo() {
		return "Pessoa Física";
	}

	/**
	 * @return the nomePF
	 */
	public String getNomePF() {
		return nomePF;
	}

	/**
	 * @param nomePF the nomePF to set
	 */
	public void setNomePF(String nomePF) {
		this.nomePF = nomePF;
	}

	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	
}

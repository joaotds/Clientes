package modelo;

public class ClientePJ extends Cliente {

	private String razaoSocial;
	private String cnpj;
	
	public String getNome() {
		return this.razaoSocial;
	}

	public String getNroDoc() {
		return this.cnpj;
	}

	public String getTipo() {
		return "Pessoa Jurídica";
	}

	/**
	 * @return the razaoSocial
	 */
	public String getRazaoSocial() {
		return razaoSocial;
	}

	/**
	 * @param razaoSocial the razaoSocial to set
	 */
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	/**
	 * @return the cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}

	/**
	 * @param cnpj the cnpj to set
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	
}


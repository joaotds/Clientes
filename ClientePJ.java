package modelo;

public class ClientePJ extends Cliente {

	private String razaoSocial;
	private String cnpj;
	
	//Métodos
	@Override
	public String getNome() {
		return this.razaoSocial;
	}

	@Override
	public String getNroDoc() {
		return this.cnpj;
	}

	@Override
	public String getTipo() {
		return "J";
	}

	//GETs e SETs
	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String getDados() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

package modelo;

public abstract class Cliente {
	
	protected Integer id;
	protected String nomeSocial;
	protected String email;
	
	//Métodos
	public abstract String getNome();
	public abstract String getNroDoc();
	public abstract String getTipo();
	public abstract String getDados();
	
	//GETs e SETs
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNomeSocial() {
		return nomeSocial;
	}
	public void setNomeSocial(String nomeSocial) {
		this.nomeSocial = nomeSocial;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}

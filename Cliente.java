package modelo;

public abstract class Cliente {

	
	protected Integer id;
	protected String nomeSocial;
	protected String email;
	
	//metodos
	public abstract String getNome();
	public abstract String getNroDoc();
	public abstract String getTipo();
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the nomeSocial
	 */
	public String getNomeSocial() {
		return nomeSocial;
	}
	/**
	 * @param nomeSocial the nomeSocial to set
	 */
	public void setNomeSocial(String nomeSocial) {
		this.nomeSocial = nomeSocial;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}

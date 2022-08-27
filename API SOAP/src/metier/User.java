package metier;

public class User {

	private int id;
	private String email;
	private String password;
	private String roles;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getemail() {
		return email;
	}
	
	public void setemail(String email) {
		this.email = email;
	}
	
	public String getMdp() {
		return password;
	}
	
	public void setMdp(String mdp) {
		this.password = mdp;
	}
	
	public String getRoles() {
		return roles;
	}
	
	public void setRoles(String roles) {
		this.roles = roles;
	}
	
	public User() {
		super();
	}
	
	public User(int id, String email, String mdp, String roles) {
		this.id = id;
		this.email = email;
		this.password = mdp;
		this.roles = roles;
	}
	
}

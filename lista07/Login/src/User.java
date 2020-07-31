
public class User {
	private String user;
	private String senha;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	public User(String user,String senha) {
		this.setSenha(senha);
		this.setUser(user);
	}
 public User() {
		// TODO Auto-generated constructor stub
	}

public void addUser(String user,String senha) {
	 User novo =new User(user, senha);
	 novo.user=this.user;
	 novo.senha=this.senha;
 }
public User showUser(User user) {
	User userA= new User();
	userA.senha=this.getSenha();
	userA.user=this.getUser();
	return userA;
}
}


public class Student {
	
	private String name;
	private String number;
	private double hours;
	private String login;
	
	public Student(String name, String number, double hours) {
		this.name = name;
		this.number = number;
		this.hours = hours;
		this.login = name.substring(0,4)+ number.substring(0,3);
	}

	public String getName() {
		return name;
	}

	public void setNome(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}
	public double getHours() {
		return hours;
	}

	public void setHours(double Hours) {
		this.hours = Hours;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
	
	
}

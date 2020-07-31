
public class Person {
	private String name;
	private int cpf;
	private int age;
	private char sex;
	
	public Person(String name, int cpf, int age, char sex) {
		this.name = name;
		this.cpf = cpf;
		this.age = age;
		this.sex = sex;
	}
	public Person() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public boolean Bigger(){
		if (this.age <= 18){
			return false;
		}	
		else {
			return true;
	}	
}
}

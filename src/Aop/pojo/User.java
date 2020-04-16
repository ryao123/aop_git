package Aop.pojo;

public class User {
	private int Uno;
	private String uname;
	private int age;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getUno() {
		return Uno;
	}
	public void setUno(int uno) {
		Uno = uno;
	}
	public User(int uno, String uname, int age) {
		super();
		Uno = uno;
		this.uname = uname;
		this.age = age;
	}
	
	
	
	
}

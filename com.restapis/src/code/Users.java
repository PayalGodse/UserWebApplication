package code;

public class Users {


	private String uname;
	private String pwd;
	
	private String city;
	private int age;
	
	public Users(String u, String p){
		this.uname = u;
		this.pwd = p;
	}

	public String getPwd() {
		return pwd;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}

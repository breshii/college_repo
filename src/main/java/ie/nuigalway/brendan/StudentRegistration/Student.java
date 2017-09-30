package ie.nuigalway.brendan.StudentRegistration;

public class Student {

	private String name,username,dob;
	private int age,id;

	public Student (String name, String dob, int age, int id){
		this.setName(name);
		this.setDob(dob);
		this.setAge(age);
		this.setId(id);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		this.username = name+age;
		return username;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}

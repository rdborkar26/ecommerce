
public class Student {
	private int age;
	private String name;
	private char gender;

	public Student(int age, String name, char gender) {
		this.age = age;
		this.name = name;
		this.gender = gender;
	}
	

	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", gender=" + gender + "]";
	}




}

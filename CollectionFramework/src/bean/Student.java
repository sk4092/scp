package bean;

public class Student {

	private int rollNumber;
	private String name;
	private String city;
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNumber, String name, String city) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.city = city;
	}
	
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", city=" + city + "]";
	}
	
	
}

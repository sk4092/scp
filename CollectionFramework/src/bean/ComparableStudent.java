package bean;

public class ComparableStudent implements Comparable{

	private int rollNumber;
	private String name;
	private String city;
	
	
	
	public ComparableStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ComparableStudent(int rollNumber, String name, String city) {
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

	
	@Override
	public int compareTo(Object o) {
		Student s=(Student)o;
		return this.getRollNumber() - s.getRollNumber();
	}

}

package deep.model;

public class Employee implements Cloneable {

	int id;
	String name;
	ClonableAddress address;

	public Employee(int id, String name, ClonableAddress address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ClonableAddress getAddress() {
		return address;
	}

	public void setAddress(ClonableAddress address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return " ID: " + id + " Name: " + name + " Address-City : " + address.getCity();
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Employee cloned=(Employee) super.clone();
		cloned.setAddress((ClonableAddress)cloned.getAddress().clone());
		return cloned;
	}

}

package apacheCommon.model;

import java.io.Serializable;

public class ClonableAddress implements Serializable{

	String city;

	public ClonableAddress(String city) {
		super();
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}

package com.scp.QuestionSet.ImmutableClass;


import java.util.Date;

public class ImmutableClassTest {

	public static void main(String[] args) {
			Stud st1 = Stud.getStudInstance(10,"abcd",new Address("Pune"),new Date());
			System.out.println(st1);
			st1.getAddress().setCity("Mumbai");// this will not update the city as we are returning immutable address 
											   // object from address getter() in student class
			System.out.println(st1);
			
			
			/*Constructor [] cont = st.getClass().getDeclaredConstructors();
			for (Constructor cont : cont) {
				cont.setAccessible(true);//
				
			}*/
			
	}
}

/**
 * Immutable classes
 * 		1-- IMC with IMF
 * 		2-- IMC with MF
 * 				2.1--MF -- User
 * 				2.2--MF -- java/third party
 * 
 * 
 * 1.1
 * 		just make class final, fields private final,constrctur private, remove setters keep only getters
 * 		and add one more static method which will return the object
 * 
 * 2.1 (IMC with MF(Userdefined))
 * 	 Domainclass	
 * 		just make class final, fields private final,constrctur private, remove setters keep only getters
 * 		and add one more static method which will return the object
 * 	
 * 
 *  1#Composite (Address)
 * 			just make class final, fields private final,constrctur private, remove setters keep only getters.
 * 
 *  2# In stud class address getter create new object with copied values and return that 
 *  	instead of return field directly
 *  		
 * 
 * 
 * 
 * 
 * 2.2
 * 	 Domainclass	
 * 		just make class final, fields private final,constrctur private, remove setters keep only getters
 * 		and add one more static method which will return the object
 * 	 Composite (Date) 
 *    1# In stud class date getter create new object with copied values and return that 
 *  	instead of return field directly
 *  		
 * 
 * 
 * 
 * 
 * 
 * @author Yogesh
 *
 */


final class Stud{
	final private int studId;
	final private String studName;
	final private Address address; 
	final private Date date;
	
	private Stud(int id,String nm,Address ad,Date dt){
		this.studId=id;
		this.studName=nm;
		this.address=ad;
		this.date=dt;
	}

	public int getStudId() {
		return studId;
	}

	public String getStudName() {
		return studName;
	}

	public Address getAddress() {
		/*one way is to make address class final, constructor final fields private and final and remove setters
		 * return address;
		 */
		//return address;//don't do this instead use below line
		return new Address(address);
	}
	

	public static Stud getStudInstance(int id,String nm,Address ad,Date dt){
		return new Stud(id, nm, ad,dt);
	}

	@Override
	public String toString() {
		return "Stud [studId=" + studId + ", studName=" + studName + ", address=" + address + "]";
	}

	public Date getDate() {
		return new Date(date.getDay());
	}
	
	
	
	
}


class Address{
	String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Address() {
		super();
	}

	public Address(Address ad){
		this.city=ad.city;
	}
	
	public Address(String city) {
		super();
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}
	
	
	
	
	
}



package shallow;
import shallow.model.Address;
import shallow.model.Employee;

public class ShalloCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		Address address=new Address("Pune");
		Employee e1=new Employee(1, "Swapnil", address);
		Employee e2= (Employee) e1.clone();
		
		System.out.println("Employee 1 "+e1);
		System.out.println("Employee 2 "+e2);
		
		//Change id of second object
		e2.setId(5);
		System.out.println("\nEmployee 1 after changing id of Emp2 "+e1);
		System.out.println("Employee 2 after changing id of Emp2 "+e2);
		
		//chnage city in address object
		e2.getAddress().setCity("Mumbai");
		System.out.println("\nEmployee 1 after changing city in address of Emp2 "+e1);
		System.out.println("Employee 2 after changing city in address of Emp2 "+e2);
		//In this output the address of both the cities is changed because in shallow cloning
		//the inner object are not getting cloned only outer object is cloned and inner object point to same reference as original object
		
		//change name in of employee in e2
		e2.setName("Sahil");
		System.out.println("\nEmployee 1 after changing name in Emp2 "+e1);
		System.out.println("Employee 2 after changing name in Emp2  "+e2);
		//This time name of inn original object remain same because String object is immutable, while changing the
		//name in cloned object it will create the new string object and not change the string in original object.
		
		
	}
}

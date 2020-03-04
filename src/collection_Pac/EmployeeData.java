package collection_Pac;

import java.util.TreeSet;

public class EmployeeData {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		TreeSet ts= new TreeSet(Employee.sortByname);
		ts.add(new Employee(2, "Shri", 200.0));
		ts.add(new Employee(5, "nik", 201.0));
		ts.add(new Employee(7, "dhans", 280.0));
		ts.add(new Employee(1, "test", 200.50));
		ts.add(new Employee(6, "yantra", 250.0));
		
		System.out.println(ts);
	}

}

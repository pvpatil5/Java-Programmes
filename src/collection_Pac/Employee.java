package collection_Pac;

import java.util.Comparator;

public class Employee implements Comparator<Employee>
{
	private	int id ;
	private	String name;
	private	double salary;
	public Employee(int id, String name, double salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() 
	{
		return " id= "+this.id+" name:"+this.name+" sal:"+this.salary;
	}


	//	@Override
	//	public int compareTo(Employee o) 
	//	{
	//	if (this.getId()<o.getId())
	//		return 1;
	//	else if (this.getId()>o.getId())
	//		return -1;
	//	else
	//		return 0;
	//	}
	/*@Override
	public int compareTo(Employee o) 
	{
		//this will return ascending names of all employees
		return this.getName().compareTo(o.getName()); 
		//this will return descending names of all employees
		//return (o.getName().compareTo(this.getName()));
	}*/
	
	
//	public static Comparator<Employee> sortByname = new Comparator<Employee>()
//	{
//		@Override
//		public int compare(Employee o1, Employee o2)
//		{
//			 return o1.getName().compareTo(o2.getName());
//		}
//	
//};
public static Comparator<Employee> sortByname = new Comparator<Employee>()	
{
@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

	};};
	//	public static Comparator<EmployeeData> sortByname = new Comparator<EmployeeData>() {
	//		
	//	
	//		@Override
	//		public int compare(EmployeeData o1, EmployeeData o2) {
	//			// TODO Auto-generated method stub
	//			 return o1.getName().compareTo(o2.getName());
	//		}



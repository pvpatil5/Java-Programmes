package collection_Pac;

import java.util.Comparator;

public class NameComparator implements Comparator<NameComparator>
{

	private	int id ;
	private	String name;
	private	double salary;
	public NameComparator(int id, String name, double salary)
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

	@Override
	public int compare(NameComparator o1, NameComparator o2) 
	{

		return o1.getName().compareTo(o2.getName());
	}
}



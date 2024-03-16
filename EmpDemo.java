class Employee
{
	int id;
	String name;
	double salary;

	Employee(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
}

class Report
{
	static void display(Employee e)
	{
		System.out.println(e.id);
		System.out.println(e.name);
		System.out.println(e.salary);
		
	}
}

class EmpDemo
{
	public static void main(String args[])
	{
		Employee e1=new Employee(101,"Raj",90000);

		Report.display(e1);


		

	}
}



class Student
{
	//instance variables
	int rollno;
	String name;
	double avg;

	//default constructor
	Student()
	{
		System.out.println("Default Constructor is called");
	}

	//2 arg constructor
	Student(int rollno,String name)
	{
		System.out.println("2 Arg Constructor is called");
		this.rollno=rollno;
		this.name=name;
	}
	//Parameterized constructor
	Student(int rollno,String name,double avg)
	{
		System.out.println("Parameterized Constructor is called...");
		this.rollno=rollno;
		this.name=name;
		this.avg=avg;
	}

	void display()
	{
		System.out.println("Rollno:"+rollno);
		System.out.println("Name:"+name);
		System.out.println("Average:"+avg);
		System.out.println("------------------");
	}

    //this method is called before an object is removed 
	protected void finalize()
	{
		System.out.println("Object Removed...");
	}

	
}
class StudentDemo1
{
	public static void main(String[] args)
	{
		Student s1=new Student(101,"Raj",99);
		Student s2=new Student(102,"Hari",98);
		Student s3=new Student();
		Student s4=new Student(103,"Sunil");
	

		s1.display();
		s2.display();
		s3.display();
		s4.display();

		//making the object reference as null
		s1=null;

   
        //invaking the garbage collector
		System.gc();
	}
}



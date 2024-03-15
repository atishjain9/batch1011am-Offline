

class Student
{
	int rollno;
	String name;
	double avg;

	void storeData(int rollno,String name,double avg)
	{
		this.rollno=rollno;
		this.name=name;
		this.avg=avg;
	}

	void display()
	{
		System.out.println("Rollno:"+rollno);
		System.out.println("Name:"+name);
		System.out.println("Average:"+avg);
	}

}
class StudentDemo
{
	public static void main(String[] args)
	{
		Student s1=new Student();
		s1.storeData(101,"Raj",99);

		Student s2=new Student();
		s2.storeData(102,"Hari",98);

		s1.display();
		s2.display();

		

	
	}
}
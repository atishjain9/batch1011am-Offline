
import java.util.Scanner;
public class SimpleIfDemo
{
	static public  void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int age = 0;

		System.out.print("Enter ur age:");
		age=sc.nextInt();

		if(age >= 18)
		    System.out.println("Eligable for Voting");
		
	}
}




import java.util.Scanner;
public class SimpleIfelseDemo
{
	static public  void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    double avg = 0;

		System.out.print("Enter ur Average:");
		avg=sc.nextInt();

		if(avg >= 40)
		    System.out.println("Ur Passed...");
		else
		    System.out.println("Ur Failed...");

		
	}
}



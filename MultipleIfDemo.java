
import java.util.Scanner;
public class MultipleIfDemo
{
	static public  void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    double avg = 0;

		System.out.print("Enter ur Average:");
		avg=sc.nextInt();

        String result="";
		if(avg>=60)
			result="First Class...";
		else
			if(avg>=50)
				result="Second Class...";
			else
				if(avg>=40)
					result="Third Class...";
				else
					result="Failed.....";

		
			System.out.println(result);
	}
}



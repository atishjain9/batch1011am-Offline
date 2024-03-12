

import java.util.Scanner;

public class DoWhileDemo
{
	static public  void main(String[] args)
	{
		int no,sum=0;
		Scanner sc=new Scanner(System.in);

		do
		{
			System.out.print("Enter a no:(0 to stop):");
			no=sc.nextInt();

			if(no>0)
			  sum=sum+no;
		}while(no!=0);

		System.out.println("Sum is:"+sum);

	}
}



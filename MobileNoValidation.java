

import java.util.Scanner;

public class MobileNoValidation
{
	static public  void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);


		long mno;
		int count=0;
		
		System.out.println("Enter Mobile no:");
		mno=sc.nextLong();

		while(mno!=0)
		{
			mno=mno/10;
			count++;
		}

		if(count!=10)
			System.out.println("Invalid No...");
		else
			System.out.println("Valid No....");
	}
}



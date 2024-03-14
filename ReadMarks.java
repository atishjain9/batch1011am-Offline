


import java.util.Scanner;

public class ReadMarks
{
	public static  void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		//array with default values
		int arr[]=new int[10];

		for(int i=0;i<10;i++)
			System.out.print(arr[i]+" ");


		System.out.println();

		//Array with initialization
		int marks[]={67,89,76,78,99};

		for(int i=0;i<marks.length;i++)
			System.out.print(marks[i]+" ");

		System.out.println();
			
		//user input in array
		int no[]=new int[5];

		for(int i=0;i<no.length;i++)
		{
			System.out.print("Enter a no:");
			no[i]=sc.nextInt();
		}

		System.out.println("------------------");

		for(int i=0;i<no.length;i++)
			System.out.print(no[i]+" ");

	}
}



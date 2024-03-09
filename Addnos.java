
import java.util.Scanner;

public class Addnos
{
	static public  void main(String[] args)
	{
		
		int no1,no2,res;
		no1 = no2 = res = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first no : ");
		no1 = sc.nextInt();

		System.out.print("Enter second no : ");
		no2 = sc.nextInt();

		res = no1 + no2;

		System.out.println("Result is : " + res);
		System.out.println(no1 + " + " + no2 + " = " + res);

		System.out.printf("%d + %d = %d",no1,no2,res);

	}
}



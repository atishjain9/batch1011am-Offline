
import java.util.Scanner;
public class NestedIfDemo
{
	static public  void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    int a,b,c;

		System.out.print("Enter 3 nos:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();

        int result=0;

        if(a>b)
        	if(a>c)
        		result=a;
        	else
        		result=c;
        else
        	if(b>c)
        		result=b;
        	else
        		result=c;
		
			System.out.println("Biggest no is:"+result);
	}
}



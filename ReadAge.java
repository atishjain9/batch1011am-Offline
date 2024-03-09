
import java.io.*;

public class ReadAge
{
	static public  void main(String[] args)throws Exception
	{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(is);

		String sage;

		System.out.println("Enter ur Age:");
		sage=reader.readLine();

		System.out.println("Age is:"+sage);

		int age=Integer.parseInt(sage);
		age = age + 1;

		System.out.println("By NextYear Your Age is:"+age);


  
	}
}



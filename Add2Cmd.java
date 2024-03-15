//Command Line Arguments

class Add2Cmd
{
	public static void main(String[] args)
	{
		if(args.length!=2)
		{
			System.out.println("Invalid No of Arguments...");
			return;
		}

		int a,b,c;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);

		c=a+b;

		System.out.println("Result is:"+c);
	}
}


//from java 7 version onwards switch case expressions can take string values for comparison
import java.util.Scanner;

public class Directions
{
	static public  void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    
	    String direction="";

	    System.out.print("Enter Direction(EAST-WEST-NORTH-SOUTH):");
	    direction=sc.next();

	    direction=direction.toUpperCase();

	    switch(direction)
	    {
	    case "EAST" :System.out.println("You can Move to EAST Direction"); break;
	    case "WEST" :System.out.println("You can Move to WEST Direction"); break;
	    case "NORTH" :System.out.println("You can Move to NORTH Direction"); break;
	    case "SOUTH" :System.out.println("You can Move to SOUTH Direction"); break;
	    default: System.out.println("Invalid Direction....");  

	    }

		
	}
}



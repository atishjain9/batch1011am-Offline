
import javax.swing.*;

public class ReadNameAge
{
	public static  void main(String[] args)throws Exception
	{
		String name;
		int age;

		name=JOptionPane.showInputDialog("Enter ur Name:");
		age=Integer.parseInt(JOptionPane.showInputDialog("Enter ur Age:"));

		JOptionPane.showMessageDialog(null,name+" "+age);
		
		
	}
}



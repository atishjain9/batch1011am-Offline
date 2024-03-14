


import java.util.Scanner;

public class DynamicArrays
{
	public static  void main(String[] args)
	{
		int arr[][]=new int[5][];
		arr[0]=new int[3];
		arr[1]=new int[5];
		arr[2]=new int[2];
		arr[3]=new int[8];
		arr[4]=new int[4];
		


		for(int r=0;r<5;r++)
		{

		for(int c=0;c<arr[r].length;c++)
			System.out.print(arr[r][c]+" ");

		System.out.println();
		}
	}
}



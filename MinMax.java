//Implement a JAVA program to find the max and min of given two numbers


import java.util.Scanner;

class MinMax
{
	public static void main(String[] args) {
		
	
	Scanner sc= new Scanner(System.in);

	System.out.println("Enter 2 nos");
	int x= sc.nextInt();
	int y= sc.nextInt();
/*
	if(x>y)
	{
		System.out.println("Max: " +x);
		System.out.println("Min: " +y);
	}
	else
	{
		System.out.println("Max: " +y);
		System.out.println("Min: " +x);
	}*/

	System.out.println("Max : "+(Math.max(x, y)));
	System.out.println("Min : "+(Math.min(x, y)));

}
}
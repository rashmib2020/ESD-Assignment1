


//Implement a Java program to check a number is a cube or not


import java.util.Scanner;
class Cube29
{
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

			System.out.println("Enter a number");
			int n=sc.nextInt();


			int c=(int) Math.pow(n, 1.0/3.0);

			int  m= c*c*c;

			if(n==m)
				System.out.println(n + " is a cube number");
			else
				System.out.println(n + " is not a cube number");

	}
}
// Implement a Java program to check whether a number is a Pronic Number or Heteromecic Number or not.


// product of 2 consecutive integers ie n(n+1)

import java.util.Scanner;

class Pronic24
{
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);

			System.out.println("Enter a number");
			int n=sc.nextInt();
				int m=(int)Math.sqrt(n);
				int root=m*(m+1);

				if(root==n)
					System.out.println(n + " is Pronic/Heteromecic Number");
				else
					System.out.println(n + " is  not Pronic/Heteromecic Number");
	}
}
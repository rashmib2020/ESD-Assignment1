// Implement a Java program to check whether a number is a Harshad Number or not.


//21/(2+1)
//378/(3+7+8)

import java.util.Scanner;
class Harshad23
{
		public static void main(String[] args) {

			Scanner sc= new Scanner(System.in);

			System.out.println("Enter a number");
			int n=sc.nextInt();
			int temp=n;
			int sum=0;
			while(n!=0)
			{
					int r=n%10;
					sum=sum+r;

					n=n/10;

			}

			System.out.println(temp+"/"+sum+":");// num/sumof digits of number==0
			if((temp%sum)==0)
				System.out.println("Harshad Number");
			else
				System.out.println("Not harshad");






		}

}
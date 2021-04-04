//Implement a JAVA program to find the Mean of given 5 numbers.

import java.util.Scanner;
class Mean14
{

	public static void main(String[] args) {
		//int a[]={3, 2, 1, 8, 6};
		int sum=0, i;
		float mean;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 nos:");
		for(i=0; i<5; i++)
		{
			int n=sc.nextInt();
			//sum+=a[i];

			sum+=n;


		}
		System.out.println("Sum of 5 numbers:" +sum);
		mean=(float)sum/5;

		System.out.println("Mean of 5 numbers:" +mean);
	}
}
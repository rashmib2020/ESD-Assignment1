//Implement a java program to count the repeted occurance of a digit in a n-digit number.


import java.util.Scanner;
class Occur44
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		int a[]=new int[10];
		int count=0;
		int i;

			System.out.println("Enter the numbers in array");
			for(i=0; i<10; i++)
			{
				a[i]=sc.nextInt();
			}
			

			System.out.println("check the repeatition of :");
			int x= sc.nextInt();
			for(i=0; i<10; i++)
			{
				if(a[i]==x)
				{
					count++;
				}

			}
			System.out.println("Element " + x + " has occured " + count +" times");
			

	}
}
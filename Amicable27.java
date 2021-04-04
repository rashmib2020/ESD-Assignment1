
//Implement a Java program to check two numbers are Amicable numbers or not.
//Amicable numbers are two different numbers so related that the sum of the proper divisors of each is equal to the other number.


import java.util.*;
class Amicable27
{
	public static void main(String[] args) {
		

	Scanner sc= new Scanner(System.in);

	System.out.println("Enter two numbers");
	int n1=sc.nextInt();
	int n2=sc.nextInt();

	int sum1=0, sum2=0;

	int i;
	for(i=1; i<=n1; i++)
	{
		if(n1%i==0)
			sum1+=i;
	}
	for(i=1; i<=n2; i++)
	{
		if(n2%i==0)
			sum2+=i;
	}

	if(sum1==sum2)
		System.out.println("Amicable Numbers");
	else
		System.out.println(" Not Amicable Numbers");

	}
}


//Implement a Java program to check whether a number is a Duck Number or not


//A Duck number is a number which has zeroes present in it, but there should be no zero present in the beginning of the number. For example 3210, 7056, 8430709 are all duck numbers whereas 08237, 04309 are not.


import java.util.*;
class Duck26
{
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

			System.out.println("Enter a number");
			int n=sc.nextInt();

			int count=0;
			while(n!=0)
			{
					int r= n%10;
					if(r==0)
						count++;
					n=n/10;
			}

			if(count>0)
				System.out.println("Duck number");
			else
				System.out.println(" Not Duck number");
	}
}
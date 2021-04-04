//1.Implement JAVA program to check whether a given number is ARMSTRONG or not. (3 digit)
//Note: If possible generalize.

import java.util.Scanner;

class Armstrong1{
	public static void main(String args[])
	
	{
		//Scanner sc= new Scanner(System.in);
		//System.out.println("Enter the number");
		
		//		int n=125;
		int n=153;
		//int n=sc.nextInt();
		
		int temp=n;
		int sum=0;
		int count=0;
		int r;
		
		 while(n!=0)
		{
			r=n%10;
			n=n/10;
			
			sum=sum+r*r*r; 	//when number is initialsed having 3 digits
		} 
		
		/*while(n!=0)
		{
			r=n%10;
			n=n/10;
			
			count++;
		}
		
		while(temp!=0)
		{
			r=temp%10;
			temp=temp/10;
			sum+= Math.pow(r, count);
		}*/
		
		if(temp==sum)
			System.out.println("Armstrong");
		else
			System.out.println("Not Armstrong");
		
		
	}
}


//Implement a java program to find the LCD of the given numbers
import java.util.Scanner;
class LCD50
{
	public static void main(String[] args)   
	{  
		 
		int gcd=0;  
		int lcm;
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the First Number: ");  
		int n1 = sc.nextInt();     
		System.out.print("Enter the Second Number: ");  
		int n2 = sc.nextInt();  

		for(int i = 1; i <= n1 && i <= n2; i++)  
		{
			if(n1%i==0 && n2%i==0)  

			gcd = i; 
		}
		lcm=n1*n2/gcd;  
		System.out.println("LCM of " + n1 + " and " + n2 + " =  " + lcm); 
	} 
}



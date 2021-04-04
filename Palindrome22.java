
//*********************************


//Check whether the number is a palindrome number or not
import java.util.Scanner;
class Palindrome22
{
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int n= sc.nextInt();

		//int n=1221;
		int m=0;
		int temp=n;

		while(n!=0)
		{
			int r=n%10;
			m=m*10+r;
			n=n/10;
		}

		if(temp==m)
		
			System.out.println(" Palindrome");
		
		else
		
			System.out.println(" Not Palindrome");

	}
}
//Implement a Java program check whether a number is an Automorphic number or not.

//if last digit of square of number is equal to the last digit of numnber
import java.util.Scanner;

class Automorphic25
{
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

			System.out.println("Enter a number");
			int n=sc.nextInt();

			int r1=n%10;

			int sq=n*n;

				// 1 Method
			/*int r2=sq%10;

			if(r1==r2)
				System.out.println("Automorphic number");
			else
				System.out.println(" Not Automorphic number");*/

				//2 Method
			String str_num = Integer.toString(n);  
        	String str_sq = Integer.toString(sq);  
 
        		if(str_sq.endsWith(str_num))  
            System.out.println("Automorphic Number.");
        		else
            System.out.println("Not an Automorphic Number.");

	}
}
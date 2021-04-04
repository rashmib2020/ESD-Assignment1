//21. Implement Java program to check if a given number is Fibonacci number or not.

import java.util.Scanner;

class Fibnocci21 {
  static boolean isPerfectSquare(int x)
    {
       int s = (int) Math.sqrt(x); 
       return (s*s == x);
     }

   static boolean isFibonacci(int x)
      {
         return isPerfectSquare(5*x*x + 4) ||
           isPerfectSquare(5*x*x - 4);
     }

    public static void main(String[] args)
    {   
      Scanner scan = new Scanner(System.in);
      System.out.print("Input a number: ");
      int n = scan.nextInt();	       
	  if (n>0)
		{	
		 System.out.println("Is Fibonacci number? "+isFibonacci(n)); 
		}         
   }
} 
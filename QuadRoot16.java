//16 Find the determinant, for the quadratic equations. 


import java.util.Scanner;
public class QuadRoot16{
	static double secondRoot = 0, firstRoot = 0;
   public static void main(String args[]){
      
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of a ::");
      double a = sc.nextDouble();

      System.out.println("Enter the value of b ::");
      double b = sc.nextDouble();

      System.out.println("Enter the value of c ::");
      double c = sc.nextDouble();

      double determinant = (b*b)-(4*a*c);
      double sqrt = Math.sqrt(determinant);

      if(determinant>0)
      	{
         firstRoot = (-b + sqrt)/(2*a);
         secondRoot = (-b - sqrt)/(2*a);
         System.out.println("Roots are :: "+ firstRoot +" and "+secondRoot);
      	}
      else if(determinant == 0)
      {
         System.out.println("Root is :: "+(-b + sqrt)/(2*a));
      }
   }
} 
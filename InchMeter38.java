//38. Implement a Java program that reads a number in inches, converts it to meters(CLA)

//1″ = 0.0254m
import java.util.*;
class InchMeter38
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		System.out.print("Enter the Number in inches: ");  
		double n = sc.nextDouble();

		double m= (double)n*0.0254;

		System.out.print(n + "in meters is: " + m);  
		
	}
}
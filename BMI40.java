//40.Implement a Java program to compute body mass index (BMI).


import java.util.Scanner;

class BMI40
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);


		System.out.println("Enter the Weight");
		float wt=sc.nextFloat();

		System.out.println("Enter the Height");
		float ht=sc.nextFloat();

		float bmi=wt/(ht*ht);
		System.out.println("BMI is:" + bmi + "kg/m sq");
		
	}

}
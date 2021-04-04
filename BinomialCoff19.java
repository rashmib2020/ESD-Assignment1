//19. Implement a Java program to calculate the Binomial Coefficient of two positive numbers. 


import java.util.Scanner;
class BinomialCoff19
{
	
	static int binomialCoeff(int n, int j){
		if(j > n)
			return 0;
		if(j == 0 || j == n)
			return 1;
		
		return binomialCoeff(n - 1, j - 1) + binomialCoeff(n -1, j);
	
	}

public static void main(String[] args)
{
	System.out.println("Enter the two numbers");
	Scanner sc = new Scanner(System.in);
	int n= sc.nextInt();
	int k= sc.nextInt();
	System.out.printf("Binomial Coeeficient of (%d, %d) is %d ", n, k,binomialCoeff(n, k));
}

}
// Implement a java program to print 1 to 100 without using numbers in the program

class Print43
{

	public static void main(String[] args) 
	{
		int n = 1;

		printNumbers(n);	
	}

	public static void printNumbers(int n)
	{
		if(n<= 100)
		{
			System.out.print(n +" "); 
			printNumbers(n + 1);
		}	
	}
} 
//Implement a java program to find the memory size in bytes given the input as address length. 

import java.util.Scanner;
class MemorySize
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

			System.out.println("Address length: ");
			int n=sc.nextInt();

			byte mSize=(byte)Math.pow(2, n);

			System.out.println("Memory Size= " +mSize + " bytes");


	}
}

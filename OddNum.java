//Implement a JAVA program to find the odd numbers between 0-100.

class OddNum
{
	public static void main(String[] args) {
		int i;

		for(i=0; i<=100; i++)
		{
				if(i%2!=0)
					System.out.print(i+"\t");

		}
	}
}
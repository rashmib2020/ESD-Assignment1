// Find the hexadecimal equivalent for a given 4-digit binary number.
import java.util.Scanner;

class Hexa51
{

	public static void main(String[] args) {

		int i=1,j;
		int hexa=0;
		
		Scanner sc= new Scanner(System.in);

			System.out.println("Enter a binary number");
			int bin=sc.nextInt();

			while(bin>0)
			{

				int r=bin%2;
				hexa= hexa + r*i;
				i=i*2;
				bin=bin/10;
			}
			

			System.out.println("Hexadecimal value equals: ");
			if(hexa<=9)
				{
					System.out.print(hexa);
					
				}
				else
				{
					System.out.print((char)(hexa+55));
				}
			
			
}
	

}
//Implement a JAVA program to multiply two numbers using recursive multiplication.\
import java.util.Scanner;
class RecursiveMul15
{


	static int mul(int a, int b)
	{
		if(a<b)
		{
			return mul(b, a);
		}
		else if(b!=0)
		{
            return (a+mul(a,b-1));
    	}

    else
    	{
        return 0;
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter 2 nos");
		int x= sc.nextInt();
		int y= sc.nextInt();

		int res= mul(x, y);

		System.out.println("Multiplication of "  + x + " and " + y + ":" + res );
	}
}

//34. Implement a Java program to find all the narcissistic numbers between 1 and 1000.
//narcissistic numbers=Armstrong numbers

//eg 153= 1^3 + 5^3+ 3^3

class Narcissistic34
{
	public static void main(String[] args) {
		int i;
		int sum=0;


		System.out.println("Narcissistic nos are:");
		for(i=1; i<=1000; i++)
		{
			int n=i;

			while(n!=0)
			{
				int r= n%10;
				sum=sum+r*r*r;
				n=n/10;
			}

			if(sum==i)
				
			{
				System.out.print(i+"\t");
			}
			sum=0;
		}
	}
}
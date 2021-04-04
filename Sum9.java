//Implement a JAVA program to find the number between 0 - 1000 where the sum is 8.

class Sum9
{
	static int i,n,r,sum;
	public static void main(String[] args)
	{
		for(i=0;i<1000;i++)
		{
			int temp=i;
			sum = 0;
			while(temp>0)
			{
				r = temp%10;
				temp= temp/10;
				sum = sum +r;
			}
				
			if(sum==8)
				System.out.print(i+" ");
		}
	}
} 

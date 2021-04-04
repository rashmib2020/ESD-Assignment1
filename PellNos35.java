//35. Implement a Java program to print the first 15 numbers of the Pell series. 

//The sequence of Pell numbers starts with 0 and 1, and then each Pell number is the sum of twice the previous Pell number and the Pell number before that.

class PellNos35
{
	public static void main(String[] args) {

		int i;
		int n1=0, n2=1, n3;
		for(i=1; i<=15; i++)
		{
			n3= n1+2*n2;	//n3=n+2(n+1)
			System.out.println(n3+"\t");		
			
			n1=n2;
			n2=n3;
			//System.out.println(n3+"\t");

		}
	}
}
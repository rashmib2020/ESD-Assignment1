

import java.util.Scanner;

class EucliDist17
{
	/*public double dist(int x1, int y1, int x2, int y2)
	{
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) * 1.0);
	}*/

	static double dist;
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	//Euclid e= new Euclid();

    	System.out.println("Enter the co-ordinates of first point");
    	int x1=sc.nextInt();
    	int y1=sc.nextInt();
    	System.out.println("Enter the co-ordinates of Second point");
    	int x2=sc.nextInt();
    	int y2=sc.nextInt();

    	dist= Math.sqrt(Math.pow(x1-x2, 2)+ Math.pow(y1-y2, 2));

    	System.out.print("The distance between"+"("+x1+","+y1+")"+" and "+"("+x2+","+y2+") =" + dist);
    	//System.out.print(e.dist(x1,y1,x2,y2));
    }
}
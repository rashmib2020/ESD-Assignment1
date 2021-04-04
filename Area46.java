//Implement a java program to find the area of a) Circle b) Rectangle c) Square d) trapezoid
//e)rhombus f) triangle


import java.util.Scanner;

class Area46
{
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		double pi=3.142;
		double area;

		System.out.println("1.Circle");
		System.out.println("2.Rectangle");
		System.out.println("3.Square");
		System.out.println("4.Trapezoid");
		System.out.println("5.Rhombus");
		System.out.println("6.Triangle");

		System.out.println("Enter your choice:");	
		int ch=sc.nextInt();

		switch(ch)
		{
			case 1: System.out.println("Enter radius:");
					int r=sc.nextInt();
					area=pi*r*r;
					System.out.println("Area of Circle =" + area);
					break;

			case 2: System.out.println("Enter length and Breadth");
					int l=sc.nextInt();
					int b=sc.nextInt();
					area=l*b;
					System.out.println("Area of Rectangle =" + area);
					break;

			case 3: System.out.println("Enter side:");
					int s=sc.nextInt();
					area=s*s;
					System.out.println("Area of Sqaure =" + area);
					break;
			case 4: System.out.println("Enter 2 bases and height:");
					int b1=sc.nextInt();
					int b2=sc.nextInt();
					int h=sc.nextInt();
					area=(b1+b2)/h;
					System.out.println("Area of Trapezoid =" + area);
					break;
			case 5: System.out.println("Enter 2 diagonal values");
					int m=sc.nextInt();
					int n=sc.nextInt();

					area=(m*n)/2;
					System.out.println("Area of Rhombus =" + area);
					break;

			case 6: System.out.println("Enter breadth and height:");
					int br=sc.nextInt();
					int ht=sc.nextInt();
					area=(float)0.5*br*ht;
					System.out.println("Area of Triangle=" + area);
					break;
			default: System.out.println("Not Valid choice");
					


		}
	}
}

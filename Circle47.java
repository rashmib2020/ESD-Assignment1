//Implement a java program to find whether a circle is inside another circle or not. (consider all the possibel cases)


class Circle47
{
	
	public static void main(String[] args) {
		int x1=10, x2=6, r1=30;
		int y1=1, y2=2, r2=50;

		int dist=(int)Math.sqrt((Math.pow((x1-x2), 2))+(Math.pow((y1-y2), 2)));

		if(dist+r2==r1)
			System.out.println("Circle inside another Circle touching each other");
		else if(dist+r2<r1)
			System.out.println("Circle inside another Circle without touching each other");
		else
			System.out.println("Circle outside the circle");



	}
}


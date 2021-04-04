//41. Implement a Java program to takes the user for a distance (in meters) and the time was taken (as three numbers: hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters).

import java.util.Scanner;
class Speed41
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		System.out.println("Distance in meter: ");
		int d= sc.nextInt();
		System.out.println("Time in hours, minutes and seconds: ");
		float hr=sc.nextInt();
		float min=sc.nextInt();
		float sec=sc.nextInt();

		float time=(hr*60*60)+(min*60)+sec; //time to seconds

		float mps= d/time; 	// meters/sec

		System.out.println("Speed in m/s: "+ mps);

		float kph= (d/1000.0f)/(time/3600.0f);  //km/hour
		System.out.println("Speed in km per hr: "+ kph);

		float mpr=(d/1609.0f)/(time/3600.0f);// miles/hr
		System.out.println("Speed in miles per hour "+ mpr);


	}
}
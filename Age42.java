//If the total ages of Iqbal and Shikhar is 12 years more than the total age of Shikhar and Charu. Charu is how //many years younger than Iqbal? Generalize this program and provide a JAVA program to get input and find the age.

/*import java.util.Scanner;
class Age42
{
	public static void main(String[] args) {
		int x, y, z;

		Scanner sc= new Scanner(System.in);
		System.out.println("Let Iqbal age be :x");
		System.out.println("Let Shikar age be :y");
		System.out.println("Let Charu age be :z");

		//x+y=(y+z)+12;
		//x=12+z;

		System.out.println("Charu is "+(x-z) +"years younger than Iqbal");

		System.out.println("Enter age of Iqbal");
		 x= sc.nextInt();

		System.out.println("Enter age of Shikar");
		 y= sc.nextInt();
		/*System.out.println("Enter age of Charu");
		int z= sc.nextInt();


*/
	/*	System.out.println("Hence Charus age is :" +z);*/

		/*42. If the total ages of Iqbal and Shikhar is 12 years more than the total age of Shikhar and Charu. Charu is how many years younger than Iqbal? Generalize this program and provide a JAVA program to get input and find the age.*/

class Age42{
void age(int i, int s)
{
int c = i+s-s-12;
System.out.println("Charu is 12 years younger than Iqbal");
System.out.println("Charu's age is "+c);
}
public static void main(String[] args) {
Age42 obj = new Age42();
obj.age(14,11);
}
}
		
		

	
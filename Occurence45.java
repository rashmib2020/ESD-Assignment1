//45. Implement a java program to check whether there is any occurance of characters in a n-digit input number.

import java.util.Scanner;
class Occurence45
{
    public static void main(String[] args) {
        /*String str = "MAHE MANIPAL";
        char ch = 'e';*/


        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string");
        String str= sc.next();

        System.out.println("Enter the char to be checked");

        char ch= sc.next().charAt(); ****************************

        int count = 0;

        for(int i = 0; i < str.length(); i++)
        {
            if(ch == str.charAt(i)) 
            {
                count++;
        	}
        }

        System.out.println("No of times " + ch + " occured is  " + count);
    }
}

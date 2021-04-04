//18. Find the power of the number without using existing methods. 


import java.util.Scanner;
public class Power18 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("Enter the power ");
        int p = sc.nextInt();

        long power= 1;

        while (p!= 0)
        {
           power= power*n;
           --p;
        }

        System.out.println("Answer = " + power);
    }
} 
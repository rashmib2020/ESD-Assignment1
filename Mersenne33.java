//33. Implement a program to check if a number is Mersenne number or not

import java.util.Scanner;
public class Mersenne33 {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int m = n + 1;

        int n_power = 0;
        int flag = 0;
        for(int i=0;;i++)
        {
            n_power=(int)Math.pow(2,i);
            if(n_power>m)
            {
                break;
            }
            else if(n_power==m)
            {
               System.out.println(n+" is a Mersenne number.");
               flag=1;
            }
        }
  if(flag==0)
  {
   System.out.println(n+" is not a Mersenne number.");
  }
    }
}


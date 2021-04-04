//31. Implement a Java program to display first 10 Fermat numbers.

//n=((n-1)-1)^2+1

import java.util.Scanner;
public class Fermat31 {
      
public static void main( String args[] ){ 
        int n = 0;        
        double res;
        
        while (n <= 10) {
            res= Math.pow (2, Math.pow(2, n)) + 1;
            n++;
            System.out.println (res);
        }
     }  
}
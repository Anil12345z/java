 
// reverse of number by recurtion 
import java.util.*;
public class reversenumber {
     public static void revno(int n){
        if(n==0){
         System.out.println("this is single digit number");
         return;
        }
        while(n>0){
        int lastDigit=n%10;
        System.out.print(lastDigit+" ");
        n=n/10;
        }

     }
public static void main(String[] args) {
   Scanner Sc= new Scanner (System.in);
   System.out.println("inter your number");
   int n = Sc.nextInt();
   //4568System.out.println(n);
   revno(n);


   
}
}

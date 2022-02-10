import java.util.*;
import java.lang.Math;
public class lab8
{                           //Program by Pravesh Tiwari
      public static void main(String[] args)
    {
       
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter the value of a:");
       int a=sc.nextInt();                             //taking value of first number a    

       System.out.print("Enter the value of b:");
       int b=sc.nextInt();                           //taking value of second number b

       System.out.print("Enter the value of c:");
       int c=sc.nextInt();                           //taking value of third number c
      
       int d=Math.min(a,b);                               //using Inbulit function for minimum number 
       int e=Math.min(d,c);                             //using Inbulit function for minimum number 
      
       if(a==b&&a==c)         //comparing value of a to b and c  
       {
           //values are equal
         System.out.println("All the numbers Are Equal.");
       }
      
       else
       {
              //smallest number is
         System.out.println( "Is the Smallest Number:"+e);
       }
    }
}
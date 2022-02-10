import java.util.*;
public class lab7
{                         //Program by Pravesh Tiwari
      public static void main(String[] args)
    {
       
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter the value of a:");
       int a=sc.nextInt();                                 //taking value of first number a 

       System.out.print("Enter the value of b:");
       int b=sc.nextInt();                                //taking value of second number b


       System.out.print("Enter the value of c:");
       int c=sc.nextInt();                                //taking value of third number c

       if(a<b&&a<c)               //comparing value of a to b and c
       {
         System.out.println("Number a is the smallest :" +a);
       }
       else if(b<a&&b<c)            //comparing value of b to a and c
       {
         System.out.println("Number b is the smallest:" +b);
       }
       else
       {
         System.out.println("Number c is the smallest :" +c);             //not a or b but the c is the smallest
       }
    }
}
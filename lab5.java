import java.util.*;
public class lab5
{                    //Program by Pravesh Tiwari
      public static void main(String[] args)
    {
       
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter the value of a:");
       int a=sc.nextInt();                            //taking value of first number a

       System.out.print("Enter the value of b:");
       int b=sc.nextInt();                              //taking value of second number b

       System.out.print("Enter the value of c:");
       int c=sc.nextInt();                           //taking value of third number c

       if(a>b&&a>c)                             //comparing value of a from b and c
       {
         System.out.println("Number a is the largest :" +a);
       }
       else if(b>a&&b>c)                         //comparing value of b from a and c
       {
         System.out.println("Number b is the largest :" +b);
       }
       else
       {
         System.out.println("Number c is the largest :" +c);    //not a or b but the c is the largest
       }
    }
}
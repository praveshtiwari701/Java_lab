import java.util.*;
public class lab4
{                      //Program by Pravesh Tiwari

      public static void main(String[] args)
    {
       
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value of a: ");
       int a=sc.nextInt();             //taking value from user of a
       System.out.println("Enter the value of b: ");
       int b=sc.nextInt();             //taking value from user of b

       int mul=a*b;
       int diff=a-b;               //different operatins for two values of a and b
       int sum=a+b;
       int divi=a/b;

       System.out.println("Sum of a and b is:" +sum);
       System.out.println("Difference of a and b is:" +diff);
       System.out.println("Multiplication  of a and b is:" +mul);
       System.out.println("Division of a and b is:" +divi);
    }
}
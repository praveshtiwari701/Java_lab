 import java.util.*;
public class lab14
{                         //Program by Pravesh Tiwari
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter binary number:");

       String a=sc.nextLine();     
              //Taking value as binary value
        int b=Integer.parseInt(a,2);  
            //converting value binary to decimal value
     
        System.out.print("Decimal number is:"+b);
 
    }
}
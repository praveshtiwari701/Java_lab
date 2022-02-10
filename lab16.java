import java.util.*;
public class lab16
{                              //Program by Pravesh Tiwari
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter binary number:");
        
        //taking input as binary number 
       String a=sc.nextLine();
     
       //convert it to decimal value
        int b=Integer.parseInt(a,2);
       
        //now convert decimal  to hexadecimal
       String c=Integer.toHexString(b);
        System.out.print("Hexadecimal numbers:"+c);
 
    }
}
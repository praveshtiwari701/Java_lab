import java.util.*;
public class lab15
{                        //Program by Pravesh Tiwari
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the binary number:");

        //taking value binary from user
       String b=sc.nextLine(); 

       //converting binary to decimal               
        int c=Integer.parseInt(b,2);

        //convert decimal to Octal value
       String d=Integer.toOctalString(c);

        System.out.print("Octal number is :"+d);
 
    }
}
import java.util.*;
public class lab12
{                    //Program by Pravesh Tiwari
    public static void main(String[] args)
    {
        Scanner a=new Scanner(System.in);

        System.out.print("Enter octal number:");

       String b=a.nextLine();
                 //input from user as octal value
        int c=Integer.parseInt(b,8);       
                 //conerting base 8 into decimal base 
       String d=Integer.toBinaryString(c); 
              //converting integer value into binary value
        System.out.print("Binary numbers:"+d);
 
    }         
}
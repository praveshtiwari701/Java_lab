  //Program by Pravesh Tiwari
import java.util.*;
public class lab11
{                  
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter decimal numbers:");
        
        // taking input as decimal number
        int b=sc.nextInt(); 
                              
        // converting integer to binary
         String c=Integer.toBinaryString(b); 
         
        System.out.print("Binary numbers:"+c);
 
    }
}
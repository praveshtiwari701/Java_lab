import java.util.*;
public class lab9
{                         //Program by Pravesh Tiwari
    public static void main(String[] args)
    {
        char ch;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Charcter:");
          ch=sc.next().charAt(0);                       //taking value of character

         if (ch >= 'A' && ch <= 'Z')                   //comparing input value for uppercase
         System.out.println( ch +" is an UpperCase character.");

        else if (ch >= 'a' && ch <= 'z')                 //comparing input value for lowercase
        System.out.println( ch + " is an LowerCase character." );

        else
        System.out.println(  ch +" is a special symbol." );      //not a lowercase nor uppercase character it a symbol
    }
}
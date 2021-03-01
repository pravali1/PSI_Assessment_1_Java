import java.util.Scanner;
public class Answer2
{
	public static void main(String[] args) 
        {
           //Taking user input values 
           Scanner in = new Scanner(System.in);
	   System.out.print("Input first number: ");
           double n1 = in.nextDouble();
           System.out.print("Input second number: ");
           double n2 = in.nextDouble();
           //check if given numbers are strictly between 0 and 1 
           if(n1>0 && n1<1 && n2>0 && n2<1)
           {
            System.out.println("true");
           }
           else
           {
            System.out.println("false");
           }
        }
}
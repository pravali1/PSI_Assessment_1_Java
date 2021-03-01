import java.util.Scanner;
public class Answer6 
{	
 public static int countBits(int n)
 {
   int ctrb = 0;
   String binaryNumber = Integer.toBinaryString(n);
   System.out.print("Binary representation of "+n+" is: "+binaryNumber);
   for (char ch : binaryNumber.toCharArray()) 
   {
      ctrb += ch == '0' ? 1 : 0;
    }
    return ctrb;
  }	
	
  public static void main(String[] args) 
  {
   Scanner in = new Scanner(System.in);
   System.out.print("Input first number: ");
   int n = in.nextInt();
   System.out.println("\nNumber of zero bits: " + countBits(n));
  }
}
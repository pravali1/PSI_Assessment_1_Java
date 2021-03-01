import java.util.Scanner;
public class Answer1
{
 public static void main(String[] args)
 {
  //Take input values
  Scanner sc=new Scanner(System.in);
  System.out.print("Input first number:");
  int n1=sc.nextInt();
  System.out.print("Input second number:");
  int n2=sc.nextInt();
  System.out.print("Input third number:");
  int n3=sc.nextInt();
  System.out.print("Input fourth number:");
  int n4=sc.nextInt();
  //checking if the numbers are  equal or not
  if(n1==n2 && n2==n3 && n3==n4)
  {
   System.out.println("The numbers are Equal");
  }
  else
  {
   System.out.println("The given numbers are Not equal");
  }
 }
}
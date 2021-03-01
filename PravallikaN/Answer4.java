import java.util.Scanner;
public class Answer4 
{
 public static void main(String[] args)
 {
  //Take two dimensional array as array
  int[][] dm2 = {{10, 20, 30},{40, 50, 60}};
  System.out.print("Original Array:\n");
  print_array(dm2);
  System.out.print("After changing the rows and columns of the said array:");
  //Calling transpose method
  transpose(dm2);
 }
	
 private static void transpose(int[][] dm2)
 {
  int[][] newdm2 = new int[dm2[0].length][dm2.length];
  for (int i = 0; i < dm2.length; i++)
  {
   for (int j = 0; j < dm2[0].length; j++)
   {
    newdm2[j][i] = dm2[i][j];
    }
   }
  print_array(newdm2);
 }
 private static void print_array(int[][] dm2) 
 {
  for (int i = 0; i < dm2.length; i++)
  {
   for (int j = 0; j < dm2[0].length; j++)
   {
    System.out.print(dm2[i][j] + " ");
    }
   System.out.println();
  }
	
 }
}
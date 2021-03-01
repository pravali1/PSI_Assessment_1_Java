import java.util.Scanner;
public class Answer3
{
 public static void main(String[] args)
 {
  //Take array as the input
  boolean[][] array = {{true, false, true},{false, true, false}};
  int r_length = array.length;
  int col_length = array[0].length;
  //To read values in the array
  for (int i = 0; i < r_length; i++)
  {
   for (int j = 0; j < col_length; j++) 
   {
    if (array[i][j]) 
    {
     System.out.print(" t ");
     } 
    else 
    {
     System.out.print(" f ");
     }
   }
   System.out.println();		
  }	
 }
}
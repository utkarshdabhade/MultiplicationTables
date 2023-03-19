import java.util.Scanner;

public class triangle2 

{
  public static void main(String[] args)
  {
    int rows, i, j, k;
    Scanner sc = new Scanner(System.in);
 
    System.out.print("Enter the number of rows: ");
    rows = sc.nextInt();
 
    System.out.print("Output: \n\n");
    //upper half
    for (i = 1; i <= rows; i++)
    {
      for (k = 1; k < i; k++)
        System.out.print(" ");
 
      for (j = i; j <= rows; j++)
        System.out.print("*");
 
      System.out.println();
    }
 
    //lower half
    for (i = rows - 1; i >= 1; i--)
    {
      for (k = 1; k < i; k++)
        System.out.print(" ");
 
      for (j = i; j <= rows; j++)
        System.out.print("*");
 
      System.out.println();
    }
  }
}


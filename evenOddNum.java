import java.util.Scanner;

public class evenOddNum {
  public static void main (String[] args){


    Scanner reader = new Scanner(System.in);
    char choice;
    
do
{
    System.out.println("Enter a number: ");
    int num = reader.nextInt();

    if(num % 2 == 0)
        System.out.println(num + " is even");
    else
        System.out.println(num + " is odd");

    System.out.println("Do you want to continue?");
    choice = reader.next().charAt(0);

}
while (choice == 'Y');

}  
}


import java.util.Scanner;

public class subString {
public static void main (String[] args){

Scanner sc = new Scanner (System.in);

String string1;
int startingIndex;
int endingIndex;

System.out.println("Enter the string name: ");
string1 = sc.nextLine();

System.out.println("Enter the starting index: ");
startingIndex = sc.nextInt();

System.out.println("Enter the ending index: ");
endingIndex = sc.nextInt();


System.out.println("The substring of " + string1 + " from " + startingIndex + " to " + endingIndex + " is : ");

System.out.println(string1.substring(startingIndex,endingIndex));


 }

}
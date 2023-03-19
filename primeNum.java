import java.util.Scanner;

public class primeNum {
    public static void main(String[] args) {
        int num1,divisibleBy1,divisibleByItself; 
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter A Number :"); 
        num1 =sc.nextInt(); 
        divisibleBy1=1; 
        divisibleByItself=0; 
         while(divisibleBy1<= num1) 
            { 
                if((num1%divisibleBy1)==0) 
                   divisibleByItself=divisibleByItself+1; 
                   divisibleBy1++; 
            } 
             if(divisibleByItself==2) 
             System.out.println(num1 +" is a prime number"); 
             else 
             System.out.println(num1 +" is not a prime number"); 
   } 
} 


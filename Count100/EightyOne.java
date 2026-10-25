
import java.util.Scanner;

public class EightyOne{



    public static void main(String [] args){

    Scanner input = new Scanner(System.in);

    System.out.println("enter a number");

    String userInput = input.next();
    
    if(userInput.charAt(0) >=65 && userInput.charAt(0) <= 91  )System.out.println("This is an uppercase letter.");
    
    else if(userInput.charAt(0) >=97 && userInput.charAt(0) <= 122  )System.out.println("This is a lowercase letter.");

     else if(userInput.charAt(0) >= 48 && userInput.charAt(0) <= 57  )System.out.println("This is a digit, not a letter.");

    else  System.out.println("This is not a digit, upper or lowercase character. be for reeal baba");





















}
















}

import java.util.Scanner;
public class EightyTwo {


    public static void main(String [] args){

    Scanner input = new Scanner(System.in);


    System.out.println("enter a number");

    int userNumber = input.nextInt();

    int singleDigitLeftToRight = 0;

    int singleDigitRightToLeft = 0;

    int singleDigitCounter = 0;

    int numberOfDigits = 0;

    int count = 0;

    int tempLR = userNumber;

    int tempRL = userNumber;
    

    while(userNumber > 0){

        singleDigitCounter = userNumber % 10;

        numberOfDigits++;

        userNumber = userNumber / 10;

     }

    System.out.printf("number of digits is: %d ", numberOfDigits);



        for(int index = 1; index <= numberOfDigits; index++){

        int divisor = (int) Math.pow(10, numberOfDigits - index); //you can use loops to get this

        singleDigitLeftToRight = tempLR / divisor;

        tempLR = tempLR % divisor;
      


        for(int indexTwo = 0; indexTwo < 1; indexTwo++){

            singleDigitRightToLeft = tempRL % 10;

            tempRL = tempRL / 10;

            if(singleDigitRightToLeft == singleDigitLeftToRight) count++;

        }

    }




    
    if(count == numberOfDigits) System.out.println("number is a palindrome number");

    else System.out.println("number is not a palindrome number");


}




    }



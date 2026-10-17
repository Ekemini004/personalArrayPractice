import java.util.Scanner;
public class IntegerReader{


    public static void main(String [] args){


        Scanner input = new Scanner(System.in);

        int userNumber = 0;

        for(int index = 1; index <= 5; index++){

            System.out.printf("enter number %d: ",index );

            userNumber += input.nextInt();

        }
        
        



    System.out.printf("%n sum of numbers the user entered is: %d%n", userNumber );
















































    }



}

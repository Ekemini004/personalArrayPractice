import java.util.Scanner;
public class IntegerReader{


    public static void main(String [] args){


        Scanner input = new Scanner(System.in);

        int userNumber = 0;

        int countPositive = 0;
        
        int countNegative = 0;

        for(int index = 1; index <= 5; index++){

            System.out.printf("enter number %d: ",index );

            userNumber = input.nextInt();

            if(userNumber > 0)

                countPositive++;

            else{

               countNegative++; 

            }

        }
        
        

    

    System.out.printf("%n amount of positive numbers: %d%n amount of negative numbers: %d ", countPositive, countNegative );
















































    }



}

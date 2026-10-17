import java.util.Scanner;
public class SmallestIntegerChecker{


    public static void main(String [] args){

    Scanner input = new Scanner(System.in);

    int userNumber = 0;

    int smallest = 0;
    
    for(int index = 1; index<= 6; index++ ){

            System.out.println("enter a number");

            userNumber = input.nextInt();

            if(index == 1)               

                smallest = userNumber;

            if(index >= 2){
    
                if(userNumber < smallest)

                   smallest = userNumber;  

            }

        }
    

    System.out.println("smallest is: " + smallest);



































    }



}

import java.util.Scanner;

public class NumberOfLargestValues{


    public static void main(String [] args){

    
    Scanner input = new Scanner(System.in);


    int largest = 0;
    int count = 0;


    for(int index = 1; index <= 10; index++){

        System.out.println("enter a number: ");
        int userNumber = input.nextInt();

        if(index == 1){

        largest = userNumber;

        }
        
            if(index > 1){


                if(userNumber == largest){

                count++;           
                   
                 }

                       if(userNumber > largest){

                         largest = userNumber; 

                         count = 1;            //4, 9, 2, 9, 7, 1, 9, 5, 3, 6
                   
                     }

            }
        

    }

    System.out.println("number of times the largest value appeared: " + count);
     









    }




}

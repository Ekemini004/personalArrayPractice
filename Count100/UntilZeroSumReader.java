import java.util.Scanner;

public class UntilZeroSumReader{


    public static void main(String [] args){

    Scanner input = new Scanner(System.in);

    int userNumber = 0;

    int index = 0;

    boolean isNotZero = true;

    while(isNotZero){

        System.out.print("Enter a number: \n");
        
        if(input.hasNextInt() == false){
            
            input.next();

            System.out.println("not a number!"); 
              
         } 

            else {

                userNumber = input.nextInt();

                if(userNumber == 0){
              
                    System.out.println("you have entered zero, program ending now...");

                    isNotZero = false;

                }

                else index++;
                
            }


            

    }


















        

    }


}

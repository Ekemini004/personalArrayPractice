
import java.util.Scanner;
import java.util.Arrays;
public class Eighty{

    public static void main (String [] args){

    Scanner input = new Scanner(System.in);
    
    int [] numbers = new int [8];

    int userNumber = 0;

    for(int index = 0; index<= 7; index++){
    System.out.println("enter a number");

    userNumber = input.nextInt();


    numbers[index] = userNumber;


    }

    System.out.print("[");


    for(int indexTwo = numbers.length - 1; indexTwo >= 0 ; indexTwo--){

    

    System.out.printf("%d, ", numbers[indexTwo]);
    if(indexTwo == 0)System.out.print("]");

    }


    
    



    System.out.print(Arrays.toString(numbers));






























    }

}

import java.util.Scanner;

public class factorialNumber{



    public static void main(String [] args){

    Scanner input = new Scanner(System.in);

    System.out.println("enetr a number oga : ");
    int userNumber = input.nextInt();
    int result = 1;


    for(int index = userNumber; index >=1; index--){

    result *= index;


    }


       System.out.println(result);



}










}

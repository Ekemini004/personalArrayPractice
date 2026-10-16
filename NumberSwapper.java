import java.util.Scanner;

public class NumberSwapper{

public static void main(String[]args){

Scanner input = new Scanner(System.in);




System.out.print("enter number 1: ");
int firstNumber = input.nextInt();

System.out.print("enter a number 2: ");
int secondNumber = input.nextInt();

int tempHolder = firstNumber;
firstNumber = secondNumber;
secondNumber = tempHolder;


System.out.printf("%d %d",firstNumber,secondNumber);





}



}

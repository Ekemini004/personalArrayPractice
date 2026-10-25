public class NinetyEightTwo{

    public static void main(String [] args){


    int[][] numbers = {{3, 6}, {9, 12}, {15, 18}};


    //move through column - which will be a reverse of rows. swapping places
    int sumOfNUmbers = 0;
    for(int index = 0; index < numbers[0].length-1; index++){


        
        for(int indexTwo = 0; indexTwo <= numbers.length-1; indexTwo++){

            
        sumOfNUmbers += numbers[indexTwo][index];


        }



    }


    System.out.printf("the sum of numbers in column 0(first coulmn) is %d", sumOfNUmbers);





    }









}

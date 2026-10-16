

public class SortThis{

public static void sortThisArray(int [] array){


    int tempHolder = 0;

    for(int index = 0; index < array.length; index++){

         for(int indexTwo = index + 1; indexTwo < array.length; indexTwo++){

            if(array[indexTwo] > array[index]){

                tempHolder = array[indexTwo];
                array[indexTwo] = array[index];
                array[index] = tempHolder;

            }
            
    

          }
        
    

    }



    for(int index = 0; index < array.length; index++){


       System.out.printf("[%d, ]", array[index] );
        

    }










}



       // int nextPosition = index+ 1;
        //int temp = array[index];
        //array[index] = array[nextposition];
        //array[index++] =  temp;








}

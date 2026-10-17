public class MutliplesOfSevenPrinter{


    public static void main(String [] args){
    
    int count = 0;
        
    for(int index = 1; index <= 100; index++){

        if(index % 7 == 0){
           
            System.out.printf("%d, ", index);
            count++;

            if(count == 10){

            System.out.println();
            System.out.printf("%d, ", index);
            count = 0;
            

            }

      }  

                 

        


    }

























































    }



}

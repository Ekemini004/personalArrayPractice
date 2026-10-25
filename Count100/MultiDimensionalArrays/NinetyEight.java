import java.util.ArrayList;
public class NinetyEight{


    public static void main(String [] args){

    int [][] numbers = {

        {10, 20},
        {30,40,50},
        {60}

        };

    //3 rows exist
    // numbers[1].length will be the length of row 1 which is 3, same for 60 which is 1
    System.out.println(numbers.length);

    //int [] numbers = new int [size]
    //int [] numbers = {1,3, 4}


    ArrayList <Integer> values = new ArrayList <Integer> ();

    
    values.add(5);
    values.add(15);
    values.add(45);
    values.add(1,10);
    
     System.out.println(values);
























    }



}

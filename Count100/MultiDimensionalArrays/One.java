import java.util.ArrayList;
import java.util.Arrays;

public class One{

    public static void main(String [] args){

    int [] nums = {1,2,3,5};

    int []numsTwo = new int [nums.length];

    int temp = 0;

    ArrayList <Integer> values = new ArrayList <Integer> ();

    for(int index = 0; index <= nums.length-1; index++ ){

        temp += nums[index];
        values.add(temp);

        numsTwo[index] = temp;


        }
    


        System.out.println(values);
        System.out.println(Arrays.toString(numsTwo));


    }





}

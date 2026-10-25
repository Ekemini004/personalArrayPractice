public class TargetCode{


    public static void main(String [] args){

    int [] nums = {2, 7, 11, 15};
   
    int target = 9;

    for(int index = 0; index <= nums.length-1; index++){

    

        for(int indexTwo = index + 1; indexTwo<= nums.length-1; indexTwo++){

        
        if(nums[index] + nums[indexTwo] == target) System.out.printf("%d, %d", index, indexTwo);


        }



  }
    

    
    findTarget(nums, 9);


    



















    }




    public static int[] findTarget(int [] array, int arrayTarget){

    int [] newArr = new int [2];

    for(int index = 0; index <= array.length-1; index++){

    

        for(int indexTwo = index + 1; indexTwo<= array.length-1; indexTwo++){

        
        if(array[index] + array[indexTwo] == arrayTarget){ 
            
            newArr[0] = index;
    
            newArr[1] = indexTwo;

            }

        }

    }

    return newArr;
}







}

public class MedianCheckerr{

    public static void main(String [] args){

        

        //create the two arrays with values

        int [] nums1 = {1, 3};

        int [] nums2 = {2, 4, 6};

        int [] nums3 = new int [nums1.length + nums2.length];



       
        //merge them
        //move throught the emoty one and then use the index of the loop to add its value into the new array

        for(int index = 0; index < nums3.length; index++){

            if(index < nums1.length)
                nums3[index] = nums1[index]; //nums1 bcomes emoty later beuse i dont need it, i want it to be empty


         }
       


        for(int indexTwo = 0; indexTwo <= nums3.length-1; indexTwo++){

            if(indexTwo >= nums1.length){

                nums3[indexTwo] = nums2[indexTwo - nums1.length];
            
            }   


         }

        //print merged array
        for(int indexThree = 0; indexThree < nums3.length; indexThree++){

            System.out.printf("%d  ",nums3[indexThree]);


         }
    
        System.out.println();  

        SortThis.sortThisArray(nums3); //sort merged array
        






    }






}

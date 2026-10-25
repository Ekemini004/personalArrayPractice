

let nums = [2, 7, 11, 15]
let target = 9;
let numsTwo = [3,2,4]

for(let index = 0; index <=  nums.length-1; index++){



    for(let indexTwo = index + 1; indexTwo <= nums.length-1; indexTwo++){


    if(nums[index] + nums[indexTwo] === target){

        //console.log(index);
        //console.log(indexTwo);

    }



    }



}


console.log(FindTarget(nums, 9));



function FindTarget(userarray, target){

    let index = 0;
    let indexTwo = 0;
    let newArray = [];

for(index = 0; index <=  userarray.length-1; index++){



    for(indexTwo = index + 1; indexTwo <= userarray.length-1; indexTwo++){


    if(userarray[index] + userarray[indexTwo] === target){

            newArray.push(index);
            newArray.push(indexTwo);

    }



    }

    return newArray;

}





}

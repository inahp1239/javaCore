package collections.comparing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparators {
    public static void main(String[] args){
        Comparator<Integer> com = new Comparator<>(){

            // this override method will check the last digit is > or < between two numbers;
            @Override 
            public int compare(Integer i , Integer j){
                if(i%10 > j%10){
                    return 1;
                }else{
                    return -1;
                }
            }
        };
    
        List<Integer> nums = new ArrayList<>();
        nums.add(43);
        nums.add(31);
        nums.add(72);
        nums.add(29);
    
        // This sort method will take another parameter of comparator type 
        // along with the required list to be sorted ;
        // comparator type specifies the our logic to help to sort list that we are given to sort;
        
        Collections.sort(nums, com);
    
        for(Integer i : nums ){
            System.out.println(i);
        }
    }
}

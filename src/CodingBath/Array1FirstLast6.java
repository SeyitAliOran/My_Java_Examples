package CodingBath;

import java.util.Arrays;
import java.util.Scanner;

public class Array1FirstLast6 {
    public static void main(String[] args) {

    }
    public boolean sameFirstLast(int[] nums) {
        boolean result = true;
        if(nums.length >=1){
            if(nums[0] == nums[nums.length-1]){
                return true;
            }else{
                return false;
            }
        }
        return result;
    }

}

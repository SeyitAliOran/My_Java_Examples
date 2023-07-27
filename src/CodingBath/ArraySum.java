package CodingBath;

public class ArraySum {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println("sum3(nums) = " + sum3(nums));
    }
    public static int sum3(int[] nums){
        int result =0;
        result = nums[0]+nums[1]+nums[2];
        return result;
    }
}

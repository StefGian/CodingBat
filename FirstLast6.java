public class FirstLast6 {

    /*
     * Given an array of ints, return true if 6 appears as either the first or last element in the array. 
     * The array will be length 1 or more.
     */

     public static void main (String[] args){
        int[] nums = {4,6,1,2,5};
        boolean isIt = firstLast6(nums);
        System.out.println(isIt);
     }

     public static boolean firstLast6(int[] nums){
        if(nums[0] == 6 || nums[nums.length - 1] == 6){
            return true;
        }else{
            return false;
        }

     }
    
}

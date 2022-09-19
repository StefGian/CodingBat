public class SameFirstLast {
    /*
     * Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.
     */

    public static void main (String[] args){
        int[] nums = {4,6,1,2,4};
        boolean isIt = firstLast6(nums);
        System.out.println(isIt);
     }

     public static boolean firstLast6(int[] nums){

        

        if(nums.length >= 1 && nums[0] == nums[nums.length - 1]){
            return true;
        }else{
            return false;
        }

     }
}

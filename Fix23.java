public class Fix23 {
    /*
     * Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. 
     * Return the changed array.
     * fix23([1, 2, 3]) → [1, 2, 0]
     */

    public static void main(String[] args){
        int[] a = {1,2,3};
        int[] result = fix23(a);
        for(int n : result){
            System.out.println(n);
        }
     }

    public static int[] fix23(int[] nums){
        for(int i =0; i < nums.length; i++){
            if(nums[i] == 2 && nums[i+1] == 3){
                nums[i+1] = 0;
            }
        }
        return nums;
    }
}

public class MidThree {

/*
 * Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array. 
 * The array length will be at least 3.
 * midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
 */

    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        int[] result = midThree(a);
        for(int n : result){
            System.out.println(n);
        }
     }
    
     public static int[] midThree(int[] nums){
        int[] arr ;
        
        // odd-length array (only one middle element)
        arr = new int[3];
        
        arr[0] = nums[nums.length/2 -1];
        arr[1] = nums[nums.length/2];
        arr[2] = nums[nums.length/2 + 1];


        return arr;
    }
}

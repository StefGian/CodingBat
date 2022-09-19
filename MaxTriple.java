public class MaxTriple {

    /*
     * Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. 
     * The array length will be a least 1.
     * maxTriple([1, 2, 3]) → 3
     */
    

    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        int result = maxThree(a);
        System.out.println(result);
     }
    
     public static int maxThree(int[] nums){
        int first = nums[0];
        int middle = nums[nums.length/2];
        int last = nums[nums.length-1];

        if(first> middle && first > last){
            return first;
        }else if(middle > first && middle > last){
            return middle;
        }else {
            return last;
        }
        

    }
}

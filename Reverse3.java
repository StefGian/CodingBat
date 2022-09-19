public class Reverse3 {

    /*
     * Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
     * reverse3([1, 2, 3]) → [3, 2, 1]
     */

    public static void main (String[] args){
        int[] a = {1,2,3};
        int [] rotated = rotateLeft3(a);
        //  for(int i = 0; i < rotated.length; i++){
        //      System.out.println(rotated[i]);
        //  }
        

     }

     public static int[] rotateLeft3(int[] nums){
        //n determine the number of times an array should be rotated.    
        int n = 1; 
       
        //Rotate the given array by n times toward left    
        for(int i = 0; i < n; i++){    
            int j, first, last;    
            //Stores the first element of array    
            first = nums[nums.length - 1];    
            last = nums[0];
            
            //First element of array will be added to the start of array.    
            nums[0] = first;  
            nums[nums.length -1] = last;  
        }
       
        
        return nums;
     }
    
}

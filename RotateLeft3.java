public class RotateLeft3 {

    /*
     * Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
     * rotateLeft3([1, 2, 3]) → [2, 3, 1]
     */

    public static void main (String[] args){
        int[] a = {5,11,9};
        int [] rotated = rotateLeft3(a);
        // for(int i = 0; i < rotated.length; i++){
        //     System.out.println(rotated[i]);
        // }
        

     }

     public static int[] rotateLeft3(int[] nums){
        //n determine the number of times an array should be rotated.    
        int n = 1; 
          //Displays original array    
        // System.out.println("Original array: ");    
        // for (int i = 0; i < nums.length; i++) {     
        //     System.out.print(nums[i] + " ");     
        // }      
            
        //Rotate the given array by n times toward left    
        for(int i = 0; i < n; i++){    
            int j, first;    
            //Stores the first element of array    
            first = nums[0];    
            
            for(j = 0; j < nums.length -1 ; j++){    
                //Shift element of array by one    
                nums[j] = nums[j+1];    
            }    
            //First element of array will be added to the end of array.    
            nums[j] = first;    
        }
        System.out.println();
        //Displays resulting array after rotation  
        // System.out.println("Array after left rotation: ");  
        // for(int i = 0; i< nums.length; i++){  
        //     System.out.print(nums[i] + " ");  
        // }  
        
        return nums;
     }
    
}

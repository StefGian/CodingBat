public class Double23 {

    /*
     *Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2. 
     */

     public static void main(String[] args){
        int[] a = {3,3};
        boolean b = double23(a);
        System.out.println(b);
     }

     public static boolean double23(int[] nums){

        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i < nums.length; i ++){
            if(nums[i] == 2){
                count2++;
            }
            if(nums[i] == 3){
                count3++;
            }
        }

        if (count2 == 2 || count3 == 2){
            return true;
        }else{
            return false;
        }

     }
    
}

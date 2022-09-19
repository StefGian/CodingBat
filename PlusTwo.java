public class PlusTwo {

    /*
     * Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
     * plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
     */

    public static void main(String[] args){
        int[] a = {1,2};
        int[] b = {3,4};
        int[] result = plusTwo(a,b);
        // for(int n : result){
        //     System.out.println(n);
        // }
     }
    
     public static int[] plusTwo(int[] a, int[] b){
        int[] arr = new int[a.length + b.length];
        
       for(int i = 0; i < a.length; i++){
        //for (int n = 0; n < a.length; n++){
            arr[i] = a[i] ;
        //}
       }

       
    


       for (int i = 0 ; i < b.length; i ++){
        //for(int n = 2; n < arr.length; n++){
            arr[i+2] = b[i];
       // }
       }
       for(int n : arr){
        System.out.println(n);
       }

        return arr;
       
    }
    
}

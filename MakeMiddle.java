public class MakeMiddle {

    /*
     * Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array. 
     * The original array will be length 2 or more.
     * makeMiddle([1, 2, 3, 4]) → [2, 3]
     */
    

    public static void main(String[] args){
        int[] a = {1,2,3,4};
        int[] result = makeMiddle(a);
        for(int n : result){
            System.out.println(n);
        }
     }
    
     public static int[] makeMiddle(int[] a){
        int[] arr ;
        
        if (a.length %2 == 0) {
            // even-length array (two middle elements)
            arr = new int[2];
            arr[0] = a[(a.length/2) - 1];
            arr[1] = a[a.length/2];
        } else {
            // odd-length array (only one middle element)
            arr = new int[1];
            arr[0] = a[a.length/2];
        }


        return arr;
    }
}

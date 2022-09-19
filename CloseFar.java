public class CloseFar {

    /*
     * Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), 
     * while the other is "far", differing from both other values by 2 or more. 
     * Note: Math.abs(num) computes the absolute value of a number.
     * closeFar(1, 2, 10) → true
     * closeFar(1, 2, 3) → false
     * closeFar(4, 1, 3) → true
     */

     public static void main (String[] args){
        boolean result = closeFar(10,10,8);
        System.out.println("result: " + result);

     }

     public static boolean closeFar(int a, int b, int c){
        boolean result = false;

        int diffBC = Math.abs(b - c);
        int diffAB = Math.abs(a - b);
        int diffAC = Math.abs(a-c);

        
        if((diffBC <= 1 || diffAB <= 1 || diffAC <= 1 ) && ((diffAB >= 2 && diffAC >= 2) || (diffBC >= 2 && diffAB >=2) || (diffBC >=2 && diffAC >=2) )){
            result = true;
        }

        return result;
     }
    
}

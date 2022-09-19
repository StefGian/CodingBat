public class LoneSum {

/*
 * Given 3 int values, a b c, return their sum. 
 * However, if one of the values is the same as another of the values, it does not count towards the sum.
 * loneSum(1, 2, 3) → 6
 * loneSum(3, 2, 3) → 2
 * loneSum(3, 3, 3) → 0
 */

    public static void main (String[] args){

        int result = loneSum(3,3,3);
        System.out.println("result: " + result);

    }


    public static int loneSum(int a, int b, int c){
        int sum = 0;

        if(a != b && a!=c && b!=c){
            sum = (a + b+ c);
        }else if(a != b && a!=c && b==c){
            sum = (a );
        }else if(a == b && a!=c && b!=c){
            sum = (c);
        }else if(a != b && a==c && b!=c){
            sum = (b);
        }else{
            sum = 0;
        }

        return sum;
    }
}

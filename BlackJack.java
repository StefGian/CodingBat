public class BlackJack {

    /*
     * Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.
     * blackjack(19, 21) → 21
     * blackjack(21, 19) → 21
     * blackjack(19, 22) → 19
     */

     public static void main (String[] args){

        int num = blackJack(22, 22);
        System.out.println("NUM: " + num);

     }

     public static int blackJack(int a, int b){

        if (a > 0 && b >0 ){
            
            if(a > 21){
                a = 0;
            }else if (b > 21){
                b =0;
            }else if(a> 21 && b >21){
                a =0;
                b =0;
            }
            return Math.max(a, b);
        }else{
            return 0;
        }


     }
    
}

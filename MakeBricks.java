public class MakeBricks {

    /*
     * We want to make a row of bricks that is goal inches long.
     * We have a number of small bricks (1 inch each) and big bricks (5 inches
     * each).
     * Return true if it is possible to make the goal by choosing from the given
     * bricks.
     * This is a little harder than it looks and can be done without any loops. See
     * also:
     * makeBricks(3, 1, 8) → true
     * makeBricks(3, 1, 9) → false
     */

    public static void main(String[] args) {
        boolean build = makeBricks(40, 2, 47);
        System.out.println("can build: " + build);

    }

    public static boolean makeBricks (int small, int big, int goal){


        if (goal > small + big * 5){
            return false;
        }
        else{
            return goal % 5 <= small;
        }


     }

}

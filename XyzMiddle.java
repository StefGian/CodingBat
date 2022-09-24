public class XyzMiddle {

    /*
     * Given a string, does "xyz" appear in the middle of the string? To define
     * middle,
     * we'll say that the number of chars to the left and right of the "xyz" must
     * differ by at most one.
     * This problem is harder than it looks.
     * xyzMiddle("AAxyzBB") → true
     * xyzMiddle("AxyzBB") → true
     * xyzMiddle("AxyzBBB") → false
     */

    public static void main(String[] args) {

        boolean result = xyzMiddle("xyzAxyzBBB");
        System.out.println(result);
    }

    public static boolean xyzMiddle(String str) {

        boolean result = false;
        int i = str.length() / 2 - 1;

        if (str.length() >= 3 && (str.substring(i, i + 3).equals("xyz")
                || (str.length() % 2 == 0 && str.substring(i - 1, i + 2).equals("xyz")))) {
            result = true;
        }
        return result;
    }

    /*
     * So, let's walk through this and why it works. Firstly, str.length() >= 3, because if the string isn't at least as long as "xyz",
     *  there's no way it can contain "xyz".

        There are two main cases to this problem, we need to think of. The string can have an even or an uneven length. 
        In the uneven case, it's easy:

        The Uneven case

        AAAxyzAAA // length = 9
        012345678 // the indexes
            ^     // that's the middle, which can be calculated by length/2
                // (since this is an integer divison, we disregard whatever comes after the decimal point)

        So to get the start of the xyz-substring, we simply subtract one from this number - which is exactly what i is doing:

        AAAxyzAAA // length = 9
        012345678 // the indexes
        i      // i = length/2-1 = 3

        So if str.substring(i, i+3) is xyz, we can return true!

        The Even Case Now, this can be a bit more tricky, since there is no true "middle" of the string. 
        In fact, two indexes could be called the middle, so we have two sub-cases:

        AAAAAAAA // length = 8
        01234567 // the indexes
        ^^    // Which one is the true middle character?

        In fact, the middle would be between index 3 and 4. However, we are performing integer divisions, 
        length/2 is always the largest (rightmost) of the two possible "middles". And since we calculate i using the middle, 
        the same as in the uneven case applies - str.substring(i, i+3) could be considered the middle part of the string.

        AAAxyzAA 
        01234567 
        ^^^     // str.substring(i, i+3)
        i

        But suppose our string was AAxyzAAA - that could also be considered the middle part of the string. 
        So we need to move our substring check "to the left" - so we subtract 1 from it.

        AAxyzAAA 
        01234567 
        ^^^      // str.substring(i-1, i+2)
        i       // i is still at "the old" location

        So is it even or not?

        To check whether the string is even or uneven, we use the modulo operator, %. 
        The easiest way to think of what it does is "what would be left over after i divided with this number?". 
        So 3 % 2 would be 1. In our case, we want to make sure that the number is divisible by 2 with nothing left over - 
        because that means it was an even number. Therefore, we need to check whether str.length() % 2 == 0 before we 
        make our "move-to-the-left" check. If not, we could risk going out of bounds on the string. 
        If the string was 3 characters long, and we moved one to the left... we would check the substring starting at index -1, 
        and that doesn't make a lot of sense.
     */

}

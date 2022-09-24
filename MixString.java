public class MixString {

    /*
     * Given two strings, a and b, create a bigger string made of the first char of
     * a, the first char of b,
     * the second char of a, the second char of b, and so on. Any leftover chars go
     * at the end of the result.
     * mixString("abc", "xyz") → "axbycz"
     * mixString("xxxx", "There") → "xTxhxexre"
     */

    public static void main(String[] args) {
        String str = mixString("Hi", "There");
        System.out.println("result: " + str);
    }

    public static String mixString(String a, String b) {

         int aLen = a.length();

	    int bLen = b.length();

	    int max = Math.max(aLen, bLen);

	    String word = "";
	   
	    for (int i = 0; i < max; i++) {
            if (i <= aLen-1){
            word += a.substring(i,i+1);
            }
            if (i <= bLen-1){
            word += b.substring(i,i+1);
            }
        }
	  return word;
    }

}

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

        char[] strA = a.toCharArray();

        char[] strB = b.toCharArray();

        char[] mix = new char[strA.length + strB.length];

        int count=0;
        for (int ca = 0; ca < strA.length; ca++) {
                mix[count] = strA[ca];
                if(count + 2< mix.length){
                    count += 2;
                }
        }

        int countb=1;
        for (int ca = 0; ca < strB.length; ca++) {
                mix[countb] = strB[ca];
                if(countb + 2 < mix.length){
                    countb += 2;
                }
        }


        String s = new String(mix);
        System.out.println("s: " + s);

        return new String(mix);
    }

}

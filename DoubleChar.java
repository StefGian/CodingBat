public class DoubleChar {

    /*
     * Given a string, return a string where for every char in the original, there are two chars.
     * doubleChar("The") → "TThhee"
     */

     public static void main (String[] args){
        String s = doubleChar("The");
        //System.out.println(s);

     }
    

     public static String doubleChar(String str){

        char[] ch = str.toCharArray();
        StringBuilder sb=new StringBuilder("");
        for (int i =0; i< ch.length; i++){
            
            sb.append(ch[i]);
            sb.append(ch[i]);
            System.out.println(sb.toString());
        }


        return "";
     }
}

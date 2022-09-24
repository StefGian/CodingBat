public class RepeatSeperator {

    /*
     * Given two strings, word and a separator sep, return a big string made of count occurrences of the word, 
     * separated by the separator string. 
        repeatSeparator("Word", "X", 3) → "WordXWordXWord"
        repeatSeparator("This", "And", 2) → "ThisAndThis"
        repeatSeparator("This", "And", 1) → "This"
     */
    

    public static void main(String[] args) {
        String str = repeatSeparator("This", "And", 1);
        System.out.println("result: " + str);
    }

    public static String repeatSeparator(String word, String sep, int count) {

        //word * count, sep * count -1 

        StringBuilder sb = new StringBuilder("");

        int repeat =1;
        while(repeat <= count){
            sb.append(word);
            System.out.println("repeat: " + repeat);
            if(repeat < count){
                sb.append(sep);
            }
            repeat++;
        }
        
        System.out.println(sb.toString());

        return sb.toString();
    }
}

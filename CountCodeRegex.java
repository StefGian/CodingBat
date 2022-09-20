package javaapplication1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author stefania
 */
public class CountCodeRegex {

    /**
     * Return the number of times that the string "code" appears anywhere in the given string, 
     * except we'll accept any letter for the 'd', so "cope" and "cooe" count.
     */
    
    
    public static void main(String[] args) {
        int count = countCode("cozexxcope");
        System.out.println(count);
      
        
    }
    
    public static int countCode(String str) {
        int count=0;
        Pattern p=Pattern.compile("co.e",Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(str);
        while (m.find()) {
            count++;
        }
        
        return count;
        }
    
}

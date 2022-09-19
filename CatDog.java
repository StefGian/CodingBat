public class CatDog {
    /*
     * Return true if the string "cat" and "dog" appear the same number of times in the given string.
     * catDog("catdog") → true
     * catDog("catcat") → false
     */
    

    public static void main(String[] args){
        boolean count = catDog("catcat");
        System.out.println("result: " + count);
     }

     public static boolean catDog(String str){
        int countCat =countWord(str, "cat");
        
        int countDog =countWord(str, "dog");

        System.out.println("cat: " + countCat);
        System.out.println("dog: " + countDog);
        if(countCat == countDog){
            return true;
        }else{
            return false;
        }
        
        
     }

     public static int countWord(String str, String search){
        int count =0;
        int startFrom = 0;

        while(startFrom <= str.length()){

            int index = str.indexOf(search, startFrom);  
            
           // System.out.println("INDEX: " + index);

            if(index >=0){
                
                count = count +1;
                startFrom = index +1;
                //System.out.println("COUNT: " + count);
            }else{
                break;
            }

            

        };
        
        

        return count;
     }
}

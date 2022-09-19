public class CountHi {

    /*
     * Return the number of times that the string "hi" appears anywhere in the given string.
     * countHi("abc hi ho") → 1
     */
    
     public static void main(String[] args){
        int count = countHi("abc hi ho");
        System.out.println("result: " + count);
     }

     public static int countHi(String str){
        int count =0;
        int startFrom = 0;

        while(startFrom <= str.length()){

            int index = str.indexOf("hi", startFrom);  
            
            System.out.println("INDEX: " + index);

            if(index >=0){
                
                count = count +1;
                startFrom = index +1;
                System.out.println("COUNT: " + count);
            }else{
                break;
            }

            

        };
        
        

        return count;
     }
}

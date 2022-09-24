public class GetSandwich {

    /*
     * A sandwich is two pieces of bread with something in between. Return the string that is between the first 
     * and last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.

        getSandwich("breadjambread") → "jam"
        getSandwich("xxbreadjambreadyy") → "jam"
        getSandwich("xxbreadyy") → ""
     */
    

    public static void main(String[] args){
        String word = getSandwich("xxbreadyy");
        System.out.println(word);

     }

     public static String getSandwich(String str){
        int count = countBread(str);
        System.out.println("result: " + count);

        String word = "";

        if(count >= 2){
            int firstBread = str.indexOf("bread");
            System.out.println("firstBread: " + firstBread);
            int lastBread = str.lastIndexOf("bread");
            System.out.println("lastBread: " + lastBread);

            word = str.substring(firstBread + 5, lastBread);

        }

        return word;
     }

     public static int countBread(String str){
        int count =0;
        int startFrom = 0;

        while(startFrom <= str.length()){

            int index = str.indexOf("bread", startFrom);  
            
            //System.out.println("INDEX: " + index);

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

public class BiggerTwo {
    
/*
 * Start with 2 int arrays, a and b, each length 2. 
 * Consider the sum of the values in each array. Return the array which has the largest sum. In event of a tie, return a.
 */

public static void main(String[] args){
    int[] a = {1,2};
    int[] b = {3,4};
    int[] result = biggerTwo(a, b);
    for(int n : result){
        System.out.println(n);
    }
 }

 public static int[] biggerTwo(int[] a, int[] b){
    int[] arr = null;
    
    int sumA = 0;
    int sumB = 0;
    for(int i =0; i < a.length; i++){
        sumA += a[i];
    }

    for(int i =0; i < b.length; i++){
        sumB += b[i];
    }

    System.out.println("SumA: " + sumA);
    System.out.println("SumB: " + sumB);

    if(sumA > sumB){
        arr = a;
    }else if(sumB > sumA){
        arr=  b;
    }else if(sumA == sumB){
        arr = a;
    }

    return arr;
}

}

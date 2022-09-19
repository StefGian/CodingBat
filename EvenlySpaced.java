public class EvenlySpaced {

    public static void main(String[] args) {
        // boolean b = evenlySpaced(2, 4, 6);
        boolean b = evenlySpaced(10, 9, 11);
        System.out.println(b);
    }

    public static boolean evenlySpaced(int a, int b, int c) {

        int diff1 = 0;
        int diff2 = 0;
        int diff3 = 0;

        if (a == b && a == c)
            return true;

        if (a == b || b == c || a == c)
            return false;

        diff1 = Math.abs(a - b);
        System.out.println("diff1: " + diff1);
        diff2 = Math.abs(a - c);
        System.out.println("diff2: " + diff2);
        diff3 = Math.abs(b - c);
        System.out.println("diff3: " + diff3);

        if (diff1 == diff2)
            return true;
        if (diff1 == diff3)
            return true;
        if (diff2 == diff3)
            return true;

        return false;

    }

}
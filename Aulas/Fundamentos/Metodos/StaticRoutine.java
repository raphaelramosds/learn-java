import utils.ArrayHelper;

public class StaticRoutine {

    /**
     * Increments the parameter and print ithe result
     * @param a
     */
    static void sum (int a) {
        System.out.println("O incremento é " + Integer.toString(++a));
    }

    /**
     * Sums two parameters and print the result
     * @param a
     * @param b
     */
    static void sum (int a, int b) {
        System.out.println("A soma é " + Integer.toString(a+b));
    }

    public static void main(String[] args) {

        // Call overloads of the sum routine
        sum(1,1);
        sum(5);

        // Print array with an external class
        int[] v = {1, 2, 3};
        ArrayHelper.print(v);
    }    
}

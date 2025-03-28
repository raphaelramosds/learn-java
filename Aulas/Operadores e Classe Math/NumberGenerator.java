public class NumberGenerator {
    public static void main(String[] args) {
        int a = 10,
            b = 2,
            r = (int) Math.ceil(Math.min(a,b) + Math.random() * Math.abs(a - b));
        System.out.format("Random number between %d and %d: %d\n", a, b, r);
    }    
}

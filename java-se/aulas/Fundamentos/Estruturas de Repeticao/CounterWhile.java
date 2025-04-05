public class CounterWhile {
    public static void main (String[] args) {
        int i = 0;

        while (i < 10) {
            i++;

            // Skip iteration 1, 5 and 7
            if (i == 1 || i == 5 || i == 7) continue;

            // Break loop when reaching iteration 9
            if (i == 9) break;

            System.out.println(i + "th iteration");
        }
    }    
}

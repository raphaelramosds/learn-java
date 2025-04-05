public class IncrementsDifference {
    public static void main(String[] args) {
        int n = 5,
            postIncrement = 5 + n++, // Perform 5 + n, then increment n
            preIncrement = 5 + ++n; // Increment n, then perform 5 + n

        System.out.println(n); // 7
        System.out.println(postIncrement); // 10
        System.out.println(preIncrement); // 12
    }    
}

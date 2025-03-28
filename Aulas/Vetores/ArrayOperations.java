import java.util.Arrays;

class ArrayOperations {
    public static void main(String[] args) {
        int staticArray[] = {3, 2, 8, 7, 5, 4};
        
        // Sort elements
        Arrays.sort(staticArray);

        // Search for element
        int needleIdx = Arrays.binarySearch(staticArray, 8);
        System.out.println("Posicao: " + needleIdx);

        // Assign zero on all positions
        Arrays.fill(staticArray, 0);

        for (int el : staticArray) {
            System.out.format("%d ", el);
        }
    }
}
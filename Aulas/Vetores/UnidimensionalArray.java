import java.util.ArrayList;

public class UnidimensionalArray {
    public static void main(String[] args) {

        // 1D Array with fix length and static values
        int[] staticArray = {3, 2, 8, 7, 5, 4};

        // 1D Array with fix length and dynamic values
        int[] dynamicArray = new int[4];
        for (int i = 0; i < dynamicArray.length; i++) {
            dynamicArray[i] = i;
        }

        // 1D Array with dynamic length
        ArrayList<Integer> arrayList = new ArrayList<Integer>(); // instantiate a template of ArrayList, with type Integer
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        // Print elements with for
        for (int i = 0; i < staticArray.length; i++) {
            System.out.println(staticArray[i]);
        }

        // Print elements with foreach
        for (int el : dynamicArray) {
            System.out.println(el);
        }

        for (Integer el : arrayList) {
            System.out.println(el);
        }
    }
}

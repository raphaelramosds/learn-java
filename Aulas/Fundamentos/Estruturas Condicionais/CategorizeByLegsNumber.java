import java.util.Scanner;

public class CategorizeByLegsNumber {
    public static void main (String[] args) {
        Scanner sin = new Scanner(System.in);

        System.out.print("Quantas pernas? ");
        int legsNumber = sin.nextInt();

        String category;

        switch (legsNumber) {
            case 1:
                category = "SACI";
                break;
            case 2:
                category = "BÍPEDE";
                break;
            case 3:
                category = "TRIPÉ";
                break;
            case 4:
                category = "QUADRÚPEDE";
                break;
            case 6, 8:
                category = "ARANHA";
                break;
            default:
                category = "ET";
                break;
        }

        System.out.println(category);

        sin.close();
    }
}

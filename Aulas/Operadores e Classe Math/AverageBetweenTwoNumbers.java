import java.util.Scanner;

public class AverageBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        float n1, n2, avg;

        System.out.println("AVG = N1 + N2");

        System.out.print("N1 = ");
        n1 = sin.nextFloat();

        System.out.print("N2 = ");
        n2 = sin.nextFloat();

        sin.close();

        avg = (n1 + n2) / 2;

        System.out.format("AVG = %.2f\n", avg);

    }    
}

import java.util.Scanner;

public class CumulativeSum {
    public static void main(String[] args) {
        int number, sum = 0;
        String answer;
        Scanner sin = new Scanner(System.in);

        do {
            System.out.print("Digite um número: ");
            number = sin.nextInt();
            sum += number;

            System.out.print("Continuar? [S/N] ");
            answer = sin.next();

        } while (answer.equals("S"));

        System.out.println("A soma de todos os valores digitados é " + sum);

        sin.close();
    }    
}

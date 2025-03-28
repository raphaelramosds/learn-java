import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("N1: ");
        float n1 = keyboard.nextFloat();

        System.out.print("N2: ");
        float n2 = keyboard.nextFloat();

        float m = (n1 + n2)/2;
        System.out.println("Sua média foi " + m);
        
        if (m > 9) {
            System.out.println("PARABÉNS, pequeno gafanhoto");
        }

        keyboard.close();

    }    
}

import java.time.LocalDateTime;
import java.util.Scanner;

public class CheckAdultAge {
    public static void main(String[] args) {
        LocalDateTime datetime = LocalDateTime.now();
        int currYear = datetime.getYear();
        
        Scanner t = new Scanner(System.in);
        System.out.println("Em que ano você nasceu?");
        int birthYear = t.nextInt();

        int age = currYear - birthYear;

        System.out.println("Sua idade é " + age);

        if (age >= 18) {
            System.out.println("MAIOR DE IDADE");
        } else {
            System.out.println("MENOR DE IDADE");
        }

        t.close();
    }    
}

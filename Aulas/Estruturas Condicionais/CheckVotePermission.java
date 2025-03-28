import java.time.LocalDateTime;
import java.util.Scanner;

public class CheckVotePermission {
    public static void main(String[] args) {
        LocalDateTime datetime = LocalDateTime.now();
        int currYear = datetime.getYear();

        Scanner t = new Scanner(System.in);
        System.out.println("Em que ano você nasceu?");
        int birthYear = t.nextInt();

        int age = currYear - birthYear;

        System.out.println("Sua idade é " + age);

        if (age < 16) {
            System.out.println("NÃO VOTA");
        } else if (age < 70 && age > 18) {
            System.out.println("OBRIGATÓRIO");
        } else {
            System.out.println("OPCIONAL");
        }

        t.close();
    }
}

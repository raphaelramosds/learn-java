package currentsystemtime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentSystemTime {
    
    public static void main(String[] args) {
        LocalDateTime datetime = LocalDateTime.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("HH:mm:ss");
        String time = datetime.format(fmt);
        System.out.println("Hora atual: " + time);
    }
    
}

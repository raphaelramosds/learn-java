package currentsystemlanguage;

import java.util.Locale;

public class CurrentSystemLanguage {

    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        String language = locale.getDisplayLanguage();
        System.out.println(language);
    }
    
}

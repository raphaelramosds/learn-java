public class StringComparation {
    public static void main(String[] args) {
        String s1 = "Raphael";
        String s2 = new String("Raphael");

        System.out.println(s1 == s2); // false, even with the same content
        System.out.println(s1.equals(s2)); // true
    }    
}

import java.awt.Dimension;
import java.awt.Toolkit;

public class SystemScreenResolution {
    public static void main(String[] args) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) screenSize.getWidth();
        int height = (int) screenSize.getHeight();
        System.out.println(width + " x " + height);
    }
}
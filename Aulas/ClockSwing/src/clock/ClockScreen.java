package clock;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class ClockScreen extends JFrame {
    private JButton btnTime;
    private JLabel lblTime;
    private JPanel ClockScreen;

    public ClockScreen() {

        // Define default screen
        setContentPane(ClockScreen);

        setTitle("Simple Clock");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,200);

        btnTime.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date clock = new Date();
                lblTime.setText(clock.toString());
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new ClockScreen();
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package statisticsswing;

import javax.swing.JOptionPane;

/**
 *
 * @author rapha
 */
public class StatisticsSwing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int quantity = 0, n, sum = 0, qtPairs = 0, qtOdds = 0;
        double avg = 0.0;
        
        String message = "<html> Informe um número <br/> (0 para interromper) </html>";
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, message));
            sum += n;
            qtPairs += (n % 2 == 0) ? 1 : 0;
            quantity += 1;
        } while (n != 0);
        
        qtOdds = quantity - qtPairs;
        avg = sum / quantity;
        
        JOptionPane.showMessageDialog(null, "<html>"
                + "Somatório = " + sum + "<br/>"
                + "N° pares = " + qtPairs  + "<br/>"
                + "N° impares = " + qtOdds  + "<br/>"
                + "Média = " + avg  + "<br/>"
                + "</html>");
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author rapha
 */
public class Factorial {
    
    String formula;
    
    int result;
    
    private int calculate(int n) {
        
        if (n == 1 || n == 0) {
            formula += "1 =";
            return 1;
        }
        
        formula += n + " x ";
        
        return n * calculate(n-1);
    }
    
    public Factorial (int n) {
        formula = "";
        result = calculate(n);
    }
    
    public String getFormula () {
        return formula;
    }
    
    public int getResult () {
        return result;
    }
    
}

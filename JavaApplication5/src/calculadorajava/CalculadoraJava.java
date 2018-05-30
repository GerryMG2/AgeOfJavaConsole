/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorajava;

import GuiCalculador.Calculadora;
import GuiCalculador.Solver;
import javax.swing.JFrame;

/**
 *
 * @author gerar
 */
public class CalculadoraJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JFrame ventana = new JFrame("Calculadora");
        ventana.setContentPane(new Calculadora());
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(true);
        ventana.pack();
        ventana.setVisible(true);
        
    }
    
}

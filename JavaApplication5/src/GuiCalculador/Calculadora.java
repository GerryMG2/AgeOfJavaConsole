/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuiCalculador;

import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author gerar
 */
public class Calculadora extends JPanel{
    public int WIDTH = 400, HEIGTH = 400;
    public JTextField Pantallaj;
    public static void updatePantalla(Calculadora ca){
        ca.update();
    }
    public void update()
    {
        Pantallaj.setText(pantalla);
        
    }
    public static int Wboton = 70, Hboton = 70;
    public static String pantalla;
    public Calculadora(){
        ArrayList<String> signosC = new ArrayList<>();
        signosC.add("=");
        signosC.add("+");
        signosC.add("-");
        signosC.add("*");
        signosC.add("/");
        signosC.add("ac");
        signosC.add("c");
        signosC.add(".");
        pantalla = "";
        for(int i=0;i<=9;i++)
        {
            BotonC aux = FactoryBotonNumber.getBoton(i,this);
            add(aux);
        }
        for(String str:signosC)
        {
            BotonC aux2 = FactoryBotonFunctions.getBoton(str,this);
            add(aux2);
        }
        Pantallaj = new JTextField();
        Pantallaj.setBounds(5, 5,300 , 80);
        Pantallaj.setEditable(false);
        Pantallaj.setText(pantalla);
        add(Pantallaj);
        setLayout(null);
        setPreferredSize(new Dimension(310,500));
    }
}

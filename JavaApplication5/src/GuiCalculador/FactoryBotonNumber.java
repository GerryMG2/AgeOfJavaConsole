/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuiCalculador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author gerar
 */
public class FactoryBotonNumber {
    public static BotonC getBoton(int n, Calculadora ca)
    {
        String ValStr = "" + n;
        BotonC boton = new BotonC(n,ValStr);
        
        boton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Calculadora.pantalla.equals("SyntaxError") || Calculadora.pantalla.equals("Infinity"))
                {
                    Calculadora.pantalla = "";
                }
                Calculadora.pantalla += boton.Value;
                //update pantalla
                Calculadora.updatePantalla(ca);
            }
        });
       
        if(n == 0){
            boton.setBounds((Calculadora.Wboton+5)*(n+1)+5,425 - 5, Calculadora.Wboton, Calculadora.Hboton);
        }
        if(n == 1 || n == 2 || n == 3){
            boton.setBounds((Calculadora.Wboton+5)*(n-1)+5,425 - 5 - ((Calculadora.Wboton+5)*1 ), Calculadora.Wboton, Calculadora.Hboton);
            
        }
        if(n == 4 || n == 5 || n == 6){
            boton.setBounds((Calculadora.Wboton+5)*(n-4)+5,425 - 5 - ((Calculadora.Wboton+5)*2) , Calculadora.Wboton, Calculadora.Hboton);
        }
        if(n == 7 || n == 8 || n == 9){
            boton.setBounds((Calculadora.Wboton+5)*(n-7)+5,425 - 5 - ((Calculadora.Wboton+5)*3 )  , Calculadora.Wboton, Calculadora.Hboton);
        }
        
        return boton;
    }
}

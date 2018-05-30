/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuiCalculador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author gerar
 */
public class FactoryBotonFunctions {

    public static BotonC getBoton(String func, Calculadora ca) {
        BotonC boton = new BotonC(-1, func);
        ArrayList<String> signos = new ArrayList<>();
        signos.add("=");
        signos.add("+");
        signos.add("-");
        signos.add("*");
        signos.add("/");
        switch (func) {
            case "=":
                boton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String equation = Calculadora.pantalla;
                        try {
                            Calculadora.pantalla = Solver.Compute(equation) + "";

                        } catch (Exception ex) {
                            Calculadora.pantalla = "SyntaxError";
                            //update Pantalla
                        } finally {
                            Calculadora.updatePantalla(ca);

                        }
                    }
                });
                boton.setBounds((Calculadora.Wboton + 5 )* 3 + 5, 425 - 5 - ((Calculadora.Wboton+5 )* (signos.indexOf(func))), Calculadora.Wboton, Calculadora.Hboton);

                break;
            case "ac":
                boton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Calculadora.pantalla = "";
                        //update pantalla
                        Calculadora.updatePantalla(ca);
                    }
                });
                boton.setBounds((Calculadora.Wboton + 5)* 1 + 5, 425 - 5 - (4 *( Calculadora.Hboton + 5)), Calculadora.Wboton, Calculadora.Hboton);

                break;
            case "c":
                boton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try{
                        Calculadora.pantalla = Calculadora.pantalla.substring(0, Calculadora.pantalla.length() - 1);
                        }
                        catch(Exception errhs){}
                        //update pantalla
                        Calculadora.updatePantalla(ca);
                    }
                });
                boton.setBounds((Calculadora.Wboton +5)* 2 + 5, 425 - 5 - (4 * (Calculadora.Hboton+5)), Calculadora.Wboton, Calculadora.Hboton);

                break;
            default:
                boton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Calculadora.pantalla += boton.Value;
                        //update pantalla
                        Calculadora.updatePantalla(ca);
                    }
                });

                if (func.equals("+") || func.equals("/") || func.equals("*") || func.equals("-")) {

                    boton.setBounds((Calculadora.Wboton  + 5)* 3 + 5, 425 - 5 - ((Calculadora.Wboton +5)* (signos.indexOf(func))), Calculadora.Wboton, Calculadora.Hboton);
                        
                } else {
                    if (func.equals(".")) {
                        boton.setBounds((Calculadora.Wboton +5)* 2 + 5, 425 - 5, Calculadora.Wboton, Calculadora.Hboton);
                    }
                }
                break;

        }

        return boton;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuiCalculador;

import javax.swing.JButton;

/**
 *
 * @author gerar
 */
public class BotonC extends JButton{
   int value;
   String Value;

    public BotonC(int value, String Value) {
        super(Value);
        this.value = value;
        this.Value = Value;
    }
   
   
   public String getValueStr(){
      return Value;
   }
   
   public int getValueInt(){
       return value;
   }
    
}

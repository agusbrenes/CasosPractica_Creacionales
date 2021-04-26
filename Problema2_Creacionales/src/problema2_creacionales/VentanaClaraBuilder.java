/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2_creacionales;

/**
 *
 * @author Chuz2
 */
public class VentanaClaraBuilder extends Builder{
    public VentanaClaraBuilder(){}
    
    @Override
    public void buildComponentes(){
        ventana.setComponentsMode("Claro");
    }
    
}

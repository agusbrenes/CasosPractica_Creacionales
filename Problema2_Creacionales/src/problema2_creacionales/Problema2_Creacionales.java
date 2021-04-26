package problema2_creacionales;

import java.util.Scanner;

public class Problema2_Creacionales {

    public static void main(String[] args) {
        Ventana window = new Ventana();
        Builder builder;
        String selec;
        Director direc = new Director();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Oscuro (1) \n Claro (2) \n Eliga un modo de color para la ventana :");
        selec = scan.nextLine();
        
        if ("1".equals(selec))
            builder = new VentanaOscuraBuilder();
            
        else 
            builder = new VentanaClaraBuilder();
        
        direc.setVentanaBuilder(builder);
        direc.construirVentana();
        System.out.println(window.toString());
    }

}

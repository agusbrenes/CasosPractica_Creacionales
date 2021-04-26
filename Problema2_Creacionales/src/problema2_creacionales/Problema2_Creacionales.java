package problema2_creacionales;

import java.util.Scanner;

public class Problema2_Creacionales {

    public static void main(String[] args) {
        Ventana window;
        Builder builder;
        String selec;
        Director direc = new Director();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Elija el modo del app que desea usar:\n1. oscuro\n2. claro\n");
        selec = scan.nextLine();
        
        if ("1".equals(selec))
            builder = new VentanaOscuraBuilder();
            
        else 
            builder = new VentanaClaraBuilder();
        
        direc.setVentanaBuilder(builder);
        direc.construirVentana();
        window = direc.getVentana();
        System.out.println(window.toString());
    }

}

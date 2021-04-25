package problema6_creacionales;

import java.util.Scanner;

public class Problema6_Creacionales {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PiezaCreator factory = null;
        
        System.out.println("Cual forma desea para la Pieza?\n"
                + "1. J\n"
                + "2. L\n"
                + "3. T\n"
                + "4. Z\n"
                + "5. S\n"
                + "6. E\n"
                + "7. O\n");
        var num = input.nextInt();
        
        switch(num) {
            case 1:
                factory = new PiezaJCreator();
            case 2:
                factory = new PiezaLCreator();
            case 3:
                factory = new PiezaTCreator();
            case 4:
                factory = new PiezaZCreator();
            case 5:
                factory = new PiezaSCreator();
            case 6:
                factory = new PiezaECreator();
            case 7:
                factory = new PiezaOCreator();
            default:
                System.out.println("Numero introducido incorrecto... ://");
        }
        Pieza pieza = factory.createPieza();
        System.out.println(pieza.toString());
    }

}

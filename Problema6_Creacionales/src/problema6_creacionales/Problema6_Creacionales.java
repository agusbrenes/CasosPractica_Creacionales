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
        int num = input.nextInt();
        
        switch(num) {
            case 1:
                factory = new PiezaJCreator();
                break;
            case 2:
                factory = new PiezaLCreator();
                break;
            case 3:
                factory = new PiezaTCreator();
                break;
            case 4:
                factory = new PiezaZCreator();
                break;
            case 5:
                factory = new PiezaSCreator();
                break;
            case 6:
                factory = new PiezaECreator();
                break;
            case 7:
                factory = new PiezaOCreator();
                break;
            default:
                System.out.println("Numero introducido incorrecto... ://");
                break;
        }
        Pieza pieza = factory.createPieza();
        System.out.println(pieza.toString());
    }

}

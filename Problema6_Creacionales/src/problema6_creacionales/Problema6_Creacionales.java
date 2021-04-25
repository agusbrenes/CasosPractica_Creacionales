package problema6_creacionales;

import java.util.Scanner;

public class Problema6_Creacionales {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
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
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            default:
                System.out.println("Numero introducido incorrecto... ://");
        }
        //PiezaCreator factory = 
    }

}

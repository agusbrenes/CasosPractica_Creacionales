package problema6_creacionales;

public class PiezaSCreator extends PiezaCreator {
    public PiezaSCreator(){}
    
    @Override
    public Pieza createPieza(){
        int rand = (int)Math.floor(Math.random()*(6 - 0 + 1) + 0);
        Color c;
        switch (rand) {
            case 0:
                c = Color.AMARILLO;
                break;
            case 1:
                c = Color.MAGENTA;
                break;
            case 2:
                c = Color.NARANJA;
                break;
            case 3:
                c = Color.CELESTE;
                break;
            case 4:
                c = Color.VERDE;
                break;
            case 5:
                c = Color.AZUL;
                break;
            default:
                c = Color.ROJO;
                break;
        }
        
        return new PiezaS(c);
    }
}

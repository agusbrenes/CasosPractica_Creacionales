package problema6_creacionales;

public class PiezaJ extends Pieza {
    
    public PiezaJ(Color color) {
        super(color);
    }

    @Override
    public String toString() {
        String msg = "Esta es una pieza J color ";
        switch (this.color) {
            case AMARILLO -> msg += "amarillo.\n";
            case MAGENTA -> msg += "magenta.\n";
            case NARANJA -> msg += "naranja.\n";
            case CELESTE -> msg += "celeste.\n";
            case VERDE -> msg += "verde.\n";
            case AZUL -> msg += "azul.\n";
            case ROJO -> msg += "rojo.\n";
            default -> msg += "indefinido.\n";
        }
        return msg;
    }
}

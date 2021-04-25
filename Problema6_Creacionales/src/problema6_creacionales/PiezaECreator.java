package problema6_creacionales;

public class PiezaECreator extends PiezaCreator {
    public PiezaECreator(){}
    
    @Override
    public Pieza createPieza(){
        Color colors[] = Color.values();
        int rand = (int)Math.floor(Math.random()*((colors.length - 1) - 0 + 1) + 0);
        
        return new PiezaE(colors[rand]);
    }
}

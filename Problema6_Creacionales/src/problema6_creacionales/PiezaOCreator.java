package problema6_creacionales;

public class PiezaOCreator extends PiezaCreator {
    public PiezaOCreator(){}
    
    @Override
    public Pieza createPieza(){
        Color colors[] = Color.values();
        int rand = (int)Math.floor(Math.random()*((colors.length - 1) - 0 + 1) + 0);
        
        return new PiezaO(colors[rand]);
    }
}

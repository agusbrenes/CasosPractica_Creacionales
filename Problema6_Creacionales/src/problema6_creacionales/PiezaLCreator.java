package problema6_creacionales;

public class PiezaLCreator extends PiezaCreator {
    public PiezaLCreator(){}
    
    @Override
    public Pieza createPieza(){
        Color colors[] = Color.values();
        int rand = (int)Math.floor(Math.random()*((colors.length - 1) - 0 + 1) + 0);
        
        return new PiezaL(colors[rand]);
    }
}

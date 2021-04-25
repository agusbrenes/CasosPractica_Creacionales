package problema6_creacionales;

public class PiezaJCreator extends PiezaCreator {
    public PiezaJCreator(){}
    
    @Override
    public Pieza createPieza(){
        Color colors[] = Color.values();
        int rand = (int)Math.floor(Math.random()*((colors.length - 1) - 0 + 1) + 0);
        
        return new PiezaJ(colors[rand]);
    }
}

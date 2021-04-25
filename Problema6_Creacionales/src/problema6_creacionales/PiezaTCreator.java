package problema6_creacionales;

public class PiezaTCreator extends PiezaCreator {
    public PiezaTCreator(){}
    
    @Override
    public Pieza createPieza(){
        Color colors[] = Color.values();
        int rand = (int)Math.floor(Math.random()*((colors.length - 1) - 0 + 1) + 0);
        
        return new PiezaT(colors[rand]);
    }
}

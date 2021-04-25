package problema6_creacionales;

public abstract class Pieza {
    protected Color color;

    public Pieza(Color color) {
        this.color = color;
    }
    public abstract String toString();
}

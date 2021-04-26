package problema2_creacionales;

public abstract class Builder {
    protected Ventana ventana;
    
    public Builder(){}
    
    public Ventana getVentana() {
        return ventana;
    }
    
    public void createVentana() {
        ventana = new Ventana();
    }
    
    public abstract void buildComponentes();
}

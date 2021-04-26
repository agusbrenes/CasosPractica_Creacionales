package problema2_creacionales;

public class Director {
    private Builder builder;
    
    public Director() {}
    
    public void setVentanaBuilder(Builder builder) {
        this.builder = builder;
    }
    
    public Ventana getVentana() {
        return builder.getVentana();
    }
    
    public void construirVentana(){
        builder.createVentana();
        builder.buildComponentes();
    }
}

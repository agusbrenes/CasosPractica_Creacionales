package problema2_creacionales;

public class Director {
    public Builder builder;
    
    public Director(Builder builder) {
        this.builder = builder;
    }
    
    public Ventana construct(){
        return this.builder.buildComponentes();
    }
}

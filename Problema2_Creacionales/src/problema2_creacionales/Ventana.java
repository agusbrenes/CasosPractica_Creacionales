package problema2_creacionales;

public class Ventana {
    String componentsMode = "";

    public Ventana() {
    }
    
    public void setComponentsMode(String mode) {
        componentsMode = mode;
    }
    
    public String toString() {
        return "Ventana con componentes en modo " + componentsMode + ".\n";
    }

}

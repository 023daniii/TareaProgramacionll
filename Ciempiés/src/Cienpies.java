import java.util.ArrayList;
import java.util.List;

public class Cienpies implements IMovimiento {
    public int edad;
    public String nombre;
    public String color;
    private Cabeza cabeza;
    private List<Segmento> segmentos;

    

    public Cienpies(String nombre, int edad, String color, int cantidadsegmentos) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
        
    
        this.cabeza = new Cabeza();
        this.segmentos = new ArrayList<>();
        
        for (int i = 0; i < cantidadsegmentos; i++) {
            segmentos.add(new Segmento());
        }
    }

    @Override
    public boolean mover() {
        System.out.println(nombre + " se mueve con todo su cuerpo.");
        cabeza.mover();
        for (Segmento s : segmentos) {
            s.mover();
        }
        return true;
    }
}
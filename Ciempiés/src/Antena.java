public class Antena implements IMovimiento {

    
    public boolean detectarObstaculo() {
        System.out.println("Antena escaneando el entorno...");
        return false; 
    }

    
    @Override
    public boolean mover() {
        System.out.println("La antena se mueve para detectar peligros.");
        return true;
    }
}
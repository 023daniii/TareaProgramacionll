class Pata {
    // Vacía
}

class Colmillo {
    private boolean venenoso;
}

public class Arana {
    private String especie;
    
    private Pata[] patas;
    private Colmillo[] colmillos;
    
    public Arana() {
        this.patas = new Pata[8];
        for (int i = 0; i < 8; i++) {
            patas[i] = new Pata();
        }
        
        this.colmillos = new Colmillo[2];
        colmillos[0] = new Colmillo();
        colmillos[1] = new Colmillo();
    }
    
    public void mover() {
    }
    
    public void tejer() {
    }
    
    public void morder() {
    }
}
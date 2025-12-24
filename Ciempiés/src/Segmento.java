public class Segmento implements IMovimiento {
    
    private Pata pataDerecha;
    private Pata pataIzquierda;

    public Segmento() {
       
        this.pataDerecha = new Pata();
        this.pataIzquierda = new Pata();
    }

    @Override
    public boolean mover() {
        pataDerecha.mover();
        pataIzquierda.mover();
        return true;
    }
}
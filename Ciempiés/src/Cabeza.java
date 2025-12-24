public class Cabeza implements IMovimiento {
    private Antena antenaIzquierda;
    private Antena antenaDerecha;

    public Cabeza() {
        this.antenaIzquierda = new Antena();
        this.antenaDerecha = new Antena();
    }

    public void morder() {
        System.out.println("¡Mordida!");
    }

    @Override
    public boolean mover() {
        return antenaIzquierda.mover() && antenaDerecha.mover();
    }
}

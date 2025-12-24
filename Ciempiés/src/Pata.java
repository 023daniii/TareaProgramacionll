public class Pata implements IMovimiento {
    public int patasFuncionales; 
    private Veneno veneno; 

   
    public void setVeneno(Veneno v) {
        this.veneno = v;
    }

    @Override
    public boolean mover() {
        System.out.println("Pata moviéndose...");
        if (veneno != null) {
            veneno.inyectar();
        }
        System.out.println("Segrego veneno.");
        return true;
    }
}
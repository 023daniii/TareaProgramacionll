public class Main {
    public static void main(String[] args) {
        Cienpies miCienpies = new Cienpies("Charlie", 2, "rojo", 5);
        
        System.out.println("=== Probando el Cienpiés ===");
        System.out.println("Nombre: " + miCienpies.nombre);
        System.out.println("Edad: " + miCienpies.edad + " dias");
        System.out.println("Color: " + miCienpies.color);
        System.out.println();
    
        miCienpies.mover();
        System.out.println();
        
      
        Veneno venenoMortal = new Veneno();
        venenoMortal.toxicidad = 95;
        
        Pata pataConVeneno = new Pata();
        pataConVeneno.patasFuncionales = 10;
        pataConVeneno.setVeneno(venenoMortal);
        
        System.out.println("=== Probando Pata con Veneno ===");
        pataConVeneno.mover();
        System.out.println();
        
        
        Antena antena = new Antena();
        System.out.println("=== Probando Antena ===");
        antena.mover();
        boolean hayObstaculo = antena.detectarObstaculo();
        System.out.println("¿Hay obstáculo? " + hayObstaculo);
    }
}

class Atomo {
    private String simbolo;
}

class Hidrogeno extends Atomo {
    private String simobolo;
}

class Oxigeno extends Atomo {
    private String simbolo;
}

public class MoleculaDeAgua {
    private String formula;
    
    private Hidrogeno[] hidrogenos;
    private Oxigeno oxigeno;
    
    public MoleculaDeAgua() {
        this.hidrogenos = new Hidrogeno[2];
        hidrogenos[0] = new Hidrogeno();
        hidrogenos[1] = new Hidrogeno();
        
        this.oxigeno = new Oxigeno();
    }
}
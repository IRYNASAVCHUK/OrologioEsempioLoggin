package com.myproject.clock;
public class OrologioDaPolso implements IOrologio {
    private int ore, minuti;

    public OrologioDaPolso(int ore, int minuti) {
        this.ore = ore;
        this.minuti = minuti;
    }

    @Override
    public String getOra() {
        return "\t"+this.ore+":"+this.minuti;
    }

    public void carica(){
        //ricarica l'orologio
    }
}

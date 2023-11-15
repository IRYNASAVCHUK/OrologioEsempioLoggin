package com.mypoject.clock;
public class Sveglia implements IOrologio {

    private int ore, minuti;
    private int oreAllarme, minutiAllarme;
    
    public Sveglia(int ore, int minuti) {
        this.ore = ore;
        this.minuti = minuti;
    }

    public void setAllarme(int oreAllarme,int minutiAllarme) {
        this.oreAllarme = oreAllarme;
        this.minutiAllarme = minutiAllarme;
    }

    public String getAllarme() {
        return "\t"+this.oreAllarme+":"+this.minutiAllarme;
    }

    @Override
    public String getOra() {
   return "\t"+this.ore+":"+this.minuti;
    }
    public void suona(){
        //fai suonare l'allarme
    }
}

package hu.petrik.javaoopdolgozat;

import java.time.LocalDateTime;

public class Bejegyzes {

    String szerzo;
    String tartalom;
    int likeok;
    LocalDateTime letrejott;
    LocalDateTime szerkesztve;
    private boolean voltSzerkeztve;

    public Bejegyzes(String szerzo, String tartalom) {
        this.szerzo = szerzo;
        this.tartalom = tartalom;
        this.likeok = 0;
        this.letrejott = LocalDateTime.now();
        this.szerkesztve = LocalDateTime.now();
        this.voltSzerkeztve = false;
    }

    public String getSzerzo() {
        return szerzo;
    }

    public String getTartalom() {
        return tartalom;
    }

    public void setTartalom(String tartalom) {
        this.tartalom = tartalom;
        this.szerkesztve = LocalDateTime.now();
        voltSzerkeztve = true;
    }

    public int getLikeok() {
        return likeok;
    }

    public LocalDateTime getLetrejott() {
        return letrejott;
    }

    public LocalDateTime getSzerkesztve() {
        return szerkesztve;
    }

    public void like(){
        this.likeok++;
    }

    @Override
    public String toString() {
        return this.szerzo + " - " + this.likeok + " - "
                + this.letrejott + "\n"
                + (this.voltSzerkeztve ? ("Szerkesztve: " + this.szerkesztve + "\n") : "")
                + this.tartalom;
    }
}

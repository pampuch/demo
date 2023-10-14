public class Adres {


String ulica;

String miasto;

int kod_pocztowy;


    public Adres(String ulica, String miasto, int kod_pocztowy) {
        this.ulica = ulica;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public int getKod_pocztowy() {
        return kod_pocztowy;
    }

    public void setKod_pocztowy(int kod_pocztowy) {
        this.kod_pocztowy = kod_pocztowy;
    }
}



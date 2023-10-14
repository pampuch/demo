public class Osoba {




    String imie;

    String nazwisko;

    int pesel;

    int wiek;


    public Osoba (){} //konstruktor bezparametrowy


    public Osoba (String imie, String nazwisko, int pesel, int wiek){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.wiek = wiek;
    }




    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }


    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko() {
        this.nazwisko = nazwisko;
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }


    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }


    @Override
    public String toString() {
        return "Osoba{" +
                "imie= " + imie + '\'' +
                "nazwisko= " + nazwisko + '\'' +
                "pesel= " + pesel + '\'' +
                "wiek= " + wiek + '\'' +
                "}";

}}







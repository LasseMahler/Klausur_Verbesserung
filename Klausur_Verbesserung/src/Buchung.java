public class Buchung {

    Kunde kunde;
    Medien medium;

    public Buchung(Kunde kunde, Medien medium){
        setKunde(kunde);
        setMedium(medium);
    }
    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }
    public void setMedium(Medien medium) {
        this.medium = medium;
    }
    public Kunde getKunde() {
        return kunde;
    }
    public Medien getMedium() {
        return medium;
    }


}


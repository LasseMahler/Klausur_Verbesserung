public class Mitarbeiter extends Mensch{

    int mitarbeiternummer;

    public Mitarbeiter(String vorname, String nachname, int mitarbeiternummer){
        super(vorname, nachname);
        setMitarbeiternummer(mitarbeiternummer);
    }
    public void setMitarbeiternummer(int mitarbeiternummer) {
        this.mitarbeiternummer = mitarbeiternummer;
    }
    public int getMitarbeiternummer() {
        return mitarbeiternummer;
    }
}


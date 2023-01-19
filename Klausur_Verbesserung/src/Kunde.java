import java.util.ArrayList;

public class Kunde extends Mensch{

    int kundennummer;
    int alter;

    Medien[] ausleihen = new Medien[4]; 

    ArrayList<Verwarnung> verwarnungen = new ArrayList<>();

    public Kunde(String vorname, String nachname, int alter, int kundennummer){
        super(vorname, nachname);
        setAlter(alter);
        setKundennummer(kundennummer);
    }
    public void setAusleihen(Medien[] ausleihen) {
        this.ausleihen = ausleihen;
    }
    public void setKundennummer(int kundennummer) {
        this.kundennummer = kundennummer;
    }
    public void setAlter(int alter) {
        this.alter = alter;
    }
    public void setVerwarnungen(ArrayList<Verwarnung> verwarnungen) {
        this.verwarnungen = verwarnungen;
    }
    public int getAlter() {
        return alter;
    }
    public int getKundennummer() {
        return kundennummer;
    }
    public Medien[] getAusleihen() {
        return ausleihen;
    }
    public ArrayList<Verwarnung> getVerwarnungen() {
        return verwarnungen;
    }
}

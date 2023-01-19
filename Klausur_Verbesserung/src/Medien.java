public abstract class Medien {

    String titel;
    int FSK;
    int laenge;
    boolean verliehen;

    public Medien(String titel, int FSK, int laenge, boolean verliehen){
        setFSK(FSK);
        setLaenge(laenge);
        setTitel(titel);
        setVerliehen(verliehen);
    }

    public abstract void zeigeDaten();



    public void setFSK(int fSK) {
        FSK = fSK;
    }
    public void setLaenge(int laenge) {
        this.laenge = laenge;
    }
    public void setTitel(String titel) {
        this.titel = titel;
    }
    public void setVerliehen(boolean verliehen) {
        this.verliehen = verliehen;
    }
    public int getFSK() {
        return FSK;
    }
    public int getLaenge() {
        return laenge;
    }
    public String getTitel() {
        return titel;
    }
    public boolean getVerliehen(){
        return verliehen;
    }

}

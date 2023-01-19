public class Verwarnung {

    String datum;
    String grund;

    public Verwarnung(String datum, String grund){
        setDatum(datum);
        setGrund(grund);
    }
    public void setDatum(String datum) {
        this.datum = datum;
    }
    public void setGrund(String grund) {
        this.grund = grund;
    }
    public String getDatum() {
        return datum;
    }
    public String getGrund() {
        return grund;
    }
}

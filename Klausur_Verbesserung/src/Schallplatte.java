public class Schallplatte extends Medien{

    boolean darfVerliehenwerden;

    public Schallplatte(String titel, int FSK, int laenge, boolean verliehen, boolean darfVerliehenwerden){
        super(titel, FSK, laenge, verliehen);
        setDarfVerliehenwerden(darfVerliehenwerden);
    }
    public void setDarfVerliehenwerden(boolean darfVerliehenwerden) {
        this.darfVerliehenwerden = darfVerliehenwerden;
    }
    public boolean getDarfVerliehenwerden(){
        return darfVerliehenwerden;
    }


    public void zeigeDaten(){
        System.out.println(getTitel() + " " + getFSK() + " " + getLaenge() + " " + " " + getDarfVerliehenwerden());
    }


}

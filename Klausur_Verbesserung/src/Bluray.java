public class Bluray extends Medien {

    boolean is3D;
    
    public Bluray(String titel, int FSK, int laenge, boolean verliehen,  boolean is3d){
        super(titel, FSK, laenge, verliehen);
        setIs3D(is3d);
        }
    public void setIs3D(boolean is3d) {
        is3D = is3d;
    }
    public boolean getIs3d(){
        return is3D;
    }
    
    public void zeigeDaten(){
        System.out.println(getTitel() + " " + getFSK() + " " + getLaenge() + " " + " " + getIs3d());
    }
    
}


public class DVD extends Medien{

    boolean isFullHD;

    public DVD(String titel, int FSK, int laenge, boolean verliehen, boolean isFullHD){
        super(titel, FSK, laenge, verliehen);
        setFullHD(isFullHD);
    }
    public void setFullHD(boolean isFullHD) {
        this.isFullHD = isFullHD;
    }
    public boolean getIsFullHD(){
        return isFullHD;
    }


    public void zeigeDaten(){
        System.out.println(getTitel() + " " + getFSK() + " " + getLaenge() + " " + " " + getIsFullHD());
    }

}


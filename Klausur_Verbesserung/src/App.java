import java.util.ArrayList;

public class App {

    public static ArrayList<Buchung> buchungen = new ArrayList<>();
    public static ArrayList<Medien> alleMedien = new ArrayList<>();
    public static ArrayList<Schallplatte> alleSchallplatten = new ArrayList<>();
    public static void main(String[] args) throws Exception {


    }

    // 1.)
    public static void demoTest(){

        Kunde k1 = new Kunde("Dieter", "Müller", 20, 12345);
        Kunde k2 = new Kunde("Manfred", "Achim", 15, 15);
        Bluray br1 = new Bluray("Iron man 1", 6, 120, false, true);
        DVD d1 = new DVD("Endgame", 16, 100, true, false);

        buchungen.add(new Buchung(k2, d1));
        buchungen.add(new Buchung(k2, br1));
        buchungen.add(new Buchung(k1, d1));
        buchungen.add(new Buchung(k1, br1));

        int index = 0;
        for(Buchung buchung : buchungen){


            if(buchung.getKunde().getAlter() < buchung.getMedium().getFSK()){
                System.out.println("Sie sind leider zu jung.");
                buchungen.remove(index);
            }
            else{

                if(buchung.getKunde().getAusleihen().length > 5){
                    System.out.println("Es wurden zu viele Medien ausgeliehen");
                    buchungen.remove(index);
                }
                else{
                    
                    System.out.println("Buchvorgang hat geklappt, vielen dank für ihren Einkauf!");
                    buchung.getKunde().ausleihen[buchung.getKunde().getAusleihen().length] = buchung.getMedium();
                }
            }
            index++;
        }

        }

        public static void testWarnungen(){

            Kunde k1 = new Kunde("Dieter", "Müller", 24, 14062005);
            Kunde k2 = new Kunde("Manfred", "Achim", 12, 14062006);
            Bluray br1 = new Bluray("Iron man 1", 12, 150, true, true);
            DVD d1 = new DVD("Endgame", 12, 250, true, false);
    
            buchungen.add(new Buchung(k2, d1));
            buchungen.add(new Buchung(k2, br1));
            buchungen.add(new Buchung(k1, d1));
            buchungen.add(new Buchung(k1, br1));
    
            Verwarnung v1 = new Verwarnung("14.06.22", "ZU spät");
            Verwarnung v2 = new Verwarnung("24.06.22", "Beschädigt");
            Verwarnung v3 = new Verwarnung("4.5.22", "Zu spät");
            Verwarnung v4 = new Verwarnung("10.1.22", "Beschädigt");
            Verwarnung v5 = new Verwarnung("7.9.1999", "Zu spät");

            k1.getVerwarnungen().add(v2);
            k1.getVerwarnungen().add(v1);
            k1.getVerwarnungen().add(v3);
            k1.getVerwarnungen().add(v4);
            k1.getVerwarnungen().add(v5);

            int index = 0;

        for(Buchung buchung : buchungen){
            index++;
            if(buchung.getKunde().getAlter() < buchung.getMedium().getFSK()){
                System.out.println("Sie sind leider zu jung.");
                buchungen.remove(index);
            }
            else{
                if(buchung.getKunde().getAusleihen().length > 5){
                    System.out.println("Sie haben zu viele Medien ausgeliehen!");
                    buchungen.remove(index);
                }
                else{
                    if(buchung.getKunde().getVerwarnungen().size() >= 5){
                        System.out.println("Sie haben zu viele Verwarnungen");
                        buchungen.remove(index);
                    }
                    else{
                    System.out.println("Buchvorgang hat geklappt, vielen dank für ihren Einkauf!");
                    buchung.getKunde().ausleihen[buchung.getKunde().getAusleihen().length] = buchung.getMedium();
                    }
                }
            }
        }
    }

    // Aufgabe 4

    public static void ueberschreibeAusleihe(){
        	
        for(Medien mediens : alleMedien){
            if(mediens.getVerliehen() == true){
                mediens.setVerliehen(false);
            }
            else{
                mediens.setVerliehen(true);
            }
        System.out.println("Ausleihe wurde überschrieben");
        }
    }

    // Aufgabe 3

    public static void zeigeMedien(){
        Bluray br1 = new Bluray("Iron man 1", 12, 150, true, true);
        DVD d1 = new DVD("Endgame", 12, 250, false, false);
        alleMedien.add(d1);
        alleMedien.add(br1);

        int i = 1;
        for(Medien mediens : alleMedien){

            System.out.println(i);
            mediens.zeigeDaten();
            i++;
        }
    }

    // Aufgabe 5


    public static void aendereSchallplatten(){

        for(Schallplatte mediens : alleSchallplatten){
            if(mediens.getDarfVerliehenwerden() == true){
                mediens.setDarfVerliehenwerden(false);
            }
            else{
                mediens.setDarfVerliehenwerden(true);;
            }
        System.out.println("Schallplatte wurde überschrieben");
        }
    }

}




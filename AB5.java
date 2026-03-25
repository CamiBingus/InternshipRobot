import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class AB5 extends Roboter {
    /*#
     * Aufgabe 1, 2, 3 und 10: Upgrade 1 - ein neuer Sensor wird erstellt
     */
    public boolean istFassVorne() {
        // Aufgabe 3a
        if (istVorne("Fass")) {
            // Aufgabe 3b

            return true;


        } else {
            // Aufgabe 3b
            if (istVorne("Atommuell")) {
                return true;
            } else {
                return false;
            }

        }
        // Aufgabe 3c

    }

    /*#
     * Aufgabe 4: Rueckspiegel
     */
    public boolean istFassHinten() {
        dreheUm();
        if (istVorne("Fass")) {
            dreheUm();
            return true;
        } else {
            dreheUm();
            return false;
        }
    }

    /*#
     * Aufgabe 5: Out of Power
     */
    public boolean istEnergieSchwach() {
        if (getEnergie() < 40) {
            return true;
        } else {
            return false;
        }

        // Hier fehlt noch einiges!
    }

    /*#
     * Aufgabe 6: Heavy Duty
     */
    // Hier ist Platz fuer die Methode istSchwerBeladen():
    public boolean istSchwerBeladen() {
        if (getAnzahl() > 5) {
            return true;
        } else {
            return false;
        }
    }
public void wennfreidannvor() {
        if (istVorneFrei()){
            einsVor();
        }
        else{
            while(true) {
                dreheUm();
            }

        }
}
    /*#
     * Aufgabe 7 und 11: Look Ahead - Upgrade 2
     */
    // Hier ist Platz fuer die Methode istVorFassFrei():
    public boolean istVorFassFrei() {
        dreheRechts();
        wennfreidannvor();
        dreheLinks();
        wennfreidannvor();
        wennfreidannvor();
        dreheLinks();
        if (!istVorneFrei()) {
            wennfreidannvor();
            wennfreidannvor();
            dreheRechts();
            wennfreidannvor();
            dreheRechts();
            return false;
        } else {
                dreheLinks();
                wennfreidannvor();
                wennfreidannvor();
                dreheRechts();
                wennfreidannvor();
                dreheRechts();
                return true;
        }

    }

    public void wievielistVorFassFrei() {
        int schritte = 0;
        dreheRechts();
        wennfreidannvor();
        dreheLinks();
        wennfreidannvor();
        wennfreidannvor();
        dreheLinks();
        while (!istVorne("Wand")|| !istVorne("Atommuell")||!istVorne("Fass")) {
            schritte=schritte+1;
            dreheRechts();
            if (istVorneFrei()){
                einsVor();
                dreheLinks();
            }
            else {
                dreheUm();
                einsVor();
                mehrvor(schritte);
                dreheRechts();
                einsVor();
                dreheRechts();
            }

        }
//        if (!istVorneFrei()) {
//            dreheLinks();
//            mehrvor(schritte);
//            dreheRechts();
//            einsVor();
//            dreheRechts();
//        }

    }

    public void mehrvor(int schritte){
        for (int i = 0; i < schritte; i++) {
            einsVor();
        }
    }

    /*#
     * Aufgabe 8: Aufraeumen
     */
    // Hier ist Platz fuer die Methode schiebeFassBisWand():
    public void schiebefassbiswand() {
        wievielistVorFassFrei();
//        if (istVorne("Fass")) {
//            while (istVorne("Fass") && istVorFassFrei()) {
//                wennfreidannvor();
//            }
//
//
//        } else {
//            if (istVorne("Atommuell")) {
//                while (istVorne("Atommuell") && istVorFassFrei()) {
//                    wennfreidannvor();
//                }
//            }
//
//        }
    }

    /*#
     * Aufgabe 9: Fuehrerschein
     */
    // Hier ist Platz fuer die Methode istKreuzung():

    public void geheBisKreuzung() {

        while (istWandLinks() || istWandRechts()) {
            einsVor();

        }
    }

    /*#
     * Aufgabe 12: Wie koennte man diese Methode nennen?
     */
    // Hier ist Platz fuer die Methode ???():

    /*#
     * Einsatz 5: Bitte den Namen nicht aendern!
     */
    public void einsatz5() {

    }
}
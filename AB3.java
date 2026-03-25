import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class AB3 extends Roboter
{

    /*#
     * Aufgabe 1: Feuer loeschen
     */
    public void loesche() {
        einsVor();
        vorBisFeuer();
        benutze("Feuerloescher");
        while(!istVorne("Wand"))
        {
            einsVor();
            benutze("Feuerloescher");

        }

    }

    /*#
     * Aufgaben 3 & 4: Vor bis zum Feuer (wo auch immer das ist)
     */
    public void vorBisFeuer() 
    {
        while(!istVorne("Feuer")) {
            einsVor();

        }
    }

    /*#
     * Aufgabe 5: Feuersbrunst loeschen
     */
    // Hier kommt deine Methode loescheReihe() hin:

    /*#
     * Aufgabe 6: Teste Reichweite eines Feuerloeschers
     */
    // Hier kommt die Methode testeReichweite() hin:
       public void  testeReichweite()
       {
           einsVor();
           dreheLinks();
           einsVor();
           aufnehmen();
           dreheUm();
           einsVor();
           einsVor();
           dreheLinks();
           vorBisFeuer();
           benutze("Feuerloescher");
           while(!istVorne("Wand"))
           {
               einsVor();
               benutze("Feuerloescher");
           }
       }


    /*#
     * Aufgabe 7: Feuerloescher einsammeln
     */
    public void sammleLoescher() 
    {
        laufeBisWand();
        dreheUm();
        einsVor();
        dreheRechts();
        einsVor();
        aufnehmen();
        dreheUm();
        einsVor();
        dreheRechts();
        einsVor();
        einsVor();
        dreheRechts();
        einsVor();
        aufnehmen();
        dreheUm();
        einsVor();
        dreheRechts();
        einsVor();
        einsVor();
        dreheRechts();
        einsVor();
        aufnehmen();
        dreheUm();
        einsVor();
        dreheRechts();
        einsVor();
        einsVor();
        dreheRechts();
        einsVor();
        aufnehmen();
        dreheUm();
        einsVor();
        einsVor();
        dreheLinks();
        vorBisFeuer();
        benutze("Feuerloescher");
        while(!istVorne("Wand"))
        {
            einsVor();
            benutze("Feuerloescher");

        }

        // Hier bitte deinen Quelltext einf�gen
    }  

    /*#
     * Hilfsmethode fuer Aufgabe 8
     */
    public void laufeBisWand() {
        while (!istVorne("Wand")) {
            einsVor();
            // Hier bitte deinen Quelltext einf�gen
        }
    }
    public void feuersammel() {
        einsVor();
        dreheLinks();
        einsVor();
        aufnehmen();
        dreheUm();
        einsVor();
        dreheLinks();
        einsVor();
    }

     // Aufgabe 8: Homerun
     public void homerun() {
         laufeBisWand();
         dreheLinks();
         laufeBisWand();
         dreheLinks();
         laufeBisWand();
         dreheLinks();
         laufeBisWand();
         dreheLinks();
         laufeBisWand();
         dreheLinks();
         einsVor();
     }
    public void laufeBisSackgasse() {
        // Hier bitte deinen Quelltext einf�gen
    }

    /*#
     * Einsatz 3: Bitte den Namen nicht aendern!
     */
    public void einsatz3() {
        feuersammel();
        feuersammel();
        feuersammel();
        feuersammel();
        feuersammel();
        dreheRechts();
        einsVor();
        einsVor();
        dreheRechts();
        vorBisFeuer();
        einsatzhilfe();
        einsatzhilfe();
        einsatzhilfe();
        dreheLinks();
        benutze("Feuerloescher");
        einsVor();
        dreheLinks();
        vorBisFeuer();
        einsatzhilfe();
        einsatzhilfe();
        dreheRechts();
        einsatzhilfe();
        dreheRechts();
        einsatzhilfe();
        dreheRechts();
        einsatzhilfe();
        laufeBisWand();
        dreheRechts();
        laufeBisWand();
        dreheLinks();
        laufeBisWand();


    }
    public void einsatzhilfe() {
        while (istVorne("Feuer")) {
            benutze("Feuerloescher");
            einsVor();
        }
        while (istWandVorne()){
            dreheLinks();
            while(!istVorne("Feuer")){

                    benutze("Feuerloescher");
                    einsVor();




                            }




        }

        }

    }

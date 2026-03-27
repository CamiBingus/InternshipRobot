public class AB6_AB7 extends Roboter
{
    // Eigenschaften eines AB6 - Objektvariablen (Attribute) werden deklariert:
    private int schritte;
    private int drehungen =0;
    // + ist links und - ist rechts


    // AB6 - Aufgabe 8: Hier wird das Attribut drehungen deklariert:

    /*#
     * Konstruktor eines AB6: Der Startzustand wird definiert
     */
    public AB6_AB7() {
        // Startzustand eines AB6 - Objektvariablen werden initialiaiert:
        this.schritte = 0;

        // AB6 - Aufgabe 8: Initialisiere das Attribut drehungen hier:

    }

    /*#
     * AB6 - Beispiel Z�hlen, 
     * AB7 - Aufgabe 4: Super
     */
    public void einsVorMitZaehlen() {
        // Das Attribut Schritte muss um eins erhoeht werden und dann die alte einsVor-Methode des AB6-Roboters aufgerufen werden: 
        this.schritte++;
        einsVor();
    }

    /*#
     * AB6 - Aufgabe 7: Schrittezaehler
     * AB7 - Aufgabe 5: Brennstaebe zaehlen
     */
    public void bisWandMitZaehlen() {
        while (istVorneFrei()) {
            einsVorMitZaehlen();
        }
    }


    /*#
     * AB6 - Aufgabe 8: Drehzaehler
     * AB7 - Aufgabe 6: Standardmethoden �berschreiben
     */
    public void dreheRechtsMitZaehlen() {
        dreheRechts();
        drehungen--;
    }

    public void dreheLinksMitZaehlen() {
        dreheLinks();
        drehungen++;
    }

    /*#
     * AB6 - Aufgabe 9: Eine get-Methode
     */
    public int getSchritte() {
        return schritte;
    }
    public int getDrehungen() {
        return drehungen;
    }
    /*#
     * AB6 - Aufgabe 10: Deine get-Methode
     */
    // Hier kommt deine get-Methode fuer die Anzahl der Drehungen hin.
    // Benenne sie sinnvoll:

    /*#
     * Liefert die Anzahl der gez�hlten Brennst�be zur�ck
     * AB7 - Aufgabe 5: Brennstaebe zaehlen
     */
    public int getBrennstaebe() {
        return 0;
    }

    /*#
     * AB6 - Einsatz 6:
     */
    public void einsatz6() {
        while (!istAufGegenstand("Portal")) {
            bisWandMitZaehlen();
            dreheRechtsMitZaehlen();
            if (!istAufGegenstand("Portal")) {
                if (!istWandLinks() && drehungen != 0) {
                    dreheLinksMitZaehlen();
                    einsVorMitZaehlen();
                } else {
                    if (istWandVorne()) {
                        dreheRechtsMitZaehlen();
                    } else {
                        einsVorMitZaehlen();
                    }
                }
            }
        }
    }

    /*#
     * Weitere Methoden zum AB7:
     */

    /*#
     * AB7 - Aufgabe 1: Kreuzungen zaehlen (aus AB3)
     */

    /*#
     * AB7 - Aufgabe 7: Fass links
     */
    // Hier kommt die Methode istFassLinks() hin:

    /*#
     * AB7 - Aufgabe 8: Standardmethoden �berschreiben (istWandVorne(), istWandLinks())
     */

    /*#
     * AB7 - Hilfsmethode f�r Einsatz 7:
     */

    public boolean istWandLinks() {
        // Diese Methode muss so erweitert werden, dass sie auch F�sser auf der linken Seite erkennt.
        return super.istWandLinks();
    }

    /*#
     * AB7 - Einsatz 7:
     */
    public void einsatz7(){

    }
}
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class AB2 extends Roboter
{
    /*#
     * Aufgabe 3: Diese Anweisungen stimmen noch nicht wirklich
     * Verbessere und Ergaenze.
     */
    public void dreheRunde() 
    {
        einsVor();
        einsVor();
        einsVor();
        einsVor();
        dreheLinks();
        einsVor();
        einsVor();
        dreheLinks();
        einsVor();
        einsVor();
        einsVor();
        einsVor();
        dreheLinks();
        einsVor();
        einsVor();

    }

    /*#
     * Aufgabe 4: Drehe um
     */
    public void dreheUm() 
    {
        // Hier kommen die Befehl f�r eine 180� Drehung hin
        dreheLinks();
        dreheLinks();
    }

    /*#
     * Aufgabe 5: Sammle Schrauben
     */
    public void sammle3() 
    {

        einsVor();
        aufnehmen();
        einsVor();
        aufnehmen();
        einsVor();
        aufnehmen();
        // Hier erg�nzen
    }

      public void haken()
      {
          dreheLinks();
          einsVor();
          dreheRechts();
          einsVor();
          einsVor();
          dreheRechts();
          einsVor();
      }

    // Schau dir die Methoden oben an und gehe analog vor:
    
    /*#
     * Aufgabe 7: Vier Dinge sammeln
     */
   public void viersammeln()
   {
       einsVor();
       aufnehmen();
       einsVor();
       aufnehmen();
       einsVor();
       aufnehmen();
       einsVor();
       aufnehmen();
   }

    /*#
     * Einsatz 2: Bitte den Namen "einsatz2" nicht aendern!
     */
    public void einsatz2() {
        einsVor();
        einsVor();
        einsVor();
        dreheLinks();
        einsVor();
        einsVor();
        aufnehmen();
        dreheLinks();
        einsVor();
        dreheRechts();
        einsVor();
        einsVor();
        dreheRechts();
        einsVor();

        dreheLinks();
        einsVor();
        aufnehmen();
        einsVor();
        aufnehmen();
        einsVor();
        aufnehmen();
        dreheRechts();
        einsVor();
        einsVor();
        dreheLinks();
        einsVor();

      // Hier kommte der Code f�r den ersten echten Einsatz hin:
    }
}

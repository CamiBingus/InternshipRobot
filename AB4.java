import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class AB4 extends Roboter {
    /*#
     * Aufgabe 1: Spur invertieren
     */

    /**
     * Der Roboter tauscht aus. Wo eine Schraube liegt, hebt er sie auf.
     * Wo keine liegt, legt er eine ab, wenn er noch Schrauben
     * in seinem Vorrat hat.
     */
    public void tausche() {
        if (istAufGegenstand("Schraube")) {
            aufnehmen();
        } else {
            ablegen("Schraube");
        }
    }

    /**
     * Der Roboter macht mehrere Dinge. Beschreibe in diesem Kommentar:
     *
     */
    public void tauscheUndVor() {
        tausche();
        if (istVorneFrei()) {
            einsVor();
        }
        // else ist nicht noetig, weil in dem Fall nichts gemacht wird!                 
    }

    /*#
     * Aufgabe 2: Tausche die Schraubenreihe bis zur Wand
     */
    public void tauscheBisWand() {
        while (!istWandVorne()) {
            tauscheUndVor();
        }
        tausche();
    }

    /*#
     * Aufgabe 3: Fleckenfrei
     */
    // Hier kommt die Methode umgeheOelfleck() hin:
    public void flecknfrei() {
        if (istVorne("Oelfleck")) {
            dreheRechts();
            if (istVorneFrei()) {
                einsVor();
                dreheLinks();
                einsVor();
                einsVor();
                dreheLinks();
                einsVor();
                dreheRechts();
                einsVor();
                dreheRechts();
                if (istVorneFrei()) {
                    einsVor();
                    dreheLinks();
                    einsVor();
                    einsVor();
                    dreheLinks();
                    einsVor();
                    if (istVorneFrei()) {
                        einsVor();
                        dreheRechts();
                        einsVor();
                        einsVor();
                        dreheRechts();
                        einsVor();
                        dreheLinks();
                        einsVor();
                        einsVor();
                        dreheRechts();
                        if (istVorneFrei()) {
                            einsVor();
                            dreheLinks();
                            einsVor();
                            einsVor();
                            dreheLinks();
                            einsVor();
                            dreheRechts();
                        } else {
                            dreheUm();
                            einsVor();
                            dreheRechts();
                            einsVor();
                            einsVor();
                            dreheRechts();
                            einsVor();
                            dreheLinks();
                        }
                    } else {
                        dreheUm();
                        einsVor();
                        dreheLinks();
                        einsVor();
                        einsVor();
                        dreheLinks();
                        einsVor();
                        dreheRechts();
                        einsVor();
                        einsVor();
                        dreheRechts();
                        if (istVorneFrei()) {
                            einsVor();
                            dreheLinks();
                            einsVor();
                            einsVor();
                            dreheLinks();
                            einsVor();
                            dreheRechts();
                        } else {
                            dreheUm();
                            einsVor();
                            dreheRechts();
                            einsVor();
                            einsVor();
                            dreheRechts();
                            einsVor();
                            dreheLinks();
                        }
                    }
                } else {
                    dreheUm();
                    einsVor();
                    dreheRechts();
                    einsVor();
                    einsVor();
                    dreheRechts();
                    einsVor();
                    if (istVorneFrei()) {
                        einsVor();
                        dreheLinks();
                        einsVor();
                        einsVor();
                        dreheLinks();
                        einsVor();
                        dreheRechts();
                        einsVor();
                        einsVor();
                        dreheRechts();
                        if (istVorneFrei()) {
                            einsVor();
                            dreheLinks();
                            einsVor();
                            einsVor();
                            dreheLinks();
                            einsVor();
                            dreheRechts();
                        } else {
                            dreheUm();
                            einsVor();
                            dreheRechts();
                            einsVor();
                            einsVor();
                            dreheRechts();
                            einsVor();
                            dreheLinks();
                        }
                    } else {
                        dreheUm();
                        einsVor();
                        dreheRechts();
                        einsVor();
                        einsVor();
                        dreheRechts();
                        einsVor();
                        dreheLinks();
                        einsVor();
                        einsVor();
                        dreheLinks();
                        if (istVorneFrei()) {
                            einsVor();
                            dreheRechts();
                            einsVor();
                            einsVor();
                            dreheRechts();
                            einsVor();
                            dreheLinks();
                        } else {
                            dreheUm();
                            einsVor();
                            dreheLinks();
                            einsVor();
                            einsVor();
                            dreheLinks();
                            einsVor();
                            dreheRechts();
                        }
                    }
                }
            } else {
                dreheUm();
                einsVor();
                dreheRechts();
                einsVor();
                einsVor();
                dreheRechts();
                einsVor();
                dreheLinks();
                einsVor();
                dreheRechts();
                if (istVorneFrei()) {
                    einsVor();
                    dreheLinks();
                    einsVor();
                    einsVor();
                    dreheLinks();
                    einsVor();
                    if (istVorneFrei()) {
                        einsVor();
                        dreheRechts();
                        einsVor();
                        einsVor();
                        dreheRechts();
                        einsVor();
                        dreheLinks();
                        einsVor();
                        einsVor();
                        dreheRechts();
                        if (istVorneFrei()) {
                            einsVor();
                            dreheLinks();
                            einsVor();
                            einsVor();
                            dreheLinks();
                            einsVor();
                            dreheRechts();
                        } else {
                            dreheUm();
                            einsVor();
                            dreheRechts();
                            einsVor();
                            einsVor();
                            dreheRechts();
                            einsVor();
                            dreheLinks();
                        }
                    } else {
                        dreheUm();
                        einsVor();
                        dreheLinks();
                        einsVor();
                        einsVor();
                        dreheLinks();
                        einsVor();
                        dreheRechts();
                        einsVor();
                        einsVor();
                        dreheRechts();
                        if (istVorneFrei()) {
                            einsVor();
                            dreheLinks();
                            einsVor();
                            einsVor();
                            dreheLinks();
                            einsVor();
                            dreheRechts();
                        } else {
                            dreheUm();
                            einsVor();
                            dreheRechts();
                            einsVor();
                            einsVor();
                            dreheRechts();
                            einsVor();
                            dreheLinks();
                        }
                    }
                } else {
                    dreheUm();
                    einsVor();
                    dreheRechts();
                    einsVor();
                    einsVor();
                    dreheRechts();
                    einsVor();
                    if (istVorneFrei()) {
                        einsVor();
                        dreheLinks();
                        einsVor();
                        einsVor();
                        dreheLinks();
                        einsVor();
                        dreheRechts();
                        einsVor();
                        einsVor();
                        dreheRechts();
                        if (istVorneFrei()) {
                            einsVor();
                            dreheLinks();
                            einsVor();
                            einsVor();
                            dreheLinks();
                            einsVor();
                            dreheRechts();
                        } else {
                            dreheUm();
                            einsVor();
                            dreheRechts();
                            einsVor();
                            einsVor();
                            dreheRechts();
                            einsVor();
                            dreheLinks();
                        }
                    } else {
                        dreheUm();
                        einsVor();
                        dreheRechts();
                        einsVor();
                        einsVor();
                        dreheRechts();
                        einsVor();
                        dreheLinks();
                        einsVor();
                        einsVor();
                        dreheLinks();
                        if (istVorneFrei()) {
                            einsVor();
                            dreheRechts();
                            einsVor();
                            einsVor();
                            dreheRechts();
                            einsVor();
                            dreheLinks();
                        } else {
                            dreheUm();
                            einsVor();
                            dreheLinks();
                            einsVor();
                            einsVor();
                            dreheLinks();
                            einsVor();
                            dreheRechts();
                        }
                    }
                }
            }


        }
    }


    /*#
     * Aufgabe 4: Schluessel aufheben
     */
    // Hier kommt die Methode sammleSchluessel() hin:
    public void schluzel() {
        if (istAufGegenstand("Schluessel")) {
            aufnehmen();
        } else {
            einsVor();
        }
        laufeBisWand();
    }


    /*#
     * Aufgabe 5: Sesam oeffne dich
     */
    // Hier kommt die Methode oeffneTuer() hin:
    public void oeffneTuer() {

        if (istWandVorne()) {
            while (!istInventarLeer()) {
                dreheLinks();
                if (istVorne("Schloss")) {
                    benutze("Schluessel");
                }
            }
        }
        dreheRechts();
        laufeBisWand();
    }


    /*#
     * Hilfsmethode fuer Aufgabe 9
     */
    public void laufeBisWand() {
        while (istVorneFrei()) {
            einsVor();
        }
    }

    /*#
     * Aufgabe 9: Labyrinth
     */
    // Hier kommt die Methode labyrinth() hin:
    public void labyhelp() {
        laufeBisWand();
        if (istWandVorne() && istWandLinks() && istWandRechts()) {
            // dreheLinks();
            // dreheLinks();
            // laufeBisWand();
            dreheLinks();
        }

        if (istWandVorne() && istWandRechts() && !istWandLinks()) {
            dreheLinks();
            laufeBisWand();
        } else {
            if (istWandVorne() && istWandLinks() && !istWandRechts()) {
                dreheRechts();
                laufeBisWand();
            }
        }

    }


    public void laby() {
        labyhelp();
        labyhelp();
        labyhelp();
        labyhelp();
        labyhelp();
        labyhelp();
        labyhelp();
        labyhelp();
        labyhelp();
        labyhelp();
    }

    /*#
     * Einsatz 4: Bitte den Namen nicht aendern!
     */
    public void einsatz4() {
        // F�ge hier deinen Quelltext ein

        einstaz4help();
        einstaz4help();
        einstaz4help();
        einstaz4help();
        einstaz4help();
        einstaz4help();
        einstaz4help();
        einstaz4help();
        einstaz4help();
        einstaz4help();
        einstaz4help();
        zweiteHilfe();
    }

    public void einstaz4help() {
        while (istVorneFrei()) {
            laufeBisWand();
            if (istWandVorne() && istWandRechts() && !istWandLinks()) {
                dreheLinks();

            }
            if (istWandRechts() && istWandVorne() && istWandLinks()) {
                dreheLinks();
                if (istVorne("Schalter")) {
                    benutze("Schalter");
                    dreheRechts();
                }
                if (istVorne("Schloss")) {
                    benutze("Schluessel");
                    dreheRechts();
                }

                }
            }

            if (istWandVorne() && istWandLinks() && !istWandRechts()) {
                dreheRechts();

            }


        }
        public void zweiteHilfe() {
            dreheUm();
            einsVor();
            dreheLinks();
            if (istVorne("Schalter")) {
                benutze("Schalter");
                dreheRechts();

            }
            else {

                einsVor();
                dreheLinks();
            }
            if (istVorne("Schalter")) {
                benutze("Schalter");
                dreheRechts();
            }
            else {

                einsVor();
                dreheLinks();
            }
            if (istVorne("Schalter")) {
                benutze("Schalter");
                dreheRechts();
            }
            else {

                einsVor();
                dreheLinks();
            }
            if (istVorne("Schalter")) {
                benutze("Schalter");
                dreheRechts();
            }
            einsVor();
            dreheLinks();
            if (istVorne("Schalter")) {
                benutze("Schalter");
                dreheRechts();
            }
        }
    }


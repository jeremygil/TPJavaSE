package fr.epsi.partie14;

public class Compte {
    private static int sommeDepots;
    private static int sommeRetraits;
    private static int decouvert;

    public Compte( int pSommeDepots, int pSommeRetraits ) {
        this.sommeDepots = pSommeDepots;
        this.sommeRetraits = pSommeRetraits;
        this.decouvert = 0;
    }

    public static void depotDe( int montant ) {
        sommeDepots += montant;
    }

    public static boolean verifDecouvert( int montant ) {
        boolean test = false;
        if ( montant > ( sommeDepots + decouvert - sommeRetraits ) ) {
            test = false;
        } else {
            test = true;
        }
        return test;
    }

    public static void retraitDe( int montant ) {
        boolean test = verifDecouvert( montant );
        if ( test == true ) {
            sommeRetraits += montant;
        } else {
            System.out.println( "Le retrait est impossible car vous êtes à découvert !" );
        }
    }

    public static int getSommeDepots() {
        return sommeDepots;
    }

    public static int getSommeRetraits() {
        return sommeRetraits;
    }

    public static int getSolde() {
        return ( getSommeDepots() - getSommeRetraits() );
    }

    public static void setDecouvert( int pDecouvert ) {
        decouvert = pDecouvert;
    }

    public static int getDecouvert() {
        return decouvert;
    }
}

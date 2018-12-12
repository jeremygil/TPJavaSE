package fr.epsi.partie13;

public class Compte {
    private static int sommeDepots;
    private static int sommeRetraits;

    public Compte( int pSommeDepots, int pSommeRetraits ) {
        this.sommeDepots = pSommeDepots;
        this.sommeRetraits = pSommeRetraits;
    }

    public static void depotDe( int montant ) {
        sommeDepots += montant;
    }

    public static void retraitDe( int montant ) {
        sommeRetraits += montant;
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
}

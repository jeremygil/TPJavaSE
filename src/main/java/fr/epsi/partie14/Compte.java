package fr.epsi.partie14;

public class Compte {
    private static int sommeDepots;
    private static int sommeRetraits;
    private static int decouvert;

    public Compte() {
        this.setSommeDepots( 0 );
        this.setSommeRetraits( 0 );
    }

    public Compte( int pDecouvert ) {
        this();
        this.setDecouvert( pDecouvert );
    }

    public static void depotDe( int montant ) {
        sommeDepots += montant;
    }

    public static boolean verifDecouvert( int montant ) {
        boolean test = false;
        if ( montant > ( getSolde() + decouvert ) ) {
            test = false;
        } else {
            test = true;
        }
        return test;
    }

    public static String retraitDe( int montant ) {
        String chaine = "";
        if ( verifDecouvert( montant ) ) {
            sommeRetraits += montant;
            chaine = "Retrait effectué !";
        } else {
            chaine = "Le retrait est impossible car vous êtes à découvert !";
        }
        return chaine;
    }

    public static void setSommeDepots( int sommeDepots ) {
        Compte.sommeDepots = sommeDepots;
    }

    public static void setSommeRetraits( int sommeRetraits ) {
        Compte.sommeRetraits = sommeRetraits;
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

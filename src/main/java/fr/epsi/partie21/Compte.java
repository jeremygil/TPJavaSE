package fr.epsi.partie21;

public class Compte {
    private static int[] depots;
    private static int[] retraits;
    private static int   decouvert;
    private static int   iDepots;
    private static int   iRetraits;

    public Compte() {
        depots = new int[15];
        retraits = new int[15];
        this.setiDepots( 0 );
        this.setiRetraits( 0 );
    }

    public Compte( int pDecouvert ) {
        this();
        this.setDecouvert( pDecouvert );
    }

    public static int getiDepots() {
        return iDepots;
    }

    public static void setiDepots( int iDepots ) {
        Compte.iDepots = iDepots;
    }

    public static int getiRetraits() {
        return iRetraits;
    }

    public static void setiRetraits( int iRetraits ) {
        Compte.iRetraits = iRetraits;
    }

    public static void depotDe( int montant ) {
        depots[iDepots] = montant;
        iDepots++;
    }

    public static boolean verifDecouvert( int montant ) {
        boolean test = false;
        if ( montant > ( getSommeDepots() + decouvert - getSommeRetraits() ) ) {
            test = false;
        } else {
            test = true;
        }
        return test;
    }

    public static String retraitDe( int montant ) {
        String chaine = "";
        if ( verifDecouvert( montant ) ) {
            retraits[iRetraits] = montant;
            chaine = "Retrait éffectué !";
        } else {
            chaine = "Le retrait est impossible car vous êtes à découvert !";
        }
        iRetraits++;
        return chaine;
    }

    public static int getSommeDepots() {
        int somme = 0;
        for ( int sommeDep : depots ) {
            somme += sommeDep;
        }
        return somme;
    }

    public static int getSommeRetraits() {
        int somme = 0;
        for ( int sommeRet : retraits ) {
            somme += sommeRet;
        }
        return somme;
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

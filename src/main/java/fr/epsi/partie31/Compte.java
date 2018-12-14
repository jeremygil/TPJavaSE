package fr.epsi.partie31;

import java.util.ArrayList;

public class Compte {
    private static ArrayList<Integer> depots;
    private static ArrayList<Integer> retraits;
    private static int                decouvert;

    public Compte() {
        depots = new ArrayList<Integer>();
        retraits = new ArrayList<Integer>();
    }

    public Compte( int pDecouvert ) {
        this();
        this.setDecouvert( pDecouvert );
    }

    public static void depotDe( int montant ) {
        depots.add( montant );
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
            retraits.add( montant );
            chaine = "Retrait éffectué !";
        } else {
            chaine = "Le retrait est impossible car vous êtes à découvert !";
        }
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

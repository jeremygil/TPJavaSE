package fr.epsi.partie41;

import java.util.ArrayList;

public class Compte {
    private static ArrayList<Mouvement> depots;
    private static ArrayList<Mouvement> retraits;
    private static int                  decouvert;

    public Compte() {
        depots = new ArrayList<Mouvement>();
        retraits = new ArrayList<Mouvement>();
    }

    public Compte( int pDecouvert ) {
        this();
        this.setDecouvert( pDecouvert );
    }

    public static void depotDe( int montant ) {
        depots.add( new Mouvement( montant, "depot" ) );
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
            retraits.add( new Mouvement( montant, "retrait" ) );
            chaine = "Retrait éffectué !";
        } else {
            chaine = "Le retrait est impossible car vous êtes à découvert !";
        }
        return chaine;
    }

    public static int getSommeDepots() {
        int somme = 0;
        for ( Mouvement sommeDep : depots ) {
            somme += sommeDep.getMontant();
        }
        return somme;
    }

    public static int getSommeRetraits() {
        int somme = 0;
        for ( Mouvement sommeRet : retraits ) {
            somme += sommeRet.getMontant();
        }
        System.out.println( "getSommeretrait somme : " + somme );
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

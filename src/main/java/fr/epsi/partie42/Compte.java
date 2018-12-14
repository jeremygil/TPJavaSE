package fr.epsi.partie42;

import java.util.ArrayList;

public class Compte {
    private static ArrayList<Mouvement> historique;
    private static int                  decouvert;

    public Compte() {
        historique = new ArrayList<Mouvement>();
    }

    public Compte( int pDecouvert ) {
        this();
        this.setDecouvert( pDecouvert );
    }

    public static void depotDe( int montant ) {
        historique.add( new Mouvement( montant, "depot" ) );
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
            historique.add( new Mouvement( montant, "retrait" ) );
            chaine = "Retrait éffectué !";
        } else {
            chaine = "Le retrait est impossible car vous êtes à découvert !";
        }
        return chaine;
    }

    public static int getSommeDepots() {
        int somme = 0;
        for ( Mouvement sommeDep : historique ) {
            if ( sommeDep.getTypeMvt() == "depot" ) {
                somme += sommeDep.getMontant();
            }
        }
        return somme;
    }

    public static int getSommeRetraits() {
        int somme = 0;
        for ( Mouvement sommeRet : historique ) {
            if ( sommeRet.getTypeMvt() == "retrait" ) {
                somme += sommeRet.getMontant();
            }
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

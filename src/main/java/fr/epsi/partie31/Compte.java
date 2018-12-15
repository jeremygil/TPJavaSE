package fr.epsi.partie31;

import java.util.ArrayList;

public class Compte {
    private ArrayList<Integer> depots;
    private ArrayList<Integer> retraits;
    private int                decouvert;

    public Compte() {
        depots = new ArrayList<Integer>();
        retraits = new ArrayList<Integer>();
    }

    public Compte( int pDecouvert ) {
        this();
        this.setDecouvert( pDecouvert );
    }

    public void depotDe( int montant ) {
        depots.add( montant );
    }

    public boolean verifDecouvert( int montant ) {
        boolean test = false;
        if ( montant > ( getSolde() + decouvert ) ) {
            test = false;
        } else {
            test = true;
        }
        return test;
    }

    public String retraitDe( int montant ) {
        String chaine = "";
        if ( verifDecouvert( montant ) ) {
            retraits.add( montant );
            chaine = "Retrait éffectué !";
        } else {
            chaine = "Le retrait est impossible car vous êtes à découvert !";
        }
        return chaine;
    }

    public int getSommeDepots() {
        int somme = 0;
        for ( int sommeDep : depots ) {
            somme += sommeDep;
        }
        return somme;
    }

    public int getSommeRetraits() {
        int somme = 0;
        for ( int sommeRet : retraits ) {
            somme += sommeRet;
        }
        return somme;
    }

    public int getSolde() {
        return ( getSommeDepots() - getSommeRetraits() );
    }

    public void setDecouvert( int pDecouvert ) {
        decouvert = pDecouvert;
    }

    public int getDecouvert() {
        return decouvert;
    }
}

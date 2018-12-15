package fr.epsi.partie44;

import java.util.ArrayList;

import fr.epsi.partie43.Depot;
import fr.epsi.partie43.Mouvement;
import fr.epsi.partie43.Retrait;

public class Compte {
    private ArrayList<Mouvement> historique;
    private int                  decouvert;

    public Compte() {
        historique = new ArrayList<Mouvement>();
    }

    public Compte( int pDecouvert ) {
        this();
        this.setDecouvert( pDecouvert );
    }

    public void depotDe( int montant ) {
        historique.add( new Depot( montant ) );
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
            historique.add( new Retrait( montant ) );
            chaine = "Retrait effectué !";
        } else {
            chaine = "Le retrait est impossible car vous êtes à découvert !";
        }
        return chaine;
    }

    public int getSommeDepots() {
        int somme = 0;
        for ( Mouvement sommeDep : historique ) {
            if ( sommeDep instanceof Depot ) {
                somme += sommeDep.getMontant();
            }

        }
        return somme;
    }

    public int getSommeRetraits() {
        int somme = 0;
        for ( Mouvement sommeRet : historique ) {
            if ( sommeRet instanceof Retrait ) {
                somme += sommeRet.getMontant();
            }
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

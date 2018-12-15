package fr.epsi.partie21;

public class Compte {
    private int[] depots;
    private int[] retraits;
    private int   decouvert;
    private int   iDepots;
    private int   iRetraits;

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

    public int getiDepots() {
        return iDepots;
    }

    public void setiDepots( int iDepots ) {
        this.iDepots = iDepots;
    }

    public int getiRetraits() {
        return iRetraits;
    }

    public void setiRetraits( int iRetraits ) {
        this.iRetraits = iRetraits;
    }

    public void depotDe( int montant ) {
        depots[iDepots] = montant;
        iDepots++;
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
            retraits[iRetraits] = montant;
            chaine = "Retrait éffectué !";
        } else {
            chaine = "Le retrait est impossible car vous êtes à découvert !";
        }
        iRetraits++;
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

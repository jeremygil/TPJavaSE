package fr.epsi.partie11;

public class Compte {
    public static int solde;

    public Compte( int montant ) {
        this.solde = montant;
    }

    public static void depotDe( int montant ) {
        solde += montant;
    }

    public static void retraitDe( int montant ) {
        solde -= montant;
    }

    public static int getSolde() {
        return solde;
    }
}

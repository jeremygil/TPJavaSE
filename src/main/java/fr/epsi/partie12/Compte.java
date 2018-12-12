package fr.epsi.partie12;

public class Compte {
    private static int solde;

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

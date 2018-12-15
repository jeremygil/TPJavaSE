package fr.epsi.partie44;

public class Depot extends Mouvement {
    public Depot( int pMontant ) {
        super( pMontant );
    }

    public int getPlus() {
        int somme = 0;
        Depot[] unDepot = { new Depot( 0 ), (Depot) new Mouvement( 0 ) };
        for ( Mouvement sommeDep : unDepot ) {
            somme += sommeDep.getMontant();
        }
        return somme;
    }
}

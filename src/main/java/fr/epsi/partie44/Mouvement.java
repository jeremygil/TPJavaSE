package fr.epsi.partie44;

import java.util.Date;

public class Mouvement {
    private int  montant;
    private Date dateMvt;

    public Mouvement( int pMontant ) {
        this.montant = pMontant;
        setDateMvt( new java.util.Date() );

    }

    public int getMontant() {
        return montant;
    }

    public void setMontant( int montant ) {
        this.montant = montant;
    }

    public Date getDateMvt() {
        return dateMvt;
    }

    public void setDateMvt( Date dateMvt ) {
        this.dateMvt = dateMvt;
    }

    public int getPlus() {
        int somme = 0;
        Depot[] unDepot = { new Depot( 0 ), (Depot) new Mouvement( 0 ) };
        for ( Depot sommeDep : unDepot ) {
            somme += sommeDep.getMontant();
        }
        return somme;
    }
}

package fr.epsi.partie43;

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

}

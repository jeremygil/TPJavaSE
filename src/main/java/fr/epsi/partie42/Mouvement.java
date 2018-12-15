package fr.epsi.partie42;

import java.util.Date;

public class Mouvement {
    private int    montant;
    private Date   dateMvt;
    private String typeMvt;

    public Mouvement( int pMontant, String pTypeMvt ) {
        this.montant = pMontant;
        setDateMvt( new java.util.Date() );
        this.typeMvt = pTypeMvt;
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

    public String getTypeMvt() {
        return typeMvt;
    }

    public void setTypeMvt( String typeMvt ) {
        this.typeMvt = typeMvt;
    }
}

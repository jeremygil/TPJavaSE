package fr.epsi.partie42;

import java.util.Date;

public class Mouvement {
    private static int    montant;
    private static Date   dateMvt;
    private static String typeMvt;

    public Mouvement( int pMontant, String pTypeMvt ) {
        this.montant = pMontant;
        setDateMvt( new java.util.Date() );
        this.typeMvt = pTypeMvt;
    }

    public static int getMontant() {
        return montant;
    }

    public static void setMontant( int montant ) {
        Mouvement.montant = montant;
    }

    public static Date getDateMvt() {
        return dateMvt;
    }

    public static void setDateMvt( Date dateMvt ) {
        Mouvement.dateMvt = dateMvt;
    }

    public static String getTypeMvt() {
        return typeMvt;
    }

    public static void setTypeMvt( String typeMvt ) {
        Mouvement.typeMvt = typeMvt;
    }
}

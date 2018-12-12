package fr.epsi.partie11;

public class TestCompte {

    public static void main( String[] args ) {
        Compte compte = new Compte( 2000 );

        System.out.println( "Votre solde initial est de  " + compte.getSolde() + "€" );

        compte.depotDe( 400 );
        System.out.println( "Votre nouveau solde est de  " + compte.getSolde() + "€" );

        compte.retraitDe( 1000 );
        System.out.println( "Votre nouveau solde est de  " + compte.getSolde() + "€" );

        compte.depotDe( 1400 );
        System.out.println( "Votre nouveau solde est de  " + compte.getSolde() + "€" );

        compte.retraitDe( 1600 );
        System.out.println( "Votre nouveau solde est de  " + compte.getSolde() + "€" );

        compte.depotDe( 4500 );
        System.out.println( "Votre nouveau solde est de  " + compte.getSolde() + "€" );

        compte.retraitDe( 3600 );
        System.out.println( "Votre nouveau solde est de  " + compte.getSolde() + "€" );
    }

}

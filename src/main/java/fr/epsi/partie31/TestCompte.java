package fr.epsi.partie31;

public class TestCompte {

    public static void main( String[] args ) {
        Compte compte = new Compte( 500 );

        System.out.println( "Votre solde initial est de  " + compte.getSolde() + "€" );

        compte.depotDe( 400 );
        System.out.println( "Votre nouveau solde est de  " + compte.getSolde() + "€" );

        System.out.println( compte.retraitDe( 800 ) );
        System.out.println( "Votre nouveau solde est de  " + compte.getSolde() + "€" );

        compte.depotDe( 1400 );
        System.out.println( "Votre nouveau solde est de  " + compte.getSolde() + "€" );

        System.out.println( compte.retraitDe( 600 ) );
        System.out.println( "Votre nouveau solde est de  " + compte.getSolde() + "€" );

        compte.depotDe( 4500 );
        System.out.println( "Votre nouveau solde est de  " + compte.getSolde() + "€" );

        System.out.println( compte.retraitDe( 5000 ) );
        System.out.println( "Votre nouveau solde est de  " + compte.getSolde() + "€" );

        System.out.println( compte.retraitDe( 500 ) );
        System.out.println( "Votre nouveau solde est de  " + compte.getSolde() + "€" );
    }

}

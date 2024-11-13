package de.mide.lambdademo;

import de.mide.lambdademo.stringHelfer.IStringBearbeiter;
import de.mide.lambdademo.stringHelfer.StringLaengeAnhaenger;


/**
 * Beispiel für Verwendung der Klasse {@code StringDekorierer},
 * die das SAM-Interface {@link IStringBearbeiter} implementiert.
 */
public class Main1 {

	public static void main( String[] args ) {
		
		final IStringBearbeiter sb = new StringLaengeAnhaenger();
				
		final String ergebnis = sb .verarbeiten( "Gurkensalat" );
		System.out.println( ergebnis );
	}
	
}

package services;

import java.util.Date;

import classes.Kunde;
import classes.Veranstaltung;

//Das System soll einen Kunden bzw. eine Veranstaltung mit vom Benutzer
//eingegebenen Daten erzeugen können.


public class ErstelleService {
	
	//erstelle Kunde
	public void erstelleKunde(String name, String adresse){
		Kunde kunde = new Kunde();
		kunde.setNameUndAdresse(name, adresse);
		
	}
	
	
	//erstelle Veranstaltung
	public void erstelleVeranstaltung(int identifikator, double ticketpreis,
			Date datum_und_uhrzeit, int verfuegbarePlaetze, String titel){
		
		Veranstaltung veranstaltung = new Veranstaltung();
		
		
		veranstaltung.setIdentifikator(identifikator);
		veranstaltung.setDatum_und_uhrzeit(datum_und_uhrzeit);
		veranstaltung.setTicketpreis(ticketpreis);
		veranstaltung.setTitel(titel);
		veranstaltung.setVerfuegbarePlaetze(verfuegbarePlaetze);
	}
	


}

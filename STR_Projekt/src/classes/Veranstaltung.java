package classes;

import java.util.Date;

public class Veranstaltung {
	
//	Veranstaltung: Identifikator, Titel, Datum und Uhrzeit, Ticketpreis, insgesamt
//	verfügbare Sitzplätze.
	
//	Findet eine Veranstaltung an mehreren Terminen statt, 
//	wird diese (um es hier nicht zu kompliziert zu machen) mehrfach gepflegt.
	public String titel;
	public Date datum_und_uhrzeit;
	public double ticketpreis;
	public int verfuegbarePlaetze; 
	private int identifikator;
	
	//Setters
	public void setIdentifikator(int identifikator) {
		this.identifikator = identifikator;
	}
	
	public void setTitel(String titel) {
		this.titel = titel;
	}
	
	public void setDatum_und_uhrzeit(Date datum_und_uhrzeit) {
		this.datum_und_uhrzeit = datum_und_uhrzeit;
	}
	
	public void setTicketpreis(double ticketpreis) {
		this.ticketpreis = ticketpreis;
	}
	
	public void setVerfuegbarePlaetze(int verfuegbarePlaetze) {
		this.verfuegbarePlaetze = verfuegbarePlaetze;
	}
	
	
	
	//Getters
	public int getIdentifikator() {
		return identifikator;
	}
	
	public String getTitel() {
		return titel;
	}
	
	public Date getDatum_und_uhrzeit() {
		return datum_und_uhrzeit;
	}
	
	public double getTicketpreis() {
		return ticketpreis;
	}
	
	public int getVerfuegbarePlaetze() {
		return verfuegbarePlaetze;
	}
	
	
	
	

}

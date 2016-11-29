package classes;


//bezieht sich auf einen Kunden und eine Veranstaltung. Enthält die Anzahl
//der gebuchten Sitzplätze und einen Identifikator.


public class Buchung {
	
	//parameter
	//kunden, anzahlSitzplatz + veranstaltungID
	//buchungsID
	int buchungsID= 0;
	int verfuegbarePlaetze = 0;
	int veranstaltungsID = 0;
	
public String setBuchung(String name, int verfuegbarePlaetze, int buchungsID, int veranstaltungsID) {
	this.verfuegbarePlaetze = verfuegbarePlaetze;
	this.buchungsID = buchungsID;
	this.veranstaltungsID = veranstaltungsID;
	
		String ergebnis= "Kunde"+ name+" hat zu der "
				+ "Veranstaltung:"+ veranstaltungsID+ " " + verfuegbarePlaetze+"Plätze";
		return ergebnis; 
	}



//??
	public String getBuchung(String name) {
		
		
		
		String ergebnis= "Kunde"+ name+" hat zu der "
				+ "Veranstaltung:"+ veranstaltungsID+ " " + verfuegbarePlaetze+"Plätze";
		return ergebnis; 
	}
		


}

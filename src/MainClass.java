import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.bind.JAXBException;

import geocoding.GeocodingResults;

public class MainClass 
{

	public static void main(String[] args) throws JAXBException, IOException 
	{

	/*	String address="25040+via+Gleno+18+Angolo Terme";
		String filename="geocoding.xml";
		
		Geocoding geocoding=new Geocoding (address, filename);
		if(geocoding.isSaved())
			System.out.println("Risposta del servizio salvata nel file "+filename);
		else
			System.out.println("Errore nell'interrogazione del servizio");
	*/
		String filename="geocoding.xml";
		
		ConsoleInput tastiera=new ConsoleInput();
		String address="";
/*		System.out.println("Inserisci il CAP");
		address+=tastiera.readLine();
		System.out.println("Inserisci via, o piazza");
		address+="+"+tastiera.readLine();
		System.out.println("Inserisci il nome della via");
		address+="+"+tastiera.readLine();
		System.out.println("Inserisci il numero civico");
		address+="+"+tastiera.readLine();
		System.out.println("Inserisci il Comune");
		address+="+"+tastiera.readLine();  
		System.out.println(address);
	*/
		System.out.println("Inserisci indirizzo");
		address+=tastiera.readLine();  
		System.out.println(address);
		
		Geocoding geocoding=new Geocoding (address, filename);
		if(geocoding.isSaved())
			System.out.println("Risposta del servizio salvata nel file "+filename);
		else
			System.out.println("Errore nell'interrogazione del servizio");
		
		GeocodingResults risultati=(GeocodingResults) XMLunmarshaller.unmarshal("geocoding.xml", "geocoding");
		System.out.println(risultati.getRESULTS().getResult().getCOORDINATES().toString());
		
	}

}



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

import javax.net.ssl.HttpsURLConnection;

public class Geocoding 
{
	//utilizza un altro servizio di geocoding rispetto a Google perchè Google richiede 
	//registrazione con carta di credito
	//il geocoding di www.geocode.farm consente 250 accessi al giorno senza API Key
	
	//Bienno+via+Ercoli+30+25040?xml
	//https://www.geocode.farm/v3/xml/forward/?addr=25040+via+Ercoli+55+Bienno
	private String prefix="https://www.geocode.farm/v3/xml/forward/?addr=";
	private String url;
	private String filename;
	private boolean saved=false;
	
	public Geocoding(String address, String filename)
	{
		URL server;
		HttpsURLConnection service;
		BufferedReader input;
		BufferedWriter output;
		int status;
		String line;
		
		this.filename=filename;
		try 
		{
			//costruzione dell' URL di interrogazione del web-service
			url=prefix+URLEncoder.encode(address,"UTF-8");
			server=new URL(url);
			service=(HttpsURLConnection)server.openConnection();
			//impostazione header di richiesta
			service.setRequestProperty("Host", "geocode.farm");
			service.setRequestProperty("Accept", "application/xml");
			service.setRequestProperty("Accept-Charset", "UTF-8");
			//impostazione del metodo di richiesta GET
			service.setRequestMethod("GET");
			//attivazione ricezione
			service.setDoInput(true);
			//connessione al web service
			service.connect();
			//verifica ststo risposta
			status=service.getResponseCode();
			if(status!=200)
			{
				return; //non OK
			}
			
			//apertura dello stream di ricezione da risorsa web
			input=new BufferedReader(new InputStreamReader(service.getInputStream(), "UTF-8"));
			//apertura stream per la scrittura sul file
			output=new BufferedWriter(new FileWriter(filename));
			//ciclo di lettura da web e scrittura su file
			while((line=input.readLine())!=null)
			{
				output.write(line);
				output.newLine();
			}
			input.close();
			output.close();
			saved=true;
		} 
		 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public boolean isSaved()
	{
		return saved;
	}
	
	

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

/**
 *
 * @author igor
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class NetClientGet {

	// http://localhost:8080/RESTfulExample/json/product/get
	public String run(int id) {

	  try {

		URL url = new URL("http://unitconverterrest.azurewebsites.net/api/products/Getproduct/"+id);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Accept", "application/json");

		if (conn.getResponseCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
					+ conn.getResponseCode());
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(
			(conn.getInputStream())));

		String output;
                String res = "";
                
		System.out.println("Recieving data from RESTful service .... \n");
		while ((output = br.readLine()) != null) {
                    res = output; 
                }
                
		conn.disconnect();
                return res;
	  } catch (MalformedURLException e) {
                return("MalformedURL exception");
		//e.printStackTrace();

	  } catch (IOException e) {
              return("IO expection");
		//e.printStackTrace();

	  }

	}

    public NetClientGet() {
    }

}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.util.Scanner;
import soap.Box;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author igor
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       System.out.println("To display product information enter product code");
        try (Scanner sc = new Scanner(System.in)) {
            int i = sc.nextInt();
            NetClientGet cli = new NetClientGet();
            String JSONTXT = cli.run(i);
            try {
                JSONObject jsonObj = new JSONObject(JSONTXT);
                System.out.println(jsonObj.toString());
                System.out.println("Information is in "+jsonObj.get("unitType").toString()+" Convert? y/n");
                String ans = sc.next();
                if(ans.equals("y")){
                    Box box = converter(jsonObj.get("prDescription").toString(),(int)jsonObj.get("id"),(double)jsonObj.get("prWeight"),(double)jsonObj.get("prWidth"),(double)jsonObj.get("prHeight"),(double)jsonObj.get("prDepth"),jsonObj.get("unitType").toString());
                    System.out.println("Connecting to SOAP convertioon service");
                    System.out.print(box);
                }
            } catch (JSONException ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }

    private static Box converter(java.lang.String name, int id, double weight, double w, double h, double d, java.lang.String unitType) {
        soap.BoxConverter_Service service = new soap.BoxConverter_Service();
        soap.BoxConverter port = service.getBoxConverterPort();
        return port.converter(name, id, weight, w, h, d, unitType);
    }
    
}

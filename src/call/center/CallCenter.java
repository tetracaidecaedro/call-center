/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package call.center;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 *
 * @author 72065690
 */
public class CallCenter {

    /**
     * @param args the command line arguments
     */
    static Clienti clienti;
    static Dipendenti dipendenti;
    public static void main(String[] args) {
        
        clienti = new Clienti();
        dipendenti = new Dipendenti();
        Chiamate chiamate = new Chiamate(clienti, dipendenti);
        
        Cliente cliente = new Cliente("Cliente1","via");
        clienti.add(cliente, 32848);
        dipendenti.add(new Dipendente("Dipendente1"), 64846);
        dipendenti.add(new Dipendente("Dipendente2"), 64847);
        dipendenti.add(new Dipendente("Dipendente3"), 64846);
        chiamate.addChiamata(32848, 64846);
        chiamate.addChiamata(32848, 64846);
        chiamate.addChiamata(32848, 64847);
        
        try{
        stampa(chiamate.getChiamate_Data(new GregorianCalendar(2018,5,2)));
        stampa(chiamate.getChiamateCliente(32848));
        stampa(chiamate.getChiamateDipendente(64846));
        }catch(Exception e){
            System.out.println("errore");
            System.out.println(e.toString());
        }
        
        
    }
    
    private static void stampa(ArrayList<Chiamata> chiamate) throws Exception{
        System.out.println("---------------------");
        for(Chiamata chiamata:chiamate){
            System.out.println("nome cliente: " + clienti.search(chiamata.codiceCliente).nome+ "; nome dipendente:" + dipendenti.search(chiamata.codiceDipendente).nome+"; codice cliente:" + chiamata.codiceCliente + "; codice dipendente:" + chiamata.codiceDipendente+"; indirizzo cliente:"+ clienti.search(chiamata.codiceCliente).indirizzo );
        }
    }
    
}

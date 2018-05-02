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
public class Chiamate {
    protected ArrayList<Chiamata> chiamate;
    protected Clienti clienti;
    protected Dipendenti dipendenti;
    
    public Chiamate(Clienti clienti, Dipendenti dipendenti){
        this.clienti = clienti;
        this.dipendenti = dipendenti;
        chiamate = new ArrayList<Chiamata>();
    }
    
    public void addChiamata(int codiceCliente, int codiceDipendente){
        Chiamata chiamata = new Chiamata(codiceCliente, codiceDipendente);
        chiamate.add(chiamata);
    }
    
    public void addChiamata(Cliente cliente, Dipendente dipendente) throws Exception{
        Chiamata chiamata = new Chiamata(clienti.getKey(cliente), dipendenti.getKey(dipendente));
    }
    
    public Chiamata getChiamata(int codiceCliente, int codiceDipendente, GregorianCalendar gc) throws Exception{
        for(Chiamata chiamata:chiamate){
            if(chiamata.codiceCliente == codiceCliente && chiamata.codiceDipendente == codiceDipendente && chiamata.gc == gc)
                return chiamata;
        }
        throw new Exception("chiamata non trovata");
    }
    
    public ArrayList<Chiamata> getChiamateCliente_Dipendente(int codiceCliente, int codiceDipendente){
        ArrayList<Chiamata> ch;
        ch = new ArrayList<Chiamata>();
        for(Chiamata chiamata:this.chiamate)
            if(chiamata.codiceCliente == codiceCliente && chiamata.codiceDipendente == codiceDipendente)
                ch.add(chiamata);
        return ch;
    }
    
    public ArrayList<Chiamata> getChiamateCliente(int codiceCliente){
        ArrayList<Chiamata> ch;
        ch = new ArrayList<Chiamata>();
        for(Chiamata chiamata:this.chiamate)
            if(chiamata.codiceCliente == codiceCliente)
                ch.add(chiamata);
        return ch;
    }
    
    public ArrayList<Chiamata> getChiamateDipendente(int codiceDipendente){
        ArrayList<Chiamata> ch;
        ch = new ArrayList<Chiamata>();
        for(Chiamata chiamata:this.chiamate)
            if(chiamata.codiceDipendente == codiceDipendente)
                ch.add(chiamata);
        return ch;
    }
}

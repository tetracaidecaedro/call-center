/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package call.center;

import java.util.HashMap;

/**
 *
 * @author 72065690
 */
public class Dipendenti {
    protected HashMap<Integer,Dipendente> dipendenti;
    
    public Dipendenti(){
        dipendenti = new HashMap<Integer,Dipendente>();
    }
    
    public void add(Dipendente d, int key){
        dipendenti.put(key, d);
    }
    
    public int getKey(Dipendente cliente) throws Exception{
        for(Object o : dipendenti.keySet()){
            if(dipendenti.get(o).equals(cliente))
                return (int)o;
        }
        throw new Exception("dipendente non trovato nelle chiavi");
    }
    
    public Dipendente search(int key) throws Exception{
        if(dipendenti.containsKey(key))
            return dipendenti.get(key);
        throw new Exception("Dipendente non trovato");
    }
}

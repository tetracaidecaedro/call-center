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
public class Clienti {
    protected HashMap<Integer,Cliente> clienti;
    
    public Clienti(){
        clienti = new HashMap<Integer,Cliente>();
    }
    
    public void add(Cliente d, int key){
        clienti.put(key, d);
    }
    
    public int getKey(Cliente cliente) throws Exception{
        for(Object o : clienti.keySet()){
            if(clienti.get(o).equals(cliente))
                return (int)o;
        }
        throw new Exception("cliente non trovato nelle chiavi");
    }
    
    public Cliente  search(int key) throws Exception{
        if(clienti.containsKey(key))
            return clienti.get(key);
        throw new Exception("Cliente non trovato");
    }

}

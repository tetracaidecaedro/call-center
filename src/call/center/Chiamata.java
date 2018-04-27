/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package call.center;

import java.util.GregorianCalendar;

/**
 *
 * @author 72065690
 */
public class Chiamata {
    protected int codiceCliente;
    protected int codiceDipendente;
    protected GregorianCalendar gc;
    
    public Chiamata(int c, int d){
        codiceCliente = c;
        codiceDipendente = d;
        gc = new GregorianCalendar();
    }
    
}

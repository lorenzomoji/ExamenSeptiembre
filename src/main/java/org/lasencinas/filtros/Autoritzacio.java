
package org.lasencinas.filtros;

import org.lasencinas.interfaces.Filtro;

public class Autoritzacio implements Filtro {
    
    public Autoritzacio() {
        
    }
    
    public void execucio(String peticio) {
        System.out.print("Autorizacion OK para " + peticio + "\n");
    }
    
}

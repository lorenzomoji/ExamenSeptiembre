
package org.lasencinas.filtros;

import org.lasencinas.interfaces.Filtro;

public class Autenticacio implements Filtro {
    
    public Autenticacio() {
        
    }
    
    public void execucio(String peticio) {
        System.out.print("Autenticacion OK para " + peticio + "\n");
    }
    
}

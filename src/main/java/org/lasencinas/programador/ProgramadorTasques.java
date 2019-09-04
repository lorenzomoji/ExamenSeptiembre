
package org.lasencinas.programador;

import org.lasencinas.filtros.Autenticacio;
import org.lasencinas.filtros.Autoritzacio;
import org.lasencinas.interfaces.Filtro;
import org.lasencinas.interfaces.Target;
import org.lasencinas.tasques.Tasques;

public class ProgramadorTasques {
 
    private Tasques tasca = null;
    Autenticacio autenticacio = new Autenticacio();
    Autoritzacio autoritzacio = new Autoritzacio();
    
    public ProgramadorTasques(Target target) {
        
    }
 
    public Tasques getTasca() {
        return tasca;
    }

    public void setTasca(Filtro filtro) {
        this.tasca = tasca;
    }
    
    public void executarTasques(String tasca) {
        autenticacio.execucio(tasca);
        autoritzacio.execucio(tasca);
    }
    
}

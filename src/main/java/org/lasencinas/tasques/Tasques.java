
package org.lasencinas.tasques;

import java.util.ArrayList;
import java.util.List;
import org.lasencinas.interfaces.Filtro;
import org.lasencinas.interfaces.Target;

public class Tasques {
    
    private Target target = null;
    private List<Filtro> tasques = new ArrayList<>();
    
    public Tasques() {
        
    }

    public List<Filtro> getTasques() {
        return tasques;
    }

    public void setTasques(List<Filtro> tasques) {
        this.tasques = tasques;
    }
    
    
    public void afegirTasca(Filtro filtro) {
        
    }
    
    public void execucio() {
        
    }

    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }
    
}

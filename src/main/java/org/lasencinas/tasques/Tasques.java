
package org.lasencinas.tasques;

import java.util.ArrayList;
import java.util.List;
import org.lasencinas.filtros.Autenticacio;
import org.lasencinas.filtros.Autoritzacio;
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
        this.tasques.add(filtro);
    }
    
    public void execucio() {
        for(int i = 0; i < tasques.size() - 1; i++) {
            System.out.println("Tasca " + i + 1 + tasques.get(i));
        }
    }

    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }
    
}

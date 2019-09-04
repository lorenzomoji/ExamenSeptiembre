
package org.lasencinas.mollapp;

import org.lasencinas.interfaces.Cliente;
import org.lasencinas.programador.ProgramadorTasques;

public class Mollapp implements Cliente {

    public void setProgramadorTasques(ProgramadorTasques programador) {
        
    }

    public void enviarPeticio(String peticio) {
        System.out.println("Puerta abierta " + peticio);
    }
    
}


package org.lasencinas.interfaces;

import org.lasencinas.programador.ProgramadorTasques;


public interface Cliente {
    
    void setProgramadorTasques(ProgramadorTasques programador);
    
    void enviarPeticio(String peticio);
    
}

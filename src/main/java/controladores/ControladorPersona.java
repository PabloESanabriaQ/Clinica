package controladores;

import java.util.List;
import logica.Persona;
import servicios.ControladorPersistencia;

public class ControladorPersona {
    //DIferencia entre controlador y servicio:
    //Controlador: acá sanitizas la info que te mandan y la mandas al servicio
    //Servicio: recibe esa info y consulta con la base de datos
    ControladorPersistencia ctrlPersistencia = new ControladorPersistencia();

    public List<Persona> getPersonas() {
        return ctrlPersistencia.getPacientes();
    }
    
    public Persona getPersona(int id) {
        return ctrlPersistencia.getPersona(id);
    }

    public List<Persona> getHistoriaClinica(int dniPaciente) {
        return ctrlPersistencia.getHistoriaClinica(dniPaciente);
    }

    public void guardar(Persona paciente) {
        //Falta sanitizar los datos
        ctrlPersistencia.guardarPersona(paciente);
    }

    public Persona getPersonaPorDni(int dni) {
        return ctrlPersistencia.getPersonaPorDni(dni);
    }

    public void setPersona(Persona persona) throws Exception {
        ctrlPersistencia.editarPersona(persona);
    }
}

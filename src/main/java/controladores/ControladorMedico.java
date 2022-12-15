package controladores;

import java.util.List;
import logica.Medico;
import servicios.ControladorPersistencia;

public class ControladorMedico {

    ControladorPersistencia ctrlPersistencia = new ControladorPersistencia();

    public List<Medico> getMedicos() {
        return ctrlPersistencia.getMedicos();
    }

    public Medico getMedico(int idMedico) {
        return ctrlPersistencia.getMedico(idMedico);
    }

    public void guardar(Medico medicoNuevo) {
        //Falta sanitizar los datos
        ctrlPersistencia.guardarMedico(medicoNuevo);
    }
    
    public List<String> getEspecialidades(){
        return ctrlPersistencia.getEspecialidades();
    }

    public void setMedico(Medico medico) throws Exception {
        ctrlPersistencia.editarMedico(medico);
    }
}

package controladores;

import java.util.List;
import logica.Consulta;
import servicios.ControladorPersistencia;

public class ControladorConsulta {
    
    ControladorPersistencia ctrlPersistencia = new ControladorPersistencia();

    public void guardar(Consulta consulta) {
        //Falta sanitizar los datos
        ctrlPersistencia.guardarConsulta(consulta);
    }
    
    public List<Consulta> getConsultas(){
        return ctrlPersistencia.getConsultas();
    }

    public void setDiagnostico(Consulta consultaActual) {
        ctrlPersistencia.setDiagnostico(consultaActual);
    }
}

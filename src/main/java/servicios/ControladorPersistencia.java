package servicios;

import java.util.List;
import logica.Consulta;
import logica.Medico;
import logica.Persona;
import logica.Usuario;

public class ControladorPersistencia {
    
    UsuarioJpaController usuarioJpa = new UsuarioJpaController();
    ConsultaJpaController consultaJpa = new ConsultaJpaController();
    PersonaJpaController personaJpa = new PersonaJpaController();
    MedicoJpaController medicoJpa = new MedicoJpaController();

    public void guardarUsuario(Usuario usuario) {        
        usuarioJpa.create(usuario);
    }

    public List<Persona> getPacientes() {
        //Esto los trae a todos, debería filtrar por consulta a este médico:
        return personaJpa.findPersonaEntities();
    }
    
    public List<Persona> getHistoriaClinica(int dniPaciente) {
        //Esto los trae a todos, debo de un solo paciente:
        return personaJpa.findPersonaEntities();
    }

    public void setDiagnostico(Consulta consulta) throws Exception {
        consultaJpa.edit(consulta);
    }
    
    public Persona getPersona(int dni) {
        return personaJpa.findPersona(dni);
    }

    public void guardarPersona(Persona paciente) {
        personaJpa.create(paciente);
    }

    public void guardarMedico(Medico medico) {
        medicoJpa.create(medico);
    }

    public List<Medico> getMedicos() {
        return medicoJpa.findMedicoEntities();
    }

    public Medico getMedico(int idMedico) {
        return medicoJpa.findMedico(idMedico);
    }

    public void guardarConsulta(Consulta consulta) {
        consultaJpa.create(consulta);
    }

    public Persona getPersonaPorDni(int dni) {
        return personaJpa.findPersonaPorDni(dni);
    }

    public List<String> getEspecialidades() {
        return medicoJpa.findEspecialidades();
    }
    
    public void editarPersona(Persona persona) throws Exception{
        personaJpa.edit(persona);
    }
    
    public void editarMedico(Medico medico) throws Exception{
        medicoJpa.edit(medico);
    }
    
    public Usuario getUsuarioPorNombre(String nombreUsuario){
        return usuarioJpa.findUsuario(nombreUsuario);
    }

    public List<Consulta> getConsultas() {
        return consultaJpa.findConsultaEntities();
    }
    

}

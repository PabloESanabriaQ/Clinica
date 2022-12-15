package logica;

import java.util.LinkedList;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Medico extends Persona{
    
    private String matricula;
    
    private String especialidad;
    
    //Mapped by: el nombre del atributo en la otra clase    
    @OneToMany(mappedBy="medico")
    private LinkedList<Consulta> consultasRecibidas;
    
    public Medico(){
        
    }

    public Medico(String matricula, String especialidad, LinkedList<Consulta> consultasRecibidas) {
        this.matricula = matricula;
        this.especialidad = especialidad;
        this.consultasRecibidas = consultasRecibidas;
    }

    public Medico(String matricula, String especialidad, LinkedList<Consulta> consultasRecibidas, 
            int id, int dni, String nombre, String apellido, String fechaNacimiento, 
            String direccion, String numeroTelefono, String correo, LinkedList consultasHechas) {
        super(id, dni, nombre, apellido, fechaNacimiento, direccion, numeroTelefono, correo, consultasHechas);
        this.matricula = matricula;
        this.especialidad = especialidad;
        this.consultasRecibidas = consultasRecibidas;
    }
        

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public LinkedList<Consulta> getConsultasRecibidas() {
        return consultasRecibidas;
    }

    public void setConsultasRecibidas(LinkedList<Consulta> consultasRecibidas) {
        this.consultasRecibidas = consultasRecibidas;
    }    
    

    @Override
    public String toString() {
        return "Medico{" + "matricula=" + matricula + '}' + super.toString();
    }
    
}
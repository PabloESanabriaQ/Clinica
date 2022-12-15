package logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Consulta implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    
    private String diaConsulta;
    private String horarioConsulta;
    
    @ManyToOne
    private Persona paciente;
    
    @ManyToOne
    private Medico medico;
    
    private String diagnostico;
    private String receta;

    public Consulta() {
    }

    public Consulta(int id, Persona paciente, String diaConsulta, String horarioConsulta, Medico medico, String diagnostico, String receta) {
        this.id = id;
        this.paciente = paciente;
        this.diaConsulta = diaConsulta;
        this.horarioConsulta = horarioConsulta;
        this.medico = medico;
        this.diagnostico = diagnostico;
        this.receta = receta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Persona getPaciente() {
        return paciente;
    }

    public void setPaciente(Persona paciente) {
        this.paciente = paciente;
    }
    
    

    public String getDiaConsulta() {
        return diaConsulta;
    }

    public void setDiaConsulta(String diaConsulta) {
        this.diaConsulta = diaConsulta;
    }

    public String getHorarioConsulta() {
        return horarioConsulta;
    }

    public void setHorarioConsulta(String horarioConsulta) {
        this.horarioConsulta = horarioConsulta;
    }

    
    
    

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getReceta() {
        return receta;
    }

    public void setReceta(String receta) {
        this.receta = receta;
    }

    @Override
    public String toString() {
        return "Consulta{" + "diaConsulta=" + diaConsulta + ", horarioConsulta=" + horarioConsulta + ", medico=" + medico + ", diagnostico=" + diagnostico + ", receta=" + receta + '}';
    }

}

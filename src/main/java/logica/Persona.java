package logica; 

import java.io.Serializable;
import java.util.LinkedList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Persona implements Serializable {
    //Datos personales:
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    protected int id;
    //Datos de la persona:
    protected int dni;    
    protected String nombre;
    protected String apellido;
    protected String fechaNacimiento;
    //Datos de contacto:
    protected String direccion;
    protected String numeroTelefono;
    protected String correo;    
    
    @OneToMany(mappedBy="paciente")
    protected LinkedList<Consulta> consultasHechas;

    public Persona(){
        
    }
    
    public Persona(int id, int dni, String nombre, String apellido, 
            String fechaNacimiento, String direccion, 
            String numeroTelefono, String correo, LinkedList consultasHechas) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.numeroTelefono = numeroTelefono;
        this.correo = correo;
        this.consultasHechas = consultasHechas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public LinkedList<Consulta> getConsultasHechas() {
        return consultasHechas;
    }

    public void setConsultasHechas(LinkedList<Consulta> consultasHechas) {
        this.consultasHechas = consultasHechas;
    }
    
    

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento + ", direccion=" + direccion + ", numeroTelefono=" + numeroTelefono + ", correo=" + correo + '}';
    }

}

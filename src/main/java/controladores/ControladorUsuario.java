package controladores;

import logica.Usuario;
import servicios.ControladorPersistencia;

public class ControladorUsuario {
    
    ControladorPersistencia ctrlPersistencia = new ControladorPersistencia();
      
    public void guardar(Usuario usuario){
        //Primero debo sanitizar los datos
        
        ctrlPersistencia.guardarUsuario(usuario);
    }
    
    public Usuario buscarUsuario(String nombreUsuario){
        return ctrlPersistencia.getUsuarioPorNombre(nombreUsuario);
    }
}

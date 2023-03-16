package pe.idat.edu.Services;

import java.util.List;
import java.util.Optional;
import pe.idat.edu.Entity.EmpleadoEntity;


public interface EmpleadoService {
    
    //funcion que te permita mostrar todos los datos    
    List<EmpleadoEntity> findAll();
    
    //funcion para mostrar todods los datos habilitados
    List<EmpleadoEntity> findAllCustom();
    
    //funcion para buscar por codigo
    Optional<EmpleadoEntity> findById(Long id);
    
    //funcion para registrar datos
    EmpleadoEntity add(EmpleadoEntity e);
    
    //funcion para actualizar datos
    EmpleadoEntity update(EmpleadoEntity e);
    
    //funcion para eliminar datos
    EmpleadoEntity delete(EmpleadoEntity e);
    
}

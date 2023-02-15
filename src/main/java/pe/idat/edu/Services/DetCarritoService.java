package pe.idat.edu.Services;

import java.util.List;
import java.util.Optional;
import pe.idat.edu.Entity.DetCarritoEntity;

public interface DetCarritoService {
    //funcion que te permita mostrar todos los datos    
    List<DetCarritoEntity> findAll();
    
    //funcion para mostrar todods los datos habilitados
    List<DetCarritoEntity> findAllCustom();
    
    //funcion para buscar por codigo
    Optional<DetCarritoEntity> findById(Long id);
    
    //funcion para registrar datos
    DetCarritoEntity add(DetCarritoEntity detcar);
    
    //funcion para actualizar datos
    DetCarritoEntity update(DetCarritoEntity detcar);
    
    //funcion para eliminar datos
    //DetCarritoEntity delete(DetCarritoEntity detcar);
}

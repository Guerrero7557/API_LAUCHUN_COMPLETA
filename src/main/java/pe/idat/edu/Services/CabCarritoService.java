package pe.idat.edu.Services;

import java.util.List;
import java.util.Optional;
import pe.idat.edu.Entity.CabCarritoEntity;

public interface CabCarritoService {
    //funcion que te permita mostrar todos los datos    
    List<CabCarritoEntity> findAll();
    
    //funcion para mostrar todods los datos habilitados
    List<CabCarritoEntity> findAllCustom();
    
    //funcion para buscar por codigo
    Optional<CabCarritoEntity> findById(Long id);
    
    //funcion para registrar datos
    CabCarritoEntity add(CabCarritoEntity c);
    
    //funcion para actualizar datos
    CabCarritoEntity update(CabCarritoEntity c);
    
    //funcion para eliminar datos
    CabCarritoEntity delete(CabCarritoEntity c);
}

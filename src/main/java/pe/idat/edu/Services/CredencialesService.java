package pe.idat.edu.Services;

import java.util.List;
import java.util.Optional;
import pe.idat.edu.Entity.CredencialesEntity;


public interface CredencialesService {
    //funcion que te permita mostrar todos los datos    
    List<CredencialesEntity> findAll();
    
    //funcion para mostrar todods los datos habilitados
    List<CredencialesEntity> findAllCustom();
    
    //funcion para buscar por codigo
    Optional<CredencialesEntity> findById(Long id);
    
    //funcion para registrar datos
    CredencialesEntity add(CredencialesEntity cre);
    
    //funcion para actualizar datos
    CredencialesEntity update(CredencialesEntity cre);
    
    //funcion para eliminar datos
    CredencialesEntity delete(CredencialesEntity cre);
}

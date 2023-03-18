package pe.idat.edu.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.idat.edu.Entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>{
    @Query("select c from UsuarioEntity c where c.estado=true")
    List<UsuarioEntity>findAllCustom();
}

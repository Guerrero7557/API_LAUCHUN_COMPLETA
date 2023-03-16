package pe.idat.edu.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.idat.edu.Entity.CredencialesEntity;

public interface CredencialesRepository extends JpaRepository<CredencialesEntity, Long>{
    @Query("select cre from CredencialesEntity cre")
    List<CredencialesEntity>findAllCustom();
}


package pe.idat.edu.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.idat.edu.Entity.CabCarritoEntity;

public interface CabCarritoRepository extends JpaRepository<CabCarritoEntity, Long>{
    @Query("select cabcar from CabCarritoEntity cabcar where cabcar.estado=true")
    List<CabCarritoEntity>findAllCustom();
}

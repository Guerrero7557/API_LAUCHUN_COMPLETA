/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.idat.edu.Repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.idat.edu.Entity.CompraEntity;
/**
 *
 * @author flores
 */
public interface CompraRepository extends JpaRepository<CompraEntity, Long>{
     @Query("select co from CompraEntity co where co.estado = 'Disponible'")
    List<CompraEntity>findAllCustom();  
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.idat.edu.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.idat.edu.Entity.VentaEntity;

/**
 *
 * @author flores
 */
public interface VentaRepository extends JpaRepository<VentaEntity, Long> {
    @Query("select v from VentaEntity v where v.estado = 'Disponible'")
    List<VentaEntity>findAllCustom();
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.idat.edu.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.idat.edu.Entity.DetCarritoEntity;

public interface DetCarritoRepository extends JpaRepository<DetCarritoEntity, Long>{
    @Query("select detcar from DetCarritoEntity detcar")
    List<DetCarritoEntity>findAllCustom();
}
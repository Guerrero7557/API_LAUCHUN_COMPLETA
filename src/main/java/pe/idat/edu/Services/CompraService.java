/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.idat.edu.Services;

import java.util.List;
import java.util.Optional;
import pe.idat.edu.Entity.CompraEntity;

/**
 *
 * @author flores
 */
public interface CompraService {
    ///funcion que te permita mostrar todos los datos    
    List<CompraEntity> findAll();
    
    ///funcion para mostrar todods los datos habilitados
    List<CompraEntity> findAllCustom();
    
    ///funcion para buscar por codigo
    Optional<CompraEntity> findById(Long id);
    
    ///funcion para registrar datos
   CompraEntity add(CompraEntity co);
    
    ///funcion para actualizar datos
    CompraEntity update(CompraEntity co);
    
    ///funcion para eliminar datos
    CompraEntity delete(CompraEntity co);
    
}

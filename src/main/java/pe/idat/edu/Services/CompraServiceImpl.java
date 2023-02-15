/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.idat.edu.Services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import pe.idat.edu.Entity.CompraEntity;
import pe.idat.edu.Repository.CompraRepository;

/**
 *
 * @author flores
 */
public class CompraServiceImpl implements CompraService {

     @Autowired
    private CompraRepository compraRepository;
     
    @Override
    public List<CompraEntity> findAll() {
       return compraRepository.findAll();
    }
           

    @Override
    public List<CompraEntity> findAllCustom() {
    return compraRepository.findAllCustom();
     }

    @Override
    public Optional<CompraEntity> findById(Long id) {
    return compraRepository.findById(id);
    }

    @Override
    public CompraEntity add(CompraEntity co) {
        return compraRepository.save(co);
    }

    @Override
    public CompraEntity update(CompraEntity co) {
        CompraEntity objcompra = compraRepository.getById(co.getIdcompra());
        BeanUtils.copyProperties(co, objcompra);
        return compraRepository.save(objcompra);  
    }

    @Override
    public CompraEntity delete(CompraEntity co) {
      CompraEntity  objcompra = compraRepository.getById(co.getIdcompra());
        objcompra.setEstado(false);
        return compraRepository.save(objcompra);
    }
}

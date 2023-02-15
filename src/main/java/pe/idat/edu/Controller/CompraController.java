/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.idat.edu.Controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.idat.edu.Entity.CompraEntity;
import pe.idat.edu.Services.CompraService;

/**
 *
 * @author flores
 */
@RestController
@RequestMapping("/compra")
public class CompraController {
    @Autowired
    private CompraService compraRepository;
    
    @GetMapping
    public List<CompraEntity> findAll(){
        return compraRepository.findAll();
    }
    
    @GetMapping("/custom")
    public List<CompraEntity>findAllCustom(){
        return compraRepository.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<CompraEntity> findById(@PathVariable Long id){
        return compraRepository.findById(id);
    }
    
    @PostMapping
    public CompraEntity add (@RequestBody CompraEntity co){
        return compraRepository.add(co);
    }
    
    @PutMapping("{id}")
    public CompraEntity update(@PathVariable long id, @RequestBody CompraEntity co){
        co.setIdcompra(id);
        return compraRepository.update(co);
    }
    
    @DeleteMapping("/{id}")
    public CompraEntity delete(@PathVariable long id){
        CompraEntity objcompra = new CompraEntity();
        objcompra.setEstado(false);
        return compraRepository.delete(CompraEntity.builder().idcompra(id).build());
    }
    
}

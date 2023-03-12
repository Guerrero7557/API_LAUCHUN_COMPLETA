package pe.idat.edu.Controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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

@RestController
@RequestMapping("/compra")
@CrossOrigin(origins= {"http://localhost/4200"})
public class CompraController {
    
    @Autowired
    private CompraService ComSer;
    
    @GetMapping
    public List<CompraEntity>findAll(){
        return ComSer.findAll();
    }
    
    @GetMapping("/custom")
    public List<CompraEntity>findAllCustom(){
        return ComSer.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<CompraEntity>findById(@PathVariable Long id ){
        return ComSer.findById(id);
    }
    
    @PostMapping
    public CompraEntity add(@RequestBody CompraEntity co){
        return ComSer.add(co);
    }
    
    @PutMapping("/{id}")
    public CompraEntity update(@PathVariable long id, @RequestBody CompraEntity co){
        co.setIdcompra(id);
        return ComSer.update(co);
    }
    
    @DeleteMapping("/{id}")
    public CompraEntity delete(@PathVariable long id){
        CompraEntity objcompra = new CompraEntity();
        objcompra.setEstado(false);
        return ComSer.delete(CompraEntity.builder().idcompra(id).build());
    }
}
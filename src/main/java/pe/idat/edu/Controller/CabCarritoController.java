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
import pe.idat.edu.Entity.CabCarritoEntity;
import pe.idat.edu.Services.CabCarritoService;


@RestController
@RequestMapping("/cabcarrito")
public class CabCarritoController {
    
    @Autowired
    private CabCarritoService CabCarServ;
    
    @GetMapping
    public List<CabCarritoEntity>findAll(){
        return CabCarServ.findAll();
    }
    
    @GetMapping("/custom")
    public List<CabCarritoEntity>findAllCustom(){
        return CabCarServ.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<CabCarritoEntity>findById(@PathVariable Long id ){
        return CabCarServ.findById(id);
    }
    
    @PostMapping
    public CabCarritoEntity add(@RequestBody CabCarritoEntity c){
        return CabCarServ.add(c);
    }
    
    @PutMapping("/{id}")
    public CabCarritoEntity update(@PathVariable long id, @RequestBody CabCarritoEntity c){
        c.setIdcabcarrito(id);
        return CabCarServ.update(c);
    }
    
    @DeleteMapping("/{id}")
    public CabCarritoEntity delete(@PathVariable long id){
        CabCarritoEntity objcabcarrito = new CabCarritoEntity();
        objcabcarrito.setEstado(false);
        return CabCarServ.delete(CabCarritoEntity.builder().idcabcarrito(id).build());
    }
}

package pe.idat.edu.Controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.idat.edu.Entity.DetCarritoEntity;
import pe.idat.edu.Services.DetCarritoService;

@RestController
@RequestMapping("/detcarrito")
public class DetCarritoController {
    
    @Autowired
    private DetCarritoService DetCarServ;
    
    @GetMapping
    public List<DetCarritoEntity>findAll(){
        return DetCarServ.findAll();
    }
    
    @GetMapping("/custom")
    public List<DetCarritoEntity>findAllCustom(){
        return DetCarServ.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<DetCarritoEntity>findById(@PathVariable Long id ){
        return DetCarServ.findById(id);
    }
    
    @PostMapping
    public DetCarritoEntity add(@RequestBody DetCarritoEntity detcar){
        return DetCarServ.add(detcar);
    }
    
    @PutMapping("/{id}")
    public DetCarritoEntity update(@PathVariable long id, @RequestBody DetCarritoEntity detcar){
        detcar.setIddetcarrito(id);
        return DetCarServ.update(detcar);
    }
    /*
    @DeleteMapping("/{id}")
    public DetCarritoEntity delete(@PathVariable long id){
        DetCarritoEntity objcabcarrito = new DetCarritoEntity();
        objcabcarrito.setEstado(false);
        return DetCarServ.delete(DetCarritoEntity.builder().idcabcarrito(id).build());
    }*/
}

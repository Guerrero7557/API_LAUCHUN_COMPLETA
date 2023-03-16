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
import pe.idat.edu.Entity.CredencialesEntity;
import pe.idat.edu.Services.CredencialesService;

@RestController
@RequestMapping("/credenciales")
@CrossOrigin(origins= {"http://localhost/4200"})
public class CredencialesController {
    
    @Autowired
    private CredencialesService CreSer;
    
    @GetMapping
    public List<CredencialesEntity>findAll(){
        return CreSer.findAll();
    }
    
    @GetMapping("/custom")
    public List<CredencialesEntity>findAllCustom(){
        return CreSer.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<CredencialesEntity>findById(@PathVariable Long id ){
        return CreSer.findById(id);
    }
    
    @PostMapping
    public CredencialesEntity add(@RequestBody CredencialesEntity cre){
        return CreSer.add(cre);
    }
    
    @PutMapping("/{id}")
    public CredencialesEntity update(@PathVariable long id, @RequestBody CredencialesEntity cre){
        cre.setIdcredenciales(id);
        return CreSer.update(cre);
    }
    /*
    @DeleteMapping("/{id}")
    public CredencialesEntity delete(@PathVariable long id){
        CredencialesEntity objcredenciales = new CredencialesEntity();
        objcredenciales.setEstado(false);
        return CreSer.delete(CredencialesEntity.builder().idcredenciales(id).build());
    }*/
}

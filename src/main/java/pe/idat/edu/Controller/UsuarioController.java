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
import pe.idat.edu.Entity.UsuarioEntity;
import pe.idat.edu.Services.UsuarioService;

@RestController
@RequestMapping("usuario")
@CrossOrigin(origins= {"http://localhost/4200"})
public class UsuarioController {
    
    @Autowired
    private UsuarioService CliSer;
    
    @GetMapping
    public List<UsuarioEntity>findAll(){
        return CliSer.findAll();
    }
    
    @GetMapping("/custom")
    public List<UsuarioEntity>findAllCustom(){
        return CliSer.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<UsuarioEntity>findById(@PathVariable Long id ){
        return CliSer.findById(id);
    }
    
    @PostMapping
    public UsuarioEntity add(@RequestBody UsuarioEntity c){
        return CliSer.add(c);
    }
    
    @PutMapping("/{id}")
    public UsuarioEntity update(@PathVariable long id, @RequestBody UsuarioEntity c){
        c.setIdusuario(id);
        return CliSer.update(c);
    }
    
    @DeleteMapping("/{id}")
    public UsuarioEntity delete(@PathVariable long id){
        UsuarioEntity objcliente = new UsuarioEntity();
        objcliente.setEstado(false);
        return CliSer.delete(UsuarioEntity.builder().idusuario(id).build());
    }
}
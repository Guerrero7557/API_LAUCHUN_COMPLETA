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
import pe.idat.edu.Entity.ClienteEntity;
import pe.idat.edu.Services.ClienteService;

@RestController
@RequestMapping("/cliente")
@CrossOrigin(origins= {"http://localhost/4200"})
public class ClienteController {
    
    @Autowired
    private ClienteService CliSer;
    
    @GetMapping
    public List<ClienteEntity>findAll(){
        return CliSer.findAll();
    }
    
    @GetMapping("/custom")
    public List<ClienteEntity>findAllCustom(){
        return CliSer.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<ClienteEntity>findById(@PathVariable Long id ){
        return CliSer.findById(id);
    }
    
    @PostMapping
    public ClienteEntity add(@RequestBody ClienteEntity c){
        return CliSer.add(c);
    }
    
    @PutMapping("/{id}")
    public ClienteEntity update(@PathVariable long id, @RequestBody ClienteEntity c){
        c.setIdcliente(id);
        return CliSer.update(c);
    }
    
    @DeleteMapping("/{id}")
    public ClienteEntity delete(@PathVariable long id){
        ClienteEntity objcliente = new ClienteEntity();
        objcliente.setEstado(false);
        return CliSer.delete(ClienteEntity.builder().idcliente(id).build());
    }
}
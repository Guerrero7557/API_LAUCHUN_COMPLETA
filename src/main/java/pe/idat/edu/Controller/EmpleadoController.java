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
import pe.idat.edu.Entity.EmpleadoEntity;
import pe.idat.edu.Services.EmpleadoService;

@RestController
@RequestMapping("/empleado")
@CrossOrigin(origins= {"http://localhost/4200"})
public class EmpleadoController {
    
    @Autowired
    private EmpleadoService EmpSer;
    
    @GetMapping
    public List<EmpleadoEntity>findAll(){
        return EmpSer.findAll();
    }
    
    @GetMapping("/custom")
    public List<EmpleadoEntity>findAllCustom(){
        return EmpSer.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<EmpleadoEntity>findById(@PathVariable Long id ){
        return EmpSer.findById(id);
    }
    
    @PostMapping
    public EmpleadoEntity add(@RequestBody EmpleadoEntity e){
        return EmpSer.add(e);
    }
    
    @PutMapping("/{id}")
    public EmpleadoEntity update(@PathVariable long id, @RequestBody EmpleadoEntity e){
        e.setIdempleado(id);
        return EmpSer.update(e);
    }
    
    @DeleteMapping("/{id}")
    public EmpleadoEntity delete(@PathVariable long id){
        EmpleadoEntity objempleado = new EmpleadoEntity();
        objempleado.setEstado(false);
        return EmpSer.delete(EmpleadoEntity.builder().idempleado(id).build());
    }
    
}

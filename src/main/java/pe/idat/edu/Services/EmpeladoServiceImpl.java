package pe.idat.edu.Services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.idat.edu.Entity.EmpleadoEntity;
import pe.idat.edu.Repository.EmpleadoRepository;

@Service
public class EmpeladoServiceImpl implements EmpleadoService{

    @Autowired
    private EmpleadoRepository EmpRep;

    @Override
    public List<EmpleadoEntity> findAll() {
        return EmpRep.findAll();
    }

    @Override
    public List<EmpleadoEntity> findAllCustom() {
        return EmpRep.findAllCustom();
    }

    @Override
    public Optional<EmpleadoEntity> findById(Long id) {
        return EmpRep.findById(id);
    }

    @Override
    public EmpleadoEntity add(EmpleadoEntity e) {
        return EmpRep.save(e);
    }

    @Override
    public EmpleadoEntity update(EmpleadoEntity e) {
        EmpleadoEntity objempleado = EmpRep.getById(e.getIdempleado());
        BeanUtils.copyProperties(e, objempleado);
        return EmpRep.save(objempleado);
    }

    @Override
    public EmpleadoEntity delete(EmpleadoEntity e) {
        EmpleadoEntity objempleado = EmpRep.getById(e.getIdempleado());
        objempleado.setEstado(false);
        return EmpRep.save(objempleado);
    }
}
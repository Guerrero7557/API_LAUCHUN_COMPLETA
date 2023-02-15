package pe.idat.edu.Services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.idat.edu.Entity.DetCarritoEntity;
import pe.idat.edu.Repository.DetCarritoRepository;

@Service
public class DetCarritoServiceImpl implements DetCarritoService{

    @Autowired
    private DetCarritoRepository detCarrito;

    @Override
    public List<DetCarritoEntity> findAll() {
        return detCarrito.findAll();
    }

    @Override
    public List<DetCarritoEntity> findAllCustom() {
        return detCarrito.findAllCustom();
    }

    @Override
    public Optional<DetCarritoEntity> findById(Long id) {
        return detCarrito.findById(id);
    }

    @Override
    public DetCarritoEntity add(DetCarritoEntity detcar) {
        return detCarrito.save(detcar);
    }

    @Override
    public DetCarritoEntity update(DetCarritoEntity detcar) {
        DetCarritoEntity objdetcarrito = detCarrito.getById(detcar.getIddetcarrito());
        BeanUtils.copyProperties(detcar, objdetcarrito);
        return detCarrito.save(objdetcarrito);
    }
    
    /*
    @Override
    public DetCarritoEntity delete(DetCarritoEntity detcar) {
        DetCarritoEntity objdetcarrito = detCarrito.getById(detcar.getIddetcarrito());
        objdetcarrito.setEstado(false);
        return detCarrito.save(objdetcarrito);
    }*/
}

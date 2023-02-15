package pe.idat.edu.Services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.idat.edu.Entity.CabCarritoEntity;
import pe.idat.edu.Repository.CabCarritoRepository;

@Service
public class CabCarritoServiceImpl implements CabCarritoService{

    @Autowired
    private CabCarritoRepository cabCarrito;

    @Override
    public List<CabCarritoEntity> findAll() {
        return cabCarrito.findAll();
    }

    @Override
    public List<CabCarritoEntity> findAllCustom() {
        return cabCarrito.findAllCustom();
    }

    @Override
    public Optional<CabCarritoEntity> findById(Long id) {
        return cabCarrito.findById(id);
    }

    @Override
    public CabCarritoEntity add(CabCarritoEntity c) {
        return cabCarrito.save(c);
    }

    @Override
    public CabCarritoEntity update(CabCarritoEntity c) {
        CabCarritoEntity objcabcarrito = cabCarrito.getById(c.getIdcabcarrito());
        BeanUtils.copyProperties(c, objcabcarrito);
        return cabCarrito.save(objcabcarrito);
    }

    @Override
    public CabCarritoEntity delete(CabCarritoEntity c) {
        CabCarritoEntity objcabcarrito = cabCarrito.getById(c.getIdcabcarrito());
        objcabcarrito.setEstado(false);
        return cabCarrito.save(objcabcarrito);
    }
}


package pe.idat.edu.Services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.idat.edu.Entity.CredencialesEntity;
import pe.idat.edu.Repository.CredencialesRepository;

@Service
public class CredencialesServiceImpl implements CredencialesService{

    @Autowired
    private CredencialesRepository CreRep;

    @Override
    public List<CredencialesEntity> findAll() {
        return CreRep.findAll();
    }

    @Override
    public List<CredencialesEntity> findAllCustom() {
        return CreRep.findAllCustom();
    }

    @Override
    public Optional<CredencialesEntity> findById(Long id) {
        return CreRep.findById(id);
    }

    @Override
    public CredencialesEntity add(CredencialesEntity cre) {
        return CreRep.save(cre);
    }

    @Override
    public CredencialesEntity update(CredencialesEntity cre) {
        CredencialesEntity objcredenciales = CreRep.getById(cre.getIdcredenciales());
        BeanUtils.copyProperties(cre, objcredenciales);
        return CreRep.save(objcredenciales);
    }
    
    
    //ESTO NO TIENE NINGUNA UTILIDAD
    @Override
    public CredencialesEntity delete(CredencialesEntity cre) {
        CredencialesEntity objcredenciales = CreRep.getById(cre.getIdcredenciales());
        return CreRep.save(objcredenciales);
    }

    /*
    @Override
    public CredencialesEntity delete(CredencialesEntity cre) {
        CredencialesEntity objcredenciales = CreRep.getById(cre.getIdcredenciales());
        objcredenciales.setEstado(false);
        return CreRep.save(objcredenciales);
    }*/
}

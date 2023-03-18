package pe.idat.edu.Services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.idat.edu.Entity.UsuarioEntity;
import pe.idat.edu.Repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    private UsuarioRepository CliRep;

    @Override
    public List<UsuarioEntity> findAll() {
        return CliRep.findAll();
    }

    @Override
    public List<UsuarioEntity> findAllCustom() {
        return CliRep.findAllCustom();
    }

    @Override
    public Optional<UsuarioEntity> findById(Long id) {
        return CliRep.findById(id);
    }

    @Override
    public UsuarioEntity add(UsuarioEntity c) {
        return CliRep.save(c);
    }

    @Override
    public UsuarioEntity update(UsuarioEntity c) {
        UsuarioEntity objcliente = CliRep.getById(c.getIdusuario());
        BeanUtils.copyProperties(c, objcliente);
        return CliRep.save(objcliente);
    }

    @Override
    public UsuarioEntity delete(UsuarioEntity c) {
        UsuarioEntity objcliente = CliRep.getById(c.getIdusuario());
        objcliente.setEstado(false);
        return CliRep.save(objcliente);
    }
}

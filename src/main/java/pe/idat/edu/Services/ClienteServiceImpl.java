package pe.idat.edu.Services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.idat.edu.Entity.ClienteEntity;
import pe.idat.edu.Repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository CliRep;

    @Override
    public List<ClienteEntity> findAll() {
        return CliRep.findAll();
    }

    @Override
    public List<ClienteEntity> findAllCustom() {
        return CliRep.findAllCustom();
    }

    @Override
    public Optional<ClienteEntity> findById(Long id) {
        return CliRep.findById(id);
    }

    @Override
    public ClienteEntity add(ClienteEntity c) {
        return CliRep.save(c);
    }

    @Override
    public ClienteEntity update(ClienteEntity c) {
        ClienteEntity objcliente = CliRep.getById(c.getIdcliente());
        BeanUtils.copyProperties(c, objcliente);
        return CliRep.save(objcliente);
    }

    @Override
    public ClienteEntity delete(ClienteEntity c) {
        ClienteEntity objcliente = CliRep.getById(c.getIdcliente());
        objcliente.setEstado(false);
        return CliRep.save(objcliente);
    }
}

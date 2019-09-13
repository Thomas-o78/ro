package fr.smabtp.ro.services.impl;

import fr.smabtp.ro.entities.RefActivite;
import fr.smabtp.ro.repositories.RefActiviteRepository;
import fr.smabtp.ro.services.IGenericRefService;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class RefActiviteService implements IGenericRefService<RefActivite, String> {

    @Inject
    RefActiviteRepository repository;

    @Override
    public List<RefActivite> getAll() {
        return null;
    }

    @Override
    public RefActivite getEntityById(String id) {
        return null;
    }

   /* @Override
    public List<RefActivite> getAll() {
        return  repository.findAllOrderByRacLibLong();
    }

    @Override
    public RefActivite getEntityById(String id) {
        return null;
    }*/
}

package fr.smabtp.ro.services.impl;


import fr.smabtp.ro.entities.RefActeGestion;

import fr.smabtp.ro.repositories.RefActeGestionRepository;
import fr.smabtp.ro.services.IGenericRefService;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class RefActeGestionService implements IGenericRefService<RefActeGestion, String> {


    @Inject
    RefActeGestionRepository repository;

    @Override
    public List<RefActeGestion> getAll() {
        return repository.findAllOrderByRagLibLong();
    }

    @Override
    public RefActeGestion getEntityById(String id) {
        return null;
    }
}

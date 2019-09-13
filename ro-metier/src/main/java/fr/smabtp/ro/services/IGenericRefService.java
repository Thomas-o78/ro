package fr.smabtp.ro.services;

import java.util.List;

public interface IGenericRefService<K, I> {

    List<K> getAll();

    K getEntityById(I id);
}

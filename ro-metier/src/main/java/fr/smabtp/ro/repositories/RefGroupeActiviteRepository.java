package fr.smabtp.ro.repositories;

import fr.smabtp.ro.entities.RefGroupeActivite;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
*
 * Spring Data  repository for the RefGroupeActivite entity.*/



@SuppressWarnings("unused")
@Repository
public interface RefGroupeActiviteRepository extends JpaRepository<RefGroupeActivite, Long> {
   List<RefGroupeActivite> findAllOrOrderByRgaLibLong();
    RefGroupeActivite findByRgaCode(String ragCode);
}

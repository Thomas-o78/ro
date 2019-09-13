package fr.smabtp.ro.repositories;

import fr.smabtp.ro.entities.RefActivite;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Spring Data  repository for the RefActivite entity.
 */

@SuppressWarnings("unused")
@Repository
public interface RefActiviteRepository extends JpaRepository<RefActivite, String> {
/*
    List<RefActivite> findAllOrderByRacLibLong();

    RefActivite findByRacCode(String racCode);*/

}

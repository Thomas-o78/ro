package fr.smabtp.ro.repositories;

import fr.smabtp.ro.entities.RefActeGestion;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Spring Data  repository for the RefActeGestion entity.*/



@SuppressWarnings("unused")
@Repository
public interface RefActeGestionRepository extends JpaRepository<RefActeGestion, Long> {

List<RefActeGestion> findAllOrderByRagLibLong();

    RefActeGestion findByRagCode(String ragCode);
}

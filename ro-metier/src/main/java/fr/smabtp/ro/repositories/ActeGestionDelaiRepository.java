package fr.smabtp.ro.repositories;


        import fr.smabtp.ro.entities.ActeGestionDelai;
        import org.springframework.data.jpa.repository.*;
        import org.springframework.stereotype.Repository;

        import java.util.List;

    /*    *
        * Spring Data  repository for the ActeGestionDelai entity.
*/



@SuppressWarnings("unused")
@Repository
public interface ActeGestionDelaiRepository extends JpaRepository<ActeGestionDelai, Long> {

}

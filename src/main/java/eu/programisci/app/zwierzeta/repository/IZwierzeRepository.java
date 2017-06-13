package eu.programisci.app.zwierzeta.repository;

import eu.programisci.app.zwierzeta.ob.ZwierzeOB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IZwierzeRepository extends JpaRepository<ZwierzeOB,Long> {


}

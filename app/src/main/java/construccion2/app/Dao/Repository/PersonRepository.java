
package construccion2.app.Dao.Repository;

import construccion2.app.Modelo.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{
    public boolean existsByDocument(Long document);
    public boolean findByDocument(Long document);
}

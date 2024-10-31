
package construccion2.app.Dao.Repository;

import construccion2.app.Modelo.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends JpaRepository<Guest, Long>{
    
}

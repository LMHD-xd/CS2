
package construccion2.app.Dao.Repository;

import construccion2.app.Modelo.Partner;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PartnerRepository {
    public Partner findByUserId(Long id);
    public Partner existsByUserId(Long id);
    
    
    /*@Modifying
    @Transactional
    @Query("Update Partner p SET p.money = :money WHERE p.userId.id = :userId")
    void updateMoneyByUserId(@Param("money")Double money, @Param("userId")Long userId);*/
}

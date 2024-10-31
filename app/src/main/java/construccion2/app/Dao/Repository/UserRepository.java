
package construccion2.app.Dao.Repository;

import construccion2.app.Modelo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    public User findByUserName(String userName);
    public boolean existsByUserName(String userName);
    
    
    //innecesario
    /*@Modifying
    @Transactional
    @Query("UPDATE User u SET u.role = :role WHERE u.userName = :userName")
    public void updateUserRole(String role, String userName);*/
}

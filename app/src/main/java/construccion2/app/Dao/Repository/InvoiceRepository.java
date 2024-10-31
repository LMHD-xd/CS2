
package construccion2.app.Dao.Repository;

import construccion2.app.Modelo.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Long>{
    
}

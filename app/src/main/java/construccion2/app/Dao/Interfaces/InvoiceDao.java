
package construccion2.app.Dao.Interfaces;

import construccion2.app.Dto.InvoiceDto;
import construccion2.app.Modelo.Invoice;

public interface InvoiceDao {
    public void createInvoice(Invoice invoice)throws Exception;
    public InvoiceDto existsByInvocieId()throws Exception;
}

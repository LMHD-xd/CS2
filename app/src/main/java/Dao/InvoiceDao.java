
package Dao;

import Dto.InvoiceDto;
import Modelo.Invoice;

public interface InvoiceDao {
    public void createInvoice(Invoice invoice)throws Exception;
    public InvoiceDto existsByInvocieId()throws Exception;
}

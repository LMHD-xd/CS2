
package Controller.Validator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@NoArgsConstructor
public class InvoiceDetailValidator extends CommonsValidator{
    public void validItems(String items)throws Exception{
        super.isValidString("Item de factura: ", items);
    }
    
    public long validId(String Id)throws Exception{
        return super.isValidLong("Id de la persona: ", Id);
    }
}


package construccion2.app.Controller.Validator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@NoArgsConstructor
public class InvoiceValidator extends CommonsValidator{
    public double validAmount(String amount)throws Exception{
        return super.isValidDouble("Monto de facrura: ", amount);
    }
    
    public int validItem(String item)throws Exception{
        return super.isValidInteger("Item de factura: ", item);
    }
    
    public long validId(String Id)throws Exception{
        return super.isValidLong("Id de la perosna: ", Id);
    }
}

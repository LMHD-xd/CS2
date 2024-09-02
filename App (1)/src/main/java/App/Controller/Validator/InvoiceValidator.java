 
package App.Controller.Validator;

import java.util.Date;


public class InvoiceValidator extends CommonsValidator{
    
    public InvoiceValidator(){
        super();
    }
    
    
    public double validAmount (String amount)throws Exception{
        return super.isValidDouble("monto de la factura ", amount);
    }
}

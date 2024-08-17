/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App.Controller.Validator;

/**
 *
 * @author Farley
 */
public class PartnerValidator extends CommonsValidator {
    
    public PartnerValidator (){
        super();
    }
    
    public double validMoney (String money)throws Exception{
        return super.isValidDouble("fondos disponibles ", money);
    }
    
    public void validType (String type)throws Exception{
        super.isValidString("tipo de suscripcion ", type);
    }
    
   
}

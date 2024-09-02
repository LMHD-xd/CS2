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
public class PersonValidator extends CommonsValidator{
    
    public PersonValidator(){
        super();
    }
    
    public void validName (String name)throws Exception{
        super.isValidString("nombre de la persona ", name);
    }
    
    public long validCedula (String cc)throws Exception{
        return super.isValidLong("cedula de la perosna", cc);
    }
    
    public long validCel (String cel)throws Exception{
        return super.isValidLong("el celular de la perosna es", cel);
    }
}

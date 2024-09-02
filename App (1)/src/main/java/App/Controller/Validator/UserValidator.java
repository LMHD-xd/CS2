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
public class UserValidator extends CommonsValidator{
    
    public UserValidator(){
        super();
    }
    
    public void validUserName (String userName)throws Exception{
        super.isValidString("el nombre de usuario de la persona", userName);
    }
    
    public void ValidRol (String Rol)throws Exception{
       super.isValidString("rol de la persona ", Rol);
    }
    
    public void validPassword (String password)throws Exception{
        super.isValidString(password, password);
    }
}


package App.Controller;

import App.Controller.Validator.UserValidator;
import Service.interfaces.LoginService;
import java.util.Map;


public class LoginController implements ControllerInterface{
    
    private UserValidator userValidator;
    private LoginService service;
    private static final String MENU = "ingrese una opcion: \n1 para inicira sesion.  \n2 para datener ejecucion.";
    private Map<String, ControllerInterface> roles;

    @Override
    public void session() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

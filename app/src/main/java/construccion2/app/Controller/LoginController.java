
package construccion2.app.Controller;

import construccion2.app.Controller.Validator.UserValidator;
import construccion2.app.Service.Interface.LoginService;

public class LoginController implements ControllerInterface{
    private UserValidator userValidator;
    private LoginService service;
    private static final String MENU = "Ingrese la opcion que desea ejecutar: \n1. Iniciar sesion. \n2. Detener ejecución.";
    //public LoginController();
          
    @Override
    public void session() throws Exception {
    }
    
}

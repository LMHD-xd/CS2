
package Controller;

import Controller.Validator.UserValidator;
import Service.Interface.LoginService;

public class LoginController implements ControllerInterface{
    private UserValidator userValidator;
    private LoginService service;
    private static final String MENU = "Ingrese la opcion que desea ejecutar: \n1. Iniciar sesion. \n2. Detener ejecución.";
    public LoginController();
          
    @Override
    public void session() throws Exception {
    }
    
}

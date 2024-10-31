
package construccion2.app.Controller;

import construccion2.app.Controller.Validator.PartnerValidator;
import construccion2.app.Controller.Validator.PersonValidator;
import construccion2.app.Controller.Validator.UserValidator;
import construccion2.app.Service.Interface.AdminService;

public class AdminController implements ControllerInterface{
    private static final String MENU = "Ingrese la opcion que desea ejecutar: \n1. Crear socio. \n2. Lista de facturas. \n3. Cerrar sesion.";
    private PersonValidator personValidator;
    private UserValidator userValidator;
    private AdminService service;
    private PartnerValidator partnerValidator;
    //private PartnerService service;

    @Override
    public void session() throws Exception {
        boolean session = true;
        while(session){
            session = menu();
        }
    }
    
    private boolean menu(){
        return true;
    }
    }
    
    



package Controller;

import Controller.Validator.PartnerValidator;
import Controller.Validator.PersonValidator;
import Controller.Validator.UserValidator;
import Service.Interface.AdminService;

public class AdminController implements ControllerInterface{
    private static final String MENU = "Ingrese la opcion que desea ejecutar: \n1. Crear socio. \n2. Lista de facturas. \n3. Cerrar sesion.";
    private PersonValidator personValidator;
    private UserValidator userValidator;
    private AdminService service;
    private PartnerValidator partnerValidator;
    private PartnerService service;

    @Override
    public void session() throws Exception {
        boolean session = true;
        while(session){
            session = menu;
        }
    }
    
    private boolean menu(){
        try{
            System.out.println("Bienvenido/a " + );
        }
    }
    
    
}

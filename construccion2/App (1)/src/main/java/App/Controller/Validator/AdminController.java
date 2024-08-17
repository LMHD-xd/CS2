
package App.Controller.Validator;
import App.Controller.Validator.PersonValidator;
import App.Controller.Validator.UserValidator;
import App.Dto.PartnerDTO;
import App.Dto.PersonDTO;
import App.Dto.UserDTO;
import java.sql.Date;


public class AdminController implements ControllerInterface {
    private PersonValidator personValidator;
    private UserValidator userValidator;
    
    public AdminController(){
        this.personValidator = new PersonValidator();
        this.userValidator = new UserValidator();
    }

    @Override
    public void session()throws Exception{
    }
    
    public void createPartner()throws Exception{
        System.out.println("ingrese el nombre del socio: ");
        String name = Utils.getReader().nextLine();
        personValidator.validName(name);
        System.out.println("ingrese la cedula del socio: ");
        long cc = personValidator.validCedula(Utils.getReader().nextLine());
        System.out.println("ingrese el numero de celular del socio");
        long cel = personValidator.validCel(Utils.getReader().nextLine());
        System.out.println("ingrese el nombre de usuario del socio: ");
        String userName = Utils.getReader().nextLine();
        userValidator.validUserName(userName);
        System.out.println("ingrese la contraseña");
        String password = Utils.getReader().nextLine();
        userValidator.validPassword(password);
        System.out.println("ingrese la fecha de afiliación del socio: ");
        PersonDTO personDTO = new PersonDTO();
        personDTO.setName(name);
        personDTO.setCedula(cc);
        personDTO.setCelphone(cel);
        UserDTO userDTO = new UserDTO();
        userDTO.setPersonId(personDTO);
        userDTO.setUsername(userName);
        userDTO.setPassword(password);
        userDTO.setRol("Partner");
        PartnerDTO partnerDto = new PartnerDTO();
        partnerDto.setUserId(userDTO);
        partnerDto.setMoney(50000);
        partnerDto.setType("regular");
        partnerDto.setDateCreated(new Date(System.currentTimeMillis()));
        System.out.println("Se ha creado el usuario exitosamente.");
    }
    
    public void createGuest()throws Exception{
        System.out.println("ingrese el nombre del invitado: ");
        String name = Utils.getReader().nextLine();
        personValidator.validName(name);
        System.out.println("ingrese la cedula del invitado: ");
        long cc = personValidator.validCedula(Utils.getReader().nextLine());
        System.out.println("ingrese el numero de celular del invitado: ");
        long cel = personValidator.validCel(Utils.getReader().nextLine());
        System.out.println("ingrese el nombre de usuario del invitado: ");
        String userName = Utils.getReader().nextLine();
        userValidator.validUserName(userName);
        System.out.println("ingrese la contraseña");
        String password = Utils.getReader().nextLine();
        userValidator.validPassword(password);
        System.out.println("ingrese el ID del socio que lo invita: ");
        long ID = Utils.getReader().nextLong();
        PersonDTO personDTO = new PersonDTO();
        personDTO.setName(name);
        personDTO.setCedula(cc);
        personDTO.setCelphone(cel);
        UserDTO userDTO = new UserDTO();
        userDTO.setPersonId(personDTO);
        userDTO.setUsername(userName);
        userDTO.setRol("Invitado");
        System.out.println("Se ha creado el usuario exitosamente.");
    }
    
}

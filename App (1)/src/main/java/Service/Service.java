
package Service;

import App.DAO.PersonDaoImplementation;
import App.DAO.UserDaoImplementation;
import App.DAO.interfaces.PersonDao;
import App.DAO.interfaces.UserDao;
import App.Dto.PersonDTO;
import App.Dto.UserDTO;
import App.Dto.PartnerDTO;
import App.Dto.GuestDTO;
import App.Dto.InvoiceDetailDTO;
import Service.interfaces.AdminService;
import Service.interfaces.LoginService;

public class Service implements LoginService, AdminService{
    private UserDao userDao;
    private PersonDao personDao;
    public static UserDTO user;
    
    public Service(){
        this.userDao = new UserDaoImplementation();
        this.personDao = new PersonDaoImplementation();
    }
    
    
    
    @Override
    public void login(UserDTO userDto)throws Exception{
        UserDTO validateDto = userDao.findByUserName(userDto);
        if(validateDto == null){
            throw new Exception("no existe el usuario registrado");
        }
        if(!userDto.getPassword().equals(validateDto.getPassword())){
            throw new Exception("usuario o contraseña incorrecto");
        }
        userDto.setRol(validateDto.getRol());
        user = validateDto;
    }
    
    @Override
    public void logout(){
        user = null;
        System.out.println("se ha cerrado sesión");
    }
    
    private void createUser(UserDTO userDTO)throws Exception{
        this.createPerson(userDTO.getPersonId());
        if(this.userDao.existsByUserName(userDTO)){
            throw new Exception("ya existe una persona con esa cedula");
        }
        this.userDao.createUser(userDTO);
    }
    
    private void createPerson(PersonDTO personDto){
        
    }

    @Override
    public void createPartner(UserDTO userDTO) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void createGuest(UserDTO userDTO) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void Consumo (InvoiceDetailDTO invoiceDetail){}
}


package construccion2.app.Service.Interface;

import construccion2.app.Controller.Validator.InvoiceValidator;
import construccion2.app.Dao.Interfaces.GuestDao;
import construccion2.app.Dao.Interfaces.InvoiceDao;
import construccion2.app.Dao.Interfaces.InvoiceDetailDao;
import construccion2.app.Dao.Interfaces.PartnerDao;
import construccion2.app.Dao.Interfaces.PersonDao;
import construccion2.app.Dao.Interfaces.UserDao;
import construccion2.app.Dto.GuestDto;
import construccion2.app.Dto.PartnerDto;
import construccion2.app.Dto.PersonDto;
import construccion2.app.Dto.UserDto;
import java.sql.SQLException;

public class Service implements AdminService, LoginService, PartnerInterface{
    private PersonDao personDao;
    private UserDao userDao;
    private PartnerDao partnerDao;
    private GuestDao guestDao;
    private InvoiceDao invoiceDao;
    private InvoiceDetailDao invoiceDetaildao;
    private InvoiceValidator invoiceValidator;
    private PersonDto personDto;
    private static UserDto user;

    @Override
    public void login(UserDto userDto) throws Exception {
        UserDto validateDto = userDao.findByUserName(userDto);
        if(validateDto == null){
            throw new Exception("No existe ese nombre de usuario.");
        }
        if(!userDto.getPassword().equals(validateDto.getPassword())){
            throw new Exception("Usuario o contraseña incorrecto.");
        }
        userDto.setRole(validateDto.getRole());
        user = validateDto;
    }

    @Override
    public void logout() {
        user = null;
        System.out.println("Se ha cerrado sesion.");
    }
    
    private void createPerson(PersonDto personDto)throws Exception{
        if(this.personDao.existsByDocument(personDto)){
            throw new Exception("Ya existe una persona con ese documento.");
        }
        this.personDao.createPerson(personDto);
    }
    
    private void createUser(UserDto userDto)throws Exception{
        this.createPerson(userDto.getPersonId());
        if(this.userDao.existsByUserName(userDto)){
            this.personDao.deletePerson(userDto.getPersonId());
            throw new Exception("Ya existe una persona con ese nombre de usuario.");
        }
        try{
            this.userDao.createUser(userDto);
        }catch(SQLException e){
            this.personDao.deletePerson(userDto.getPersonId()); 
        }
    }
    
    @Override
    public void createPartner(PartnerDto partnerDto) throws Exception {
    }

    @Override
    public void createGuest(GuestDto guestDto) throws Exception {
    }

    @Override
    public void activateGuest() throws Exception {
    }

    @Override
    public void deactivateGuest() throws Exception {
    }

    @Override
    public void Consumption() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void increaseFounds() throws Exception {
    }

    @Override
    public void requestDischarge() throws Exception {
    }

    @Override
    public void PromotionVIP() throws Exception {
    }
}

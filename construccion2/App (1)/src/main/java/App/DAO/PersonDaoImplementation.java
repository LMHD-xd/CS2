
package App.DAO;
import App.DAO.interfaces.PersonDao;
import App.Dto.PersonDTO;

public class PersonDaoImplementation implements PersonDao{
    
    @Override
    public boolean existsByCedula(PersonDTO personDTO)throws Exception{
        return personDTO.getCedula()==234;
    }
    
    @Override
    public void createPerson(PersonDTO personDto)throws Exception{
        System.out.println("se ha creado la persona");
    }
}

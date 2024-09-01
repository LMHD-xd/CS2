
package App.DAO.interfaces;

import App.Dto.PersonDTO;

public interface PersonDao {
    public boolean existsByCedula(PersonDTO personDTO)throws Exception;
    public void createPerson(PersonDTO personDTO)throws Exception;
    
}

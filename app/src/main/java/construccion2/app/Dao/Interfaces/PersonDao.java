
package construccion2.app.Dao.Interfaces;

import construccion2.app.Dto.PersonDto;

public interface PersonDao {
    public boolean existsByDocument(PersonDto personDto)throws Exception;
    public void createPerson(PersonDto personDto)throws Exception;
    public void deletePerson(PersonDto personDto)throws Exception;
    public PersonDto findByDocument(PersonDto personDto)throws Exception;
}

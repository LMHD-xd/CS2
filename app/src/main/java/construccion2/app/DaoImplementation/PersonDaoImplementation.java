
package construccion2.app.DaoImplementation;

import construccion2.app.Dao.Interfaces.PersonDao;
import construccion2.app.Dao.Repository.PersonRepository;
import construccion2.app.Dto.PersonDto;
import construccion2.app.Helpers.Helper;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
@Getter
@Setter
public class PersonDaoImplementation implements PersonDao{

    private PersonRepository personRepository;
    
    @Override
    public boolean existsByDocument(PersonDto personDto) throws Exception {
        return personRepository.existsByDocument(Helper.parse(personDto).getDocument());
    }

    @Override
    public void createPerson(PersonDto personDto) throws Exception {
    }

    @Override
    public void deletePerson(PersonDto personDto) throws Exception {
    }

    @Override
    public PersonDto findByDocument(PersonDto personDto) throws Exception {
        return personDto;
        
    }
    
}

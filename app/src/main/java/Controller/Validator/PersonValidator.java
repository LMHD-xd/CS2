
package Controller.Validator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@NoArgsConstructor
public class PersonValidator extends CommonsValidator{
    public void ValidName(String name)throws Exception{
        super.isValidString("Nombre de la persona: ", name);
    }
    
    public long validDocument(String document)throws Exception{
        return super.isValidLong("Documento de la persona: ", document);
    }
    
    public long isValidPhone(String Cellphone)throws Exception{
        return super.isValidLong("Celular de la persona: ", Cellphone);
    }
}

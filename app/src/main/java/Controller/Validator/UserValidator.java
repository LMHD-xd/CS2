
package Controller.Validator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@NoArgsConstructor
public class UserValidator extends CommonsValidator{
    public void validUserName(String userName)throws Exception{
        super.isValidString("Nombre de usuario: ", userName);
    }
    
    public void validPassword(String password)throws Exception{
        super.isValidString("Contraseña: ", password);
    }
    
    public void validRole(String role)throws Exception{
        super.isValidString("Rol del usuario: ", role);
    }
}

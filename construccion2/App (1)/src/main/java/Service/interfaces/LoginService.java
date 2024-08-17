
package Service.interfaces;

import App.Dto.UserDTO;

public interface LoginService {
    public void login(UserDTO userDTO)throws Exception;
    public void logout();
}

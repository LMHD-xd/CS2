
package construccion2.app.Service.Interface;

import construccion2.app.Dto.UserDto;

public interface LoginService {
    public void login(UserDto userDto)throws Exception;
    public void logout();
}

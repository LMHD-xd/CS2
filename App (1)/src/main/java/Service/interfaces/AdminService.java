
package Service.interfaces;

import App.Dto.UserDTO;

public interface AdminService {
    public void createPartner(UserDTO userDTO)throws Exception;
    public void createGuest (UserDTO userDTO)throws Exception;
}

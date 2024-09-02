
package App.DAO.interfaces;

import App.Dto.UserDTO;

public interface UserDao {
    public UserDTO findByUserName(UserDTO userDTO)throws Exception;
    public boolean existsByUserName(UserDTO userDTO)throws Exception;
    public void createUser(UserDTO userDTO)throws Exception;
}

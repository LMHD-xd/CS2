
package Dao;

import Dto.UserDto;

public interface UserDao {
    public UserDto findByUserName(UserDto userDto)throws Exception;
    public boolean existsByUserName(UserDto userDto)throws Exception;
    public void createUse(UserDto userDto)throws Exception;
    public void deleteUser(UserDto userDto)throws Exception;
    public void updateUserRole(UserDto userDto)throws Exception;
}

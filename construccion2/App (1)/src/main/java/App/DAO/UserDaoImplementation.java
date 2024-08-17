
package App.DAO;

import App.DAO.interfaces.UserDao;
import App.Dto.UserDTO;

public class UserDaoImplementation implements UserDao{

    public UserDaoImplementation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public UserDTO findByUserName(UserDTO userDTO)throws Exception{
        UserDTO validateDto = new UserDTO();
        if(userDTO.getUsername().equals("admin")){
            validateDto.setUsername(userDTO.getUsername());
            validateDto.setRol(userDTO.getRol());
            return validateDto;
        }
        if(userDTO.getUsername().equals(userDTO.getUsername())){
            validateDto.setUsername(userDTO.getUsername());
            validateDto.setRol(userDTO.getUsername());
            return validateDto;
        }
        return null;
    }
    
    @Override
    public boolean existsByUserName(UserDTO userDto)throws Exception{
        return userDto.getUsername().equals("Roberto");
    }
    
    @Override
    public void createUser(UserDTO userDto)throws Exception{
        System.out.println("se ha registrado el usuario");
    }
}

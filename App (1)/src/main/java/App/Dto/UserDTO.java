
package App.Dto;

public class UserDTO {
    private long id;
    private PersonDTO personId;
    private String username;
    private String rol;
    private String password;
    
    public UserDTO (){
        
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public PersonDTO getPersonId() {
        return personId;
    }

    public void setPersonId(PersonDTO personId) {
        this.personId = personId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    public void setPassword(String password){
         this.password=password;
    }
    
    public String getPassword(){
        return password;
    }
}

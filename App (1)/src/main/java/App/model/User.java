package App.model;

public class User {
    long id;
    Person personId;
    String username;
    String rol;
    String password;
    
    public User (){
        
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Person getPersonId() {
        return personId;
    }

    public void setpersondId(Person personId) {
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
    
    public String setPassword(){
        return password;
    }
    
    public String getPassword(){
        return password;
    }
}

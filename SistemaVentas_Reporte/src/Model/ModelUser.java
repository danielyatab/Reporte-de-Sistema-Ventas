package Model;

/**
 *
 * @author yatac
 */
public class ModelUser {
    
    private String id;
    private String user;
    private String cargo;
    private String password;

    
    public ModelUser(){
    
    }
    
    public ModelUser(String id, String user, String cargo, String password) {
        this.id = id;
        this.user = user;
        this.cargo = cargo;
        this.password = password;
    }
    
    public ModelUser(String user, String cargo, String password) {
        this.user = user;
        this.cargo = cargo;
        this.password = password;
    }

     public ModelUser(String user, String password) {
        this.user = user;
        this.password = password;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "ModelUser{" + "id=" + id + ", user=" + user + ", cargo=" + cargo + ", password=" + password + '}';
    }
    
    
}

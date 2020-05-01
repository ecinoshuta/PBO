package crud;

public class loginModel {
    private String username, password;
    public void setloginModel(String iusername, String ipassword){
        this.username = iusername;
        this.password = ipassword;
    }

    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
}

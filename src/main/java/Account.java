
public class Account extends Student {

    private String username;
    private String password;
    char exam;
    int name;

    Account(String id, String name, String surname, String username, String password) {
        super(id, name, surname);
        this.username = username;
        this.password = password;
    }

    

     
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
  
    
    public void setPassword(String password) {
        this.password=null;
        this.password = password;
    }

}

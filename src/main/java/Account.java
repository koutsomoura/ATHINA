
public class Account  {
    private String id;
    private String username;
    private String password;


    Account(String id, String username, String password) {
        this.id=id;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return id + "@" + username + "@" + password + "\n";
    }

    

     
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
  
    
    public void setPassword(String password) {
        this.password = password;
    }

}





public class Courses {
    String id;
    String name;
    String proid;
    String proname;
   

    Courses(String id, String name) {
        this.id = id;
        this.name = name;
      
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProid(String proid) {
        this.proid = proid;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getProid() {
        return proid;
    }

    public String getProname() {
        return proname;
    }
    
    
  public String toString() {
        return id + "@" + name + "\n" ;
    }   
    
}





public class Courses {
    private String cid;
    private String name;
    private String proid;
    private String proname;
   


    Courses(String cid, String name, String proid, String proname) {
        this.cid = cid;
        this.name = name;
        this.proid = proid;
        this.proname = proname;
    }

    public void setId(String id) {
        this.cid = id;
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
        return cid;
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
        return cid + "@" + name +"@"+proid+"@"+proname+"\n" ;
    }   
    
}

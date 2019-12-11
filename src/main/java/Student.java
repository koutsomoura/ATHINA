
//Maria Karaxatzi
import java.util.ArrayList;

public class Student {

    private String id;
    private String name;
    private String surname;


    ArrayList<String> ListOfAitiseis;
    Dilwseis listCourses[] = new Dilwseis[6];
    static int i = 0;

    Student(String id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
  
        ListOfAitiseis = new ArrayList<String>();
    }

    @Override
    public String toString() {
        return id + "@" + name + "@" + surname+"\n" ;
    }

    public void getData() {
        System.out.println(
                this.id + "\n"
                + this.name + "\n"
                + this.surname + "\n"
       
);

    }

    public void ADDListOfAitiseis(String str) {
        ListOfAitiseis.add(str);
        
    }

    public void printAitiseis() {
        System.out.println("AITISEIS");
        for (String data : ListOfAitiseis) {
            System.out.println(data);
        }
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }


}

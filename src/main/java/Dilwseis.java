
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dilwseis extends Courses{
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
    Date date = new Date(); 
    String AM;
    String dateDilwsis;
    String mnm;
    String dateEjetasi;
    double grade;

    
    public Dilwseis(String AM,String id, String name) {
        super(id, name);
        this.AM=AM;
        dateDilwsis=formatter.format(date);
        mnm="Μη επιτυχής";
        dateEjetasi="";
        grade=0.0;
        
    }


    public void setAM(String AM) {
        this.AM = AM;
    }

    @Override
    public String toString() {
        return AM+"@"+dateDilwsis+"@"+mnm+"@"+dateEjetasi+"@"+grade+"@";
    }

   
    public void createDilwseis() {
        Student obj;
        //listCourses[i].id=id;
    }

    public SimpleDateFormat getFormatter() {
        return formatter;
    }

    public Date getDate() {
        return date;
    }

    public String getDateDilwsis() {
        return dateDilwsis;
    }

    public String getMnm() {
        return mnm;
    }

    public String getDateEjetasi() {
        return dateEjetasi;
    }

    public double getGrade() {
        return grade;
    }

    public void setFormatter(SimpleDateFormat formatter) {
        this.formatter = formatter;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDateDilwsis(String dateDilwsis) {
        this.dateDilwsis = dateDilwsis;
    }

    public void setMnm(String mnm) {
        this.mnm = mnm;
    }

    public void setDateEjetasi(String dateEjetasi) {
        this.dateEjetasi = dateEjetasi;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
  
}

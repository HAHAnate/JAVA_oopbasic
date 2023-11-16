

public class grade {
    private String std_id;
    private String stdName;
    private String PhoneNumber;
    private float Grade_scien;
    private float Grade_eng;
    private float Grade_programming;
    private float GPA;

    public String[] Std_Detail(String id, String Name, String Phone){
     
        this.std_id = id;
        this.stdName = Name;
        this.PhoneNumber = Phone;

        String[] Std_detail = {this.std_id, this.stdName, this.PhoneNumber};
        return Std_detail ;

    }
    public float[] Std_grade(float scien, float eng, float programming){
        this.Grade_scien = scien;
        this.Grade_eng = eng;
        this.Grade_programming = programming;


        this.GPA = (this.Grade_scien + this.Grade_eng +  this.Grade_programming )/3;

        float[] Std_grade = {this.Grade_scien, this.Grade_eng, this.Grade_programming , this.GPA};

        return Std_grade;

        
        
    }
}

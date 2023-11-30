import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class grade {
    private String stdID;
    private String stdName;
    private String PhoneNumber;
    private float Grade_scien;
    private float Grade_eng;
    private float Grade_programming;
    private float GPA;

 
    public List <Object> set_ID(String id, String name,String phone,float sci, float com,float eng ){
                List<Object>List = new ArrayList<>();
                this.stdID = id;
                this.stdName = name;
                this.PhoneNumber = phone;
                this.Grade_scien = sci;
                this.Grade_eng = eng;
                this.Grade_programming = com;
                this.GPA = (this.Grade_scien + this.Grade_programming + this.Grade_eng) /3;

                Collections.addAll(List, this.stdID,stdName,PhoneNumber,Grade_scien,Grade_eng,Grade_programming,GPA);
                return List;
                
            }
}

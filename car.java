public class car {

    String Car_name ;
    String Modle;
    String Color;
    int price ;
    boolean limited;
    float max_speed ;


 public void ShowDetail (){

    String CarDetail = String.format(" Carname : %s \n Model: %s \n Color : %s \n price : %s \n Maxspeed : %s \n limited : %s \n ",this.Car_name,this.Modle,this.Color,this.price,this.max_speed,this.limited);

   System.out.println(CarDetail);
 }

    





}

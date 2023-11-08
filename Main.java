

public class Main{
    public static  void main(String[]args){

     car  car1 = new car();
     car1.Car_name = "kavasaki";
     car1.Modle = "Niga 300";
     car1.Color = "White";
     car1.price = 10000;
     car1.limited = false;
     car1.max_speed = 1900;

        car1.ShowDetail();


     car  aonCar = new car();
     aonCar.Car_name = "Bmw";
     aonCar.Modle = "เสามงคง";
     aonCar.Color = "Black";
     aonCar.price = 1000000;
     aonCar.limited = true   ;
     aonCar.max_speed = 19000;

     aonCar.ShowDetail();



    }
}































//         Scanner  sc = new Scanner (System.in);

//             System.out.println("Enter your Name : ");

//             String Heroname = sc.nextLine();

//             System.out.println("้Select Hero Role .. :3 \n Type 1 = Tank \n 2 = Carry \n 3 = Mage"); 
            
//             int Role = sc.nextInt();

//         if (Role == 1)
//         {
//             System.out.println("Hero name is : " +Heroname + " Your Role :Tank");
//         }
//         else if (Role == 2)
//         {
//             System.out.println("Hero name is : " +Heroname + " Your Role :Carry");
//         }
//         else if (Role == 3)
//         {
//             System.out.println("Hero name is : " +Heroname + " Your Role :Mage");
//         }

        // sc.close(); 



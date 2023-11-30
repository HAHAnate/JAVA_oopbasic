import java.util.List;
import java.util.Scanner;


public class Main {

     public static void main(String[] args){


      Scanner sc = new Scanner(System.in);
          System.out.print(" INPUT ID :");
         String id = sc.nextLine();
         

         System.out.print(" INPUT Name :" );
         String name = sc.nextLine();
         

         System.out.print("INPUT Phone :");
          String phone = sc.nextLine();
         

         System.out.print("INPUT Scien : " );
          float sci = sc.nextFloat();
         

         System.out.print("INPUT Programing :" );
         float com = sc.nextFloat();
         
         
         System.out.print("INPUT english : " );
         float eng = sc.nextFloat();
        
          System.out.print("\n________________________________ \n\n" );

        
      

         sc.close();
      

       
        grade std1  = new grade();
         List<Object> result = std1.set_ID(id,name,phone,sci,com,eng);
         int member = result.size();
       

         for (int i = 0; i < member; i++){
            if (i == 0) {
               System.out.println("ID: " + result.get(i));
            }
            if (i == 1) {
               System.out.println("Name: " + result.get(i));
            }
            if (i == 2) {
               System.out.println("Phone: " + result.get(i));
            }
            if (i == 3) {
               System.out.println("Scient: " + result.get(i));
            }
            if (i == 4) {
               System.out.println("Match: " + result.get(i));
            }
            if (i == 5) {
               System.out.println("Programing: " + result.get(i));
            }
            if (i == 6) {

               System.out.println("GPA: " + result.get(i));
            }
        }
         
      
     }

     

}
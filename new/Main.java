public class Main {

     public static void main(String[] args){
       
        grade pram5 = new grade();
        String[] detail = pram5.Std_Detail("666666","pram666666","055555555");
        float[] grade = pram5.Std_grade(3, 4, 7);

        
        System.out.println("Studen Id : " +detail[0]) ;
        System.out.println("Studen Name : " +detail[1]) ;
        System.out.println("Phone Number : " +detail[2]) ;
        System.out.println("SEC : "+grade[0]) ;
        System.out.println("ENG : "+grade[1])  ;
        System.out.println("Programming : "+grade[2]) ;
        System.out.println("GPA : "+grade[3]) ;
    

     }

}
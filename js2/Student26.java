public class Student26 {

    static String studentID;
    static String name;
    static String className;
    static double gpa;

    

    
    public Student26(String id, String name, String cls, double gpa){
        studentID = id;
        this.name = name;
        className = cls;
        this.gpa = gpa;
         {
        
            
        }
    }

    static void print() {

        System.out.println("Student ID : " + studentID);

        System.out.println("Name : " + name);
        System.out.println("Class " +className);
        System.out.println("GPA : "+gpa);

    }
    void changeCLass(String newClass){
        className = newClass;
    }
    void updateGpa(double newGPA){
        gpa = newGPA;
    }
    String evaluate(){
        if (gpa >= 3.5) {
            return"Excelent";
         }else if (gpa >= 3.0) {
            return"Good";
        }else if (gpa >= 2.0) {
            return "fair";
        }else{
            return"poor";
        }
    }
}

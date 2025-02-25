public class Course26 {
    static String Course26;
    static String Name;
    static int Credit;
    static int Hour;
  
    public Course26(String kls,String nm, int credit, int Hour ){
        Course26 = kls;
        Name = nm;
        Credit = credit;
        this.Hour = Hour;

    }

    void print(){
        System.out.println("Course :"+ Course26);
        System.out.println("Name : "+ Name);
        System.out.println("Credit :"+ Credit);
        System.out.println("Hour : " + Hour);

    }
    static void changeCredit(int Credits){
        Credit =  Credits;
    }
    static void addHour(int addHours){
        Hour += addHours;

    }
    static void ReduceHour(int ReduceHours ){
        Hour -= ReduceHours;
    }
       

}


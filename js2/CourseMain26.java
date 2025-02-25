public class CourseMain26 {
    public static void main(String[] args) {
        Course26 course1 = new Course26(null, null, 0, 0);
        course1.Course26 = "LPY-5";
        course1.Name = "Algorithm";
        course1.Credit = 3;
        course1.Hour = 6;
        course1.print();
        course1.changeCredit(2);
        course1.ReduceHour(4);
        course1.print();
        Course26 course2 = new Course26("RT-07", "INGGRIS", 1, 2);
        course2.addHour(2);
        course2.changeCredit(4);
        course2.print();




    }
}

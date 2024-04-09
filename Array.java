class Student{
    int rollno;
    int marks;
    String name;
}
public class Array {
    public  static  void main(String[] args){
        Student s1 = new Student();
        s1.marks = 34;
        s1.rollno = 1;
        s1.name = "Ankit";

        Student s2 = new Student();
        s2.marks = 35;
        s2.rollno = 2;
        s2.name = "navin";

        Student s3 = new Student();
        s3.marks = 25;
        s3.rollno = 3;
        s3.name = "Mahesh";

        Student s4 = new Student();
        s4.marks = 35;
        s4.rollno = 4;
        s4.name = "Nikhil";

        Student stu[]  = new Student[4];
        stu[0] = s1;
        stu[1] = s2;
        stu[2] = s3;
        stu[3] = s4;


        for(int i = 0; i < stu.length; i++){
            System.out.println(stu[i].name + " " + stu[i].marks + " " + stu[i].rollno);
        }
    }
}

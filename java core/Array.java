class Student{
    int rollno;
    int marks;
    static String subject;

    static{
        subject = "java";
    }
}
public class Array {
    public  static  void main(String[] args){
        Student s1 = new Student();
        s1.marks = 34;
        s1.rollno = 1;
        

        Student s2 = new Student();
        s2.marks = 35;
        s2.rollno = 2;
        

        Student s3 = new Student();
        s3.marks = 25;
        s3.rollno = 3;
        

        Student s4 = new Student();
        s4.marks = 35;
        s4.rollno = 4;
       

        Student stu[]  = new Student[4];
        stu[0] = s1;
        stu[1] = s2;
        stu[2] = s3;
        stu[3] = s4;


        for(int i = 0; i < stu.length; i++){
            System.out.println(stu[i].subject + " " + stu[i].marks + " " + stu[i].rollno);
        }
    }
}

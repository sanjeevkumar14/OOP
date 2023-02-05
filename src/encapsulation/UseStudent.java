package encapsulation;

public class UseStudent {
    public static void main(String[] args) {

        Student s;
        s=new Student();
        s.setStudent(154,"Sanjeev ",85.70);
        s.showStudent();

        Student p;
        p=new Student();
        p.setStudent(101,"Shrivastava ",90.70);
        p.showStudent();

    }
}

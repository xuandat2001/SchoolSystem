import Project.Lecturer;
import Project.Project;
import Student.PartTimeStudent;
import Student.FullTimeStudent;
import Student.student;

public class SchoolSystem {
    private static Lecturer[] lecturerList = new Lecturer[10];
    private static int lectureCount = 0;
    private static student[] studentList = new student[10];
    private static int studentCount = 0;
    private static Project[] projectList = new Project[10];
    private static int projectCount = 0;

    public static void addLecturer(Lecturer lec){
        lecturerList[lectureCount++] = lec;
    }
    public static void addStudent(student stu){
        studentList[studentCount++] = stu;
    }
    public static void addProject(Project pro){
        projectList[projectCount++] = pro;
    }
    public static void main(String[] args){
        Lecturer lecture1 = new Lecturer("L001","Smiling","Lecturer");
        Lecturer lecture2 = new Lecturer("L002","Smiling1","Senior Lecturer");
        Lecturer lecture3 = new Lecturer("L003","Smiling2","Assoc Lecturer");
        SchoolSystem.addLecturer(lecture1);
        SchoolSystem.addLecturer(lecture2);
        SchoolSystem.addLecturer(lecture3);

        student stu1 = new PartTimeStudent("Harry", "IT", "S001", 5,20);
        student stu2 = new PartTimeStudent("Ron", "SE", "S002", 5,20);
        student stu3 = new PartTimeStudent();
        student stu4 = new FullTimeStudent("Dat", "SE", "S003");
        student stu5 = new FullTimeStudent("Huy", "SE", "S004");
        SchoolSystem.addStudent(stu1);
        SchoolSystem.addStudent(stu2);
        SchoolSystem.addStudent(stu3);
        SchoolSystem.addStudent(stu4);
        SchoolSystem.addStudent(stu5);

        Project pro1 = new Project("AI", 1000.0);
        Project pro2 = new Project("ML", 1000.0);
        SchoolSystem.addProject(pro1);
        SchoolSystem.addProject(pro2);

        boolean test = lecture1.leadProject(pro1);
        System.out.println(test);//TRUE


        test = lecture2.leadProject(pro1);
        System.out.println(test);//FALSE

        test = lecture1.leadProject(pro2);
        System.out.println(test);//FALSE

        test = pro1.addMember(stu1);
        System.out.println(test);//FALSE

        test = pro1.addMember(stu5);
        System.out.println(test);//TRUE

        test = ((FullTimeStudent) stu4).joinProject(pro1);
        System.out.println(test);//TRUE

        test = lecture2.joinProject(pro1);
        System.out.println(test);//TRUE
        lecture3.serRank("Lecturer");
        test = lecture3.joinProject(pro1);
        System.out.println(test);//TRUE
        pro1.displayMembers();


        System.out.println("Number of partime Student is: " + PartTimeStudent.getCount());
    }

}

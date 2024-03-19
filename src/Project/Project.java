package Project;

import Student.FullTimeStudent;
import Student.PartTimeStudent;

public class Project {
    private String namePro;
    private Double budgetPro;
    private Lecturer Lecturer;
    private Object[] Members;
    private final int MAXMEMBERS  = 10;
    private int memberCount = 0;

    public Project() {
    }

    public Project(String namePro, Double budgetPro) {
        this.namePro = namePro;
        this.budgetPro = budgetPro;
        Members = new Object[MAXMEMBERS];
    }

    public void setLecturer(Lecturer lecturer) {
        Lecturer = lecturer;
    }

    public Lecturer getLecturer() {
        return Lecturer;
    }
    public boolean addMember(Object newMember){
        if (!isNotFull()){
            return false;
            if (!(newMember instanceof PartTimeStudent)){
                Members[memberCount++] = newMember;
                if (newMember instanceof FullTimeStudent){
                    ((FullTimeStudent)newMember).setProject(this);
                }
                else{

                }
            }
        }
    }
    public boolean isNotFull(){
        return memberCount < MAXMEMBERS;
    }
}

package Project;

import Student.FullTimeStudent;
import Student.PartTimeStudent;

public class Project {
    private String namePro;
    private double budgetPro;
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
        if (!isNotFull())
            return false;
        if (!(newMember instanceof PartTimeStudent)){
            Members[memberCount++] = newMember;
            if (newMember instanceof FullTimeStudent){
                ((FullTimeStudent)newMember).setProject(this);
            }
            else{
                ((Lecturer)newMember).getJoinedProject()[((Lecturer)newMember).getProjectCount()] = this;
                ((Lecturer)newMember).setProjectCount(((Lecturer)newMember).getProjectCount() + 1);
            }
            return true;
            }
        return false;

    }
    public boolean isNotFull(){
        return memberCount < MAXMEMBERS;
    }
    public void displayMembers(){
        System.out.println("Leader: " + Lecturer);

        for (int i = 0 ; i < memberCount; i++){
            System.out.printf("Member #%d: " + Members[i] + "\n", i+1);
        }
    }
}

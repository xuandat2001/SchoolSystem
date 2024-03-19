package Project;

import java.util.ArrayList;

public class Lecturer {
    private String idLec;
    private String nameLec;
    private String rank;
    private Project projectLead;
    private final int MAX_PROJECT = 10;
    private Project[] joinedProject;
    private int projectCount = 0;

    public Lecturer(){
        this.idLec = "Default";
        this.nameLec = "Default";
        this.rank = "Default";
        joinedProject = new Project[MAX_PROJECT];
    }
    public Lecturer(String idLec, String nameLec, String rank) {
        this.idLec = idLec;
        this.nameLec = nameLec;
        this.rank = rank;
        joinedProject = new Project[MAX_PROJECT];
    }
    public boolean leadProject(Project p){
        if (!isLeading() && p.getLecturer() == null){
            this.projectLead = p;
            p.setLecturer(this);
            return true;
        }
        return false;
    }

    public boolean isLeading(){
        return projectLead != null;
    }

    public Project[] getJoinedProject() {
        return joinedProject;
    }

    public int getProjectCount() {
        return projectCount;
    }

    public void setProjectCount(int projectCount) {
        this.projectCount = projectCount;
    }
    public boolean joinProject(Project p){
        if (projectCount < 10 && p.addMember(this) ){
            this.joinedProject[projectCount++] = p;
            return true;
        }
        return false;
    }
    public boolean serRank(String rank){
        String[] rankList = {"Assoc Lecture", "Lecturer", "Senior Lecturer"};
        boolean checked = false;
        for (String avaliableRank:rankList){
            if (avaliableRank.equals(rank)){
                checked = true;
            }
        }
        if (checked){
            this.rank = rank;
            return true;
        }
        return  false;
    }
    @Override
    public String toString() {
        return "Lecturer{" +
                "idLec='" + idLec + '\'' +
                ", nameLec='" + nameLec + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}

package Project;

import java.util.ArrayList;

public class Lecturer {
    private String idLec;
    private String nameLec;
    private String rank;
    private Project projectLead;
    private ArrayList<Project>joinedProject = new ArrayList<>();

    public Lecturer() {
    }

    public Lecturer(String idLec, String nameLec, String rank) {
        this.idLec = idLec;
        this.nameLec = nameLec;
        this.rank = rank;
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



}

package Student;
import Project.Project;

public class FullTimeStudent extends student{
    private Project joinedProject;
    public FullTimeStudent(){
        super();
        this.joinedProject = null;
    }

    public FullTimeStudent(String nameStu, String major, String idStu) {
        super(nameStu, major, idStu);
        this.joinedProject = null;
    }

    public FullTimeStudent(String nameStu, String major, String idStu, Project project) {
        super(nameStu, major, idStu);
        this.joinedProject = project;
    }

    public void setProject(Project joinedProject) {
        this.joinedProject = joinedProject;
    }

    public boolean joinProject(Project p ){
        if (this.joinedProject == null && p.addMember(this)){
            this.joinedProject = p;
            return true;
        }
        return false;
    }
}

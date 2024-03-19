package Student;
public abstract class  student {
    private String nameStu;
    private String major;
    private String idStu;

    public student() {}

    public student(String nameStu, String major, String idStu) {
        this.nameStu = nameStu;
        this.major = major;
        this.idStu = idStu;
    }
    @Override
    public String toString() {
        return "student{" +
                "nameStu='" + nameStu + '\'' +
                ", major='" + major + '\'' +
                ", idStu='" + idStu + '\'' +
                '}';
    }
}

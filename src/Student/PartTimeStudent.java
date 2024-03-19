package Student;

public class PartTimeStudent extends student{
    private int minHour;
    private int maxHour;

    public PartTimeStudent(int minHour, int maxHour) {
        this.minHour = minHour;
        this.maxHour = maxHour;
    }

    public PartTimeStudent() {}
    void registerHour(int minHour, int maxHour){
        this.minHour = minHour;
        this.maxHour = maxHour;
    }

    @Override
    public String toString() {
        return "PartTimeStudent{" +
                "minHour=" + minHour +
                ", maxHour=" + maxHour +
                '}';
    }
}

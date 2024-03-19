package Student;

public class PartTimeStudent extends student{
    private int minHour;
    private int maxHour;
    private static int count = 0;

    public PartTimeStudent(String nameStu, String major, String idStu,int minHour, int maxHour) {
        super(nameStu, major, idStu);
        this.minHour = minHour;
        this.maxHour = maxHour;
        count++;
    }

    public PartTimeStudent() {
        super();
        count++;
    }

    public static int getCount() {
        return count;
    }

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

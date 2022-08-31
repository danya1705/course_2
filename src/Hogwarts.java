public class Hogwarts {

    private String name;
    private int magicPower;
    private int transgressionDistance;

    public Hogwarts(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void compareStudents(Hogwarts student) {

        int pointsThis = this.magicPower + this.transgressionDistance;
        int pointsStudent = student.magicPower + student.transgressionDistance;

        if (pointsThis > pointsStudent) {
            System.out.println(this.getName() + " лучший волшебник, чем " + student.getName());
        } else if (pointsThis < pointsStudent) {
            System.out.println(student.getName() + " лучший волшебник, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + student.getName() + " равны как волшебники");
        }
    }

}

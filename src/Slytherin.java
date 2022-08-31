public class Slytherin extends Hogwarts {

    private int cunning;
    private int decisiveness;
    private int ambition;
    private int resourcefulness;
    private int powerLust;

    public Slytherin(String name, int magicPower, int transgressionDistance, int cunning, int decisiveness, int ambition, int resourcefulness, int powerLust) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.decisiveness = decisiveness;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.powerLust = powerLust;
    }

    @Override
    public String toString() {
        return this.getName() + " (Слизерин)" +
                "\n--------------------------------" +
                "\nМагическая сила: " + this.getMagicPower() +
                "\nДистанция трансгрессии: " + this.getTransgressionDistance() +
                "\n--------------------------------" +
                "\nХитрость: " + cunning +
                "\nРешительность: " + decisiveness +
                "\nАмбициозность: " + ambition +
                "\nНаходчивость: " + resourcefulness +
                "\nЖажда власти: " + powerLust;
    }

    public void compareStudentsByFaculty(Slytherin student) {

        int pointsThis = this.cunning + this.decisiveness + this.ambition + this.resourcefulness + this.powerLust;
        int pointsStudent = student.cunning + student.decisiveness + student.ambition + student.resourcefulness + student.powerLust;

        if (pointsThis > pointsStudent) {
            System.out.println(this.getName() + " лучший Слизеринец, чем " + student.getName());
        } else if (pointsThis < pointsStudent) {
            System.out.println(student.getName() + " лучший Слизеринец, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + student.getName() + " равны как Слизеринцы");
        }
    }
}
public class Gryffindor extends Hogwarts {

    private int chivalry;
    private int courage;
    private int honour;

    public Gryffindor(String name, int magicPower, int transgressionDistance, int chivalry, int courage, int honour) {
        super(name, magicPower, transgressionDistance);
        this.chivalry = chivalry;
        this.courage = courage;
        this.honour = honour;
    }

    @Override
    public String toString() {
        return this.getName() + " (Гриффиндор)" +
                "\n--------------------------------" +
                "\nМагическая сила: " + this.getMagicPower() +
                "\nДистанция трансгрессии: " + this.getTransgressionDistance() +
                "\n--------------------------------" +
                "\nБлагородство: " + chivalry +
                "\nХрабрость: " + courage +
                "\nЧесть: " + honour;
    }

    public void compareStudentsByFaculty(Gryffindor student) {

        int pointsThis = this.chivalry + this.courage + this.honour;
        int pointsStudent = student.chivalry + student.courage + student.honour;

        if (pointsThis > pointsStudent) {
            System.out.println(this.getName() + " лучший Гриффиндорец, чем " + student.getName());
        } else if (pointsThis < pointsStudent) {
            System.out.println(student.getName() + " лучший Гриффиндорец, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + student.getName() + " равны как Гриффиндорцы");
        }
    }


}

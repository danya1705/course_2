public class Ravenclaw extends Hogwarts {

    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int magicPower, int transgressionDistance, int intelligence, int wisdom, int wit, int creativity) {
        super(name, magicPower, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return this.getName() + " (Когтевран)" +
                "\n--------------------------------" +
                "\nМагическая сила: " + this.getMagicPower() +
                "\nДистанция трансгрессии: " + this.getTransgressionDistance() +
                "\n--------------------------------" +
                "\nУм: " + intelligence +
                "\nМудрость: " + wisdom +
                "\nОстноумие: " + wit +
                "\nКреативность: " + creativity;
    }

    public void compareStudentsByFaculty(Ravenclaw student) {

        int pointsThis = this.intelligence + this.wisdom + this.wit + this.creativity;
        int pointsStudent = student.intelligence + student.wisdom + student.wit + student.creativity;

        if (pointsThis > pointsStudent) {
            System.out.println(this.getName() + " лучший Когтевранец, чем " + student.getName());
        } else if (pointsThis < pointsStudent) {
            System.out.println(student.getName() + " лучший Когтевранец, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + student.getName() + " равны как Когтевранцы");
        }
    }
}
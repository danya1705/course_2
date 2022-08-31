public class Hufflepuff extends Hogwarts {

    private int hardWork;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int magicPower, int transgressionDistance, int hardWork, int loyalty, int honesty) {
        super(name, magicPower, transgressionDistance);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return this.getName() + " (Пуффендуй)" +
                "\n--------------------------------" +
                "\nМагическая сила: " + this.getMagicPower() +
                "\nДистанция трансгрессии: " + this.getTransgressionDistance() +
                "\n--------------------------------" +
                "\nТрудолюбие: " + hardWork +
                "\nВерность: " + loyalty +
                "\nЧестность: " + honesty;
    }

    public void compareStudentsByFaculty(Hufflepuff student) {

        int pointsThis = this.hardWork + this.loyalty + this.honesty;
        int pointsStudent = student.hardWork + student.loyalty + student.honesty;

        if (pointsThis > pointsStudent) {
            System.out.println(this.getName() + " лучший Пуффендуец, чем " + student.getName());
        } else if (pointsThis < pointsStudent) {
            System.out.println(student.getName() + " лучший Пуффендуец, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + student.getName() + " равны как Пуффендуйцы");
        }
    }
}

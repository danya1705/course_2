public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Гарри Поттер",60,40,70,80,60);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер",80,60,80,60,50);
        Gryffindor ronWeasley = new Gryffindor("Рон Уизли",10,0,40,100,70);

        System.out.println(harryPotter);
        System.out.println();
        hermioneGranger.compareStudentsByFaculty(ronWeasley);
        System.out.println();

        Hufflepuff zachariasSmith = new Hufflepuff("Захария Смит",40,0,60,20,40);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори",80,40,70,80,90);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин Финч-Флетчли",30,10,40,60,70);

        zachariasSmith.compareStudentsByFaculty(cedricDiggory);
        System.out.println();

        Ravenclaw choChang = new Ravenclaw("Чжоу Чанг",50,20,50,30,40,40);
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил",60,30,50,50,20,20);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби",40,20,50,40,40,40);

        choChang.compareStudentsByFaculty(marcusBelby);
        System.out.println();

        Slytherin dracoMalfoy = new Slytherin("Драко Малфой",70,30,65,50,90,40,80);
        Slytherin grahamMontague = new Slytherin("Грэхэм Монтегю",30,30,30,75,80,40,70);
        Slytherin gregoryGoyle = new Slytherin("Грегори Гойл",25,10,20,80,10,15,75);

        System.out.println(dracoMalfoy);
        System.out.println();
        grahamMontague.compareStudentsByFaculty(gregoryGoyle);
        System.out.println();

        harryPotter.compareStudents(dracoMalfoy);

    }
}
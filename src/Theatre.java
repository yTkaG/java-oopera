public class Theatre {

    public static void main(String[] args) {
        Actor actor1 = new Actor("Айзек", "Бобков", Gender.MALE, 1.65);
        Actor actor2 = new Actor("Гарри", "Дюбуа", Gender.MALE, 1.75);
        Actor actor3 = new Actor("Мэй", "Боровски", Gender.FEMALE, 1.70);

        Director director1 = new Director("Уилсон", "Персиваль", Gender.MALE, 2);
        Director director2 = new Director("Алекс", "Вэнс", Gender.FEMALE, 3);

        MusicalShow musicalShow = new MusicalShow("хз", 180, director1, "Чепуха", "fffffffffff");
        Opera opera = new Opera("хзхз", 145, director1, "Ерунда", "llllllll", 50);
        Ballet ballet = new Ballet("хзз", 120, director2, "Е", "jjjjj", "вдвд");

        musicalShow.newActor(actor1);
        musicalShow.newActor(actor2);

        opera.newActor(actor3);

        ballet.newActor(actor1);
        ballet.newActor(actor2);
        ballet.newActor(actor3);

        musicalShow.printListOfActors();
        opera.printListOfActors();
        ballet.printListOfActors();

        opera.changeActor(actor3, actor2);
        opera.printListOfActors();

        opera.changeActor(actor1, actor3);

        opera.printLibrettoText();
    }
}

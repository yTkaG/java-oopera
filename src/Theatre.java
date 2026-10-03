public class Theatre {

    public static void main(String[] args) {
        Actor actor1 = new Actor("Айзек", "Бобков", Gender.MALE, 1.65);
        Actor actor2 = new Actor("Гарри", "Дюбуа", Gender.MALE, 1.75);
        Actor actor3 = new Actor("Мэй", "Боровски", Gender.FEMALE, 1.70);

        Director director1 = new Director("Уилсон", "Персиваль", Gender.MALE, 2);
        Director director2 = new Director("Алекс", "Вэнс", Gender.FEMALE, 3);

        Person musicAuthor = new Person("Антон", "Верщагин", Gender.MALE);
        Person choreographer = new Person("Лидия", "Ветрова", Gender.FEMALE);

        MusicalShow musicalShow = new MusicalShow("Спектакль", 180, director1, musicAuthor, "Либретто текст спектакля");
        Opera opera = new Opera("Опера", 145, director1, musicAuthor, "Либретто текст оперы", 50);
        Ballet ballet = new Ballet("Балет", 120, director2, musicAuthor, "Либретто текст балета", choreographer);

        musicalShow.newActor(actor1);
        musicalShow.newActor(actor2);

        opera.newActor(actor3);

        ballet.newActor(actor1);
        ballet.newActor(actor2);
        ballet.newActor(actor3);

        musicalShow.printListOfActors();
        opera.printListOfActors();
        ballet.printListOfActors();

        opera.changeActor("Боровски", actor2);
        opera.printListOfActors();

        opera.changeActor("Бобков", actor3);

        opera.printLibrettoText();
    }
}

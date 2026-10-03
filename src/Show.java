import java.util.ArrayList;

public class Show {
    String title;
    int duration;
    Director director;
    ArrayList<Actor> listOfActors = new ArrayList<>();;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    public void printDirector() { //Печать директора
        System.out.println(director);
        return;
    }

    public void printListOfActors() { //Печать актеров
        System.out.println("В спектакле выступают:");
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
        return;
    }

    public void newActor(Actor newActor) { //Добавление актера
        if (!listOfActors.isEmpty()) {
            for (Actor actor : listOfActors) {
                if (actor.equals(newActor)) {
                    System.out.println("Такой актер уже есть");
                    return;
                }
            }
            listOfActors.add(newActor);
            return;
        }
        listOfActors.add(newActor);
        return;
    }

    public void changeActor(Actor oldActor, Actor newActor) { //Замена актера
        if (!listOfActors.isEmpty()) {
            for (Actor actor : listOfActors) {
                if (actor.equals(oldActor)) {
                    listOfActors.remove(oldActor);
                    listOfActors.add(newActor);
                    System.out.println("Актер " + actor + " был заменён на " + newActor);
                    return;
                }
            }
            System.out.println(oldActor + " не был найден в списке");
            return;
        }
        System.out.println("Список пуст чтоб менять актеров");
        return;
    }

}

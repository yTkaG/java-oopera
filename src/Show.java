import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors = new ArrayList<>();;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public void setListOfActors(ArrayList<Actor> listOfActors) {
        this.listOfActors = listOfActors;
    }

    public void printDirector() { //Печать директора
        System.out.println(director);
    }

    public void printListOfActors() { //Печать актеров
        System.out.println("В спектакле выступают:");
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
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
    }

    public void changeActor(String oldActor, Actor newActor) { //Замена актера
        if (!listOfActors.isEmpty()) {
            for (Actor actor : listOfActors) {
                if (actor.getSurname().equals(oldActor)) {
                    listOfActors.remove(actor);
                    listOfActors.add(newActor);
                    System.out.println("Актер " + actor + " был заменён на " + newActor);
                    return;
                }
            }
            System.out.println(oldActor + " не был найден в списке");
            return;
        }
        System.out.println("Список пуст чтоб менять актеров");
    }

}

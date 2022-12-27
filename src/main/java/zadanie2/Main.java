package zadanie2;

public class Main {

    public static void main(String[] args) {

        Movie movie = new Movie("Tytul filmu", "Imie i nazwisko rezysera", 120, 2020);

        System.out.println("Tytul: " + movie.getTitle());
        System.out.println("Rezyser: " + movie.getDirector());
        System.out.println("Czas trwania: " + movie.getDuration() + " minut");
        System.out.println("Rok produkcji: " + movie.getYear());
    }

}

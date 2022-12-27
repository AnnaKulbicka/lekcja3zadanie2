package zadanie2;

public class Movie {


        private String title;
        private String director;
        private int duration;
        private int year;


        public Movie(String tytul, String rezyser, int czasTrwania, int rokProdukcji) {
            this.title = tytul;
            this.director = rezyser;
            this.duration = czasTrwania;
            this.year = rokProdukcji;
        }


        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDirector() {
            return director;
        }

        public void setDirector(String director) {
            this.director = director;
        }

        public int getDuration() {
            return duration;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }
    }


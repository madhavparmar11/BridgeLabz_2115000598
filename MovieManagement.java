
import java.util.Scanner;

class Movie {
    char[] title;
    char[] director;
    int year;
    double rating;
    Movie next;
    Movie prev;

    Movie(char[] title, char[] director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}

class MovieList {
    Movie head;
    Movie tail;

    void addMovie(char[] title, char[] director, int year, double rating, int position) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (head == null || position == 0) {
            newMovie.next = head;
            if (head != null) head.prev = newMovie;
            head = newMovie;
            if (tail == null) tail = newMovie;
            return;
        }
        Movie temp = head;
        int count = 0;
        while (temp.next != null && count < position - 1) {
            temp = temp.next;
            count++;
        }
        newMovie.next = temp.next;
        if (temp.next != null) temp.next.prev = newMovie;
        temp.next = newMovie;
        newMovie.prev = temp;
        if (newMovie.next == null) tail = newMovie;
    }

    void removeMovie(char[] title) {
        Movie temp = head;
        while (temp != null) {
            int i = 0;
            while (temp.title[i] == title[i] && temp.title[i] != '\0' && title[i] != '\0') {
                i++;
            }
            if (temp.title[i] == '\0' && title[i] == '\0') {
                if (temp.prev != null) temp.prev.next = temp.next;
                if (temp.next != null) temp.next.prev = temp.prev;
                if (temp == head) head = temp.next;
                if (temp == tail) tail = temp.prev;
                return;
            }
            temp = temp.next;
        }
    }

    Movie searchMovieByDirector(char[] director) {
        Movie temp = head;
        while (temp != null) {
            int i = 0;
            while (temp.director[i] == director[i] && temp.director[i] != '\0' && director[i] != '\0') {
                i++;
            }
            if (temp.director[i] == '\0' && director[i] == '\0') return temp;
            temp = temp.next;
        }
        return null;
    }

    Movie searchMovieByRating(double rating) {
        Movie temp = head;
        while (temp != null) {
            if (temp.rating == rating) return temp;
            temp = temp.next;
        }
        return null;
    }

    void updateRating(char[] title, double newRating) {
        Movie temp = head;
        while (temp != null) {
            int i = 0;
            while (temp.title[i] == title[i] && temp.title[i] != '\0' && title[i] != '\0') {
                i++;
            }
            if (temp.title[i] == '\0' && title[i] == '\0') {
                temp.rating = newRating;
                return;
            }
            temp = temp.next;
        }
    }

    void displayMoviesForward() {
        Movie temp = head;
        while (temp != null) {
            int i = 0;
            while (temp.title[i] != '\0') {
                System.out.print(temp.title[i]);
                i++;
            }
            System.out.print(" ");
            i = 0;
            while (temp.director[i] != '\0') {
                System.out.print(temp.director[i]);
                i++;
            }
            System.out.println(" " + temp.year + " " + temp.rating);
            temp = temp.next;
        }
    }

    void displayMoviesReverse() {
        Movie temp = tail;
        while (temp != null) {
            int i = 0;
            while (temp.title[i] != '\0') {
                System.out.print(temp.title[i]);
                i++;
            }
            System.out.print(" ");
            i = 0;
            while (temp.director[i] != '\0') {
                System.out.print(temp.director[i]);
                i++;
            }
            System.out.println(" " + temp.year + " " + temp.rating);
            temp = temp.prev;
        }
    }
}

public class MovieManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MovieList list = new MovieList();

        list.addMovie(new char[]{'I', 'n', 'c', 'e', 'p', 't', 'i', 'o', 'n', '\0'}, new char[]{'N', 'o', 'l', 'a', 'n', '\0'}, 2010, 8.8, 0);
        list.addMovie(new char[]{'A', 'v', 'a', 't', 'a', 'r', '\0'}, new char[]{'C', 'a', 'm', 'e', 'r', 'o', 'n', '\0'}, 2009, 7.8, 1);
        list.addMovie(new char[]{'T', 'e', 'n', 'e', 't', '\0'}, new char[]{'N', 'o', 'l', 'a', 'n', '\0'}, 2020, 7.5, 1);
        
        list.displayMoviesForward();
        list.removeMovie(new char[]{'A', 'v', 'a', 't', 'a', 'r', '\0'});
        list.updateRating(new char[]{'T', 'e', 'n', 'e', 't', '\0'}, 8.0);
        list.displayMoviesReverse();
        
        scanner.close();
    }
}


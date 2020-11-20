package com.company.homework8;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        Movie[] movies = new Movie[10];

        for (int i = 0; i < 10; i++) {
            String Movie = scanner.nextLine();
            Movie movie = new Movie(Movie, random.nextInt(100));
            movies[i] = movie;
        }
        for (int i = 0; i < movies.length; i++) {
            for (int j = 0; j < movies.length - i - 1; j++) {
                if (movies[j].getReting() < movies[j + 1].getReting()) {
                    Movie temp = movies[j];
                    movies[j] = movies[j + 1];
                    movies[j + 1] = temp;
                }
            }

        }
        for (Movie movie : movies) {
            if (movie.getReting() == movies[0].getReting()) {
                System.out.println("Name" + movie.getMovie() + "REting" + movie.getReting());
                System.out.println();
            }
        }

    }

}


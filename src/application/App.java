package application;

import application.entities.Client;

public class App {

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Client c = new Client(1, "Ana Clara");
        System.out.println(c);

        Client c1 = new Client(1, "Ana Julia");
        System.out.println(c1);


    }
}

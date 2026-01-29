package Lvl1.Ex3;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<String, String> countries = CapitalGame.createMap();
        System.out.println("Game start\n" + "Insert user name:");
        String user = sc.nextLine();
        int score = CapitalGame.game(countries,user);
        CapitalGame.saveScore(user,score);
        sc.close();
    }
}

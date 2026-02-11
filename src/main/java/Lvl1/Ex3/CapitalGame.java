package Lvl1.Ex3;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CapitalGame {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> countries = new HashMap<>();

        String route = "src/main/resources/countries.txt";
        BufferedReader reader = null;

        try {
            FileReader fileReader = new FileReader(route);
            reader = new BufferedReader(fileReader);
            String line;
            while ((line = reader.readLine()) != null) {
                String[] countryCapital = line.split("\\s+", 2);
                if (!line.trim().isEmpty()) {
                    countries.put(countryCapital[0].trim(), countryCapital[1].trim());
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.err.println("Error al cerrar el archivo: " + e.getMessage());
                }
            }
        }
        return countries;
    }

    public static int game(HashMap<String,String> countries, String user) {

        ArrayList<String> gameCountries = new ArrayList<>(countries.keySet());
        Scanner scanner = new Scanner(System.in);

        System.out.println("Okey " + user + "\nYou have to name the capitals of the 10 countries I'm about to list, let's start...");
        int score = 0;

        for (int i = 0; i < 10; i++) {

            String country = gameCountries.get((int) (Math.random() * (gameCountries.size())));
            System.out.println(country);
            String answer = scanner.nextLine().trim();
            String capital = countries.get(country);

            if (answer.equalsIgnoreCase(capital)) {
                score++;
                System.out.println("Correct " + score + " points.");
            } else {
                System.out.println("Wrong the capital is " + capital);
            }

            gameCountries.remove(country);

        }
        return score;
    }

    public static void saveScore(String user, int score) {
        BufferedWriter bufferedWriter = null;

        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\Marc\\Desktop\\Archivos It\\users.txt", true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(user + " " + score);
            bufferedWriter.newLine();
        } catch (IOException e) {
            System.out.println("Error,user.txt not found " +e.getMessage());
        } finally {
            if (bufferedWriter != null) {
                try{
                    bufferedWriter.close();
                } catch (IOException e) {
                    System.out.println("Error closing BufferedWriter " + e.getMessage());
                }

            }
        }

    }
}
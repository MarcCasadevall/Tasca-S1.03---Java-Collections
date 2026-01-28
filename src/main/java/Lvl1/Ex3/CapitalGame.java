package Lvl1.Ex3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class CapitalGame {

    public static HashMap<String, String> map() {
        HashMap<String, String> countries = new HashMap<>();

        String route = "C:/Users/Marc/Desktop/Archivos It/countries.txt";
        BufferedReader reader = null;

        try {
            FileReader fileReader = new FileReader(route);
            reader = new BufferedReader(fileReader);
            String line;
            while ((line = reader.readLine()) != null) {
                String[] countryCapital = line.split("\\s+");
                countries.put(countryCapital[0], countryCapital[1]);
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
}
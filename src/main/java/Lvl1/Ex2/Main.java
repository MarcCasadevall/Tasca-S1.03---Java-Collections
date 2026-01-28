package Lvl1.Ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> llista1 = new ArrayList<Integer>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> llista2 = new ArrayList<Integer>();

        ListIterator<Integer> listIterator = llista1.listIterator();

        while (listIterator.hasNext()) {
            listIterator.next();
        }

        while (listIterator.hasPrevious()) {
            llista2.add(listIterator.previous());
        }

        System.out.println("Lista nº1 en orden ascendente: " + llista1 + "\nLista nº2 en orden inverso: " + llista2);
    }
}

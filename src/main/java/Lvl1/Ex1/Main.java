package Lvl1.Ex1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        System.out.println("Aqui recorro l'ArrayList con un for each");
        ArrayList<Month> months = createList();
        for (Month month : months) {
            System.out.println(month.getName());
        }
        System.out.println("Aqui recorro el HashSet con un iterator");
        HashSet<Month> uniqueMonths = new HashSet<>(months);

        Iterator<Month> iterator = uniqueMonths.iterator();
        while (iterator.hasNext()) {
            Month month = iterator.next();
            System.out.println(month.getName());
        }
    }

    public static ArrayList<Month> createList() {
        ArrayList<Month> months = new ArrayList<>();

        Month enero = new Month("Enero");
        Month febrero = new Month("Febrero");
        Month marzo = new Month("Marzo");
        Month abril = new Month("Abril");
        Month mayo = new Month("Mayo");
        Month junio = new Month("Junio");
        Month julio = new Month("Julio");
        Month septiembre = new Month("Septiembre");
        Month octubre = new Month("Octubre");
        Month noviembre = new Month("Noviembre");
        Month diciembre = new Month("Diciembre");

        months.add(enero);
        months.add(febrero);
        months.add(marzo);
        months.add(abril);
        months.add(mayo);
        months.add(junio);
        months.add(julio);
        months.add(septiembre);
        months.add(octubre);
        months.add(noviembre);
        months.add(diciembre);

        Month agosto = new Month("Agosto");
        months.add(7, agosto);

        Month noviembre2 = new Month("Noviembre");
        Month diciembre2 = new Month("Diciembre");
        months.add(noviembre2);
        months.add(diciembre2);
        return months;
    }
}

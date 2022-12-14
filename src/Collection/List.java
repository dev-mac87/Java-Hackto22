package Collection;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {

        // deklarasi Array
        String[] heroes = new String[2];
        heroes[0] = "Superman";
        heroes[1] = "Spiderman";
        //heroes[2] = "zeus"; // error ArrayIndexOutOfBoundsException karena ukuran Array tetap

        // menggunakan ArrayList
        java.util.List<String> planets = new ArrayList<>();
        planets.add("mercury"); // method add() untuk menambahkan objek ke List
        planets.add("venus");
        planets.add("earth");
        planets.add("mars"); // objek lainnya masih bisa terus ditambahkan ke List

        System.out.println("List planets awal:");
        for (int i = 0; i < planets.size(); i++) { // method size() untuk mendapatkan ukuran List
            // method get() untuk melihat isi List pada index i
            System.out.println("\t index-"+ i +" = " + planets.get(i));
        }

        planets.remove("mercury"); // method remove() untuk mengeluarkan objek dari List
        System.out.println("List planets akhir:");
        for (int i = 0; i < planets.size(); i++) {
            System.out.println("\t index-"+ i +" = " + planets.get(i));
        }

        // filter data collection mengandung kata earth
        System.out.println("List planets dengan filter:");
        planets.stream().filter(s -> s.contains("earth")).forEach(x -> {

            java.util.List<String> newPlanets = new ArrayList<>();
            newPlanets.add(x);

            for (int i = 0; i < newPlanets.size(); i++) {
                System.out.println("\t index-"+ i +" = " + newPlanets.get(i));
            }
        });
    }
}

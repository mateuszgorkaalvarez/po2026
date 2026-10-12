package agh.po.lab2;
import java.util.ArrayList;
import java.util.Random;


public class LottoMatiego {
    public static void main(String[] args) {
        ArrayList<Integer> loteria = new ArrayList<>();
        ArrayList<Integer> liczbyuzytkownika = new ArrayList<>();
        int randomLiczba;

        Random r = new Random();

        for (int i = 0; i < 6; i++) {
            randomLiczba = r.nextInt(50);
            if (loteria.contains(randomLiczba)) {
                randomLiczba = r.nextInt(50);
            }
            loteria.add(randomLiczba);
        }
        for (int i = 0; i < 6; i++) {
            liczbyuzytkownika.add(Integer.parseInt((args[i])));
        }
        System.out.println(loteria);
        System.out.println(liczbyuzytkownika);
        loteria.retainAll(liczbyuzytkownika);
        System.out.println("Trafiono: " + loteria.size());
    }
}

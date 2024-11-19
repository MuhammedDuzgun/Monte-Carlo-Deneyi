package com.muhammed;

import java.util.Random;

public class Main {
    static int sayacBeklenenDurum = 0;
    static int sayacDenemeSayisi = 1000;
    static double olasilik;

    public static void main(String[] args) {

        /*
         * iki zar atiliyor. ikisinin de 6-6 gelme olasiligini monte-carlo yontemi ile bulalım.
         * */
        Random random = new Random();
        int max = 6;
        int min = 1;
        for (int i = 1; i <= sayacDenemeSayisi; i++) {
            int zarDeger1 = min +  random.nextInt(max - min + 1);
            int zarDeger2 = min +  random.nextInt(max - min + 1);
            System.out.println(i + ". deneme" + ": Zar deger1: " + zarDeger1 + " Zar deger2: " + zarDeger2);
            if (zarDeger1 == 6 && zarDeger2 == 6) {
                sayacBeklenenDurum++;
            }
        }
        System.out.println("Beklenen Durum: " + sayacBeklenenDurum + " Defa gerçekleşti");
        olasilik = ((double) sayacBeklenenDurum / sayacDenemeSayisi) * 100;

        System.out.println("Olasilik: %" + olasilik);
    }
}